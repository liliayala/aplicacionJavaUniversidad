package universidadproyecto.AccesoADatos;

import java.sql.Connection;
import universidadproyecto.Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadproyecto.Entidades.Tutor;

public class MateriaData {
     private TutorData tutorData = new TutorData();
     private Connection connection = null;

    public MateriaData() {
        connection = Conexion.ConexcionDB();
    }

        // METODO DE INSERCIÓN NUEVA MATERIA    
    public void guardarMateria(Materia materia) {
        
            String sql = "INSERT INTO materia(nombre,anio,estado,idTutor)VALUES(?,?,?,?)";
            
            try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getTutor().getIdTutor());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Agredada exitosamente 😄😄");
            } else {

                JOptionPane.showMessageDialog(null, "No se pudo egragar materia");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a materia ");
        }

    }
        //SELLECCIONANDO INFO DE MATERIA PORSU ID
    public Materia buscarMateria(int id) {

        Materia materia = null;

        String sql = "SELECT nombre,anio,estado,idTutor FROM materia WHERE idMateria =? AND estado = 1";
       // PreparedStatement ps = null;

        try {
          PreparedStatement  ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();

                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(true);
                Tutor tutor = tutorData.buscarTutor(rs.getInt("idTutor"));
                materia.setTutor(tutor);

            } else {

                JOptionPane.showMessageDialog(null, "Materia seleccionada no existe! O verifique id ingresado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a materia");
        }
        return materia;
    }

    // MODIFICAR NOMBRE Y EL AÑO DE LA MATERIA POR SU ID
    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre = ?, anio = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Materia Modificada exitosamente 😄😄");

            } else {

                JOptionPane.showMessageDialog(null, "No se pudo modificar materia,verifique id");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la informacion materia");
        }
    }
    // DANDO DE BAJA A UNA MATERIA, PASANDOLO A ESTADO 0
    public void eliminarMateria(int id){
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null, "Se dio de baja a la materia seleccionada 😄😄");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar, corrobore el id ingresado!");
            }
            ps.close();
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null, "Error al acceder a materias");
        }
        
    }
        // listar toda info de materias
    public List<Materia> listarMateria() {
        List<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                Tutor tutor = tutorData.buscarTutor(rs.getInt("idTutor"));
                materia.setTutor(tutor);
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a materia");
        }
        return materias;
    }

}
