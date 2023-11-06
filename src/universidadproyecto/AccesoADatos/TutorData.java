
package universidadproyecto.AccesoADatos;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import universidadproyecto.Entidades.Tutor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import universidadproyecto.Entidades.Materia;

public class TutorData {
     private  Connection connection = null;

    public TutorData() {
         connection = Conexion.ConexcionDB();
    }
    
        // BUSCAR UN TUTOR POR SU ID
        public Tutor buscarTutor(int id){
         Tutor tutor = null;
     String sql = "SELECT * FROM tutor WHERE estadoTutor = 1";
     try{
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setInt(1, id);
          ResultSet rs = ps.executeQuery();
          if(rs.next()){
              tutor = new Tutor();
              tutor.setIdTutor(id);
              tutor.setNombreTutor(rs.getString("nombreTutor"));
              tutor.setApellidoTutor(rs.getString("apellidoTutor"));
              tutor.setDniTutor(rs.getInt("dniTutor"));
              tutor.setEstadoTutor(true);
          } else {

                JOptionPane.showMessageDialog(null, "Id de tutor seleccionada no existe!  verifique id ingresado");
            }
            ps.close();
     }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a la información de Tutores");
        }
     return tutor;
     }
   
        // BUSCAR UN TUTOR POR SU dni
         public Tutor buscarTutorPorDni(int dni){
         Tutor tutor = null;
     String sql = "SELECT * FROM tutor WHERE estadoTutor = 1";
     try{
         PreparedStatement ps = connection.prepareStatement(sql);
         ps.setInt(1, dni);
          ResultSet rs = ps.executeQuery();
          if(rs.next()){
              tutor = new Tutor();
              tutor.setDniTutor(dni);
              tutor.setIdTutor(rs.getInt("idTutor"));
              tutor.setNombreTutor(rs.getString("nombreTutor"));
              tutor.setApellidoTutor(rs.getString("apellidoTutor"));
              tutor.setDniTutor(rs.getInt("dniTutor"));
              tutor.setEstadoTutor(true);
          } else {

                JOptionPane.showMessageDialog(null, "Dni de tutor seleccionada no existe!  verifique dni ingresado");
            }
            ps.close();
     }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder la información de Tutores");
        }
     return tutor;
     }
     
         // LISTANDO TODA INFORMACIÓN DE TUTORES
         public List<Tutor> listadoTutores(){ 
         List<Tutor> tutores = new ArrayList<>();
         String sql = "SELECT idTutor,nombreTutor,apellidoTutor,dniTutor,estadoTutor FROM tutor";
         try {
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
             Tutor tutor = new Tutor();
             tutor.setIdTutor(rs.getInt("idTutor"));
             tutor.setNombreTutor(rs.getString("nombreTutor"));
             tutor.setApellidoTutor(rs.getString("apellidoTutor"));
             tutor.setDniTutor(rs.getInt("dniTutor"));
             tutor.setEstadoTutor(rs.getBoolean("estadoTutor"));
             tutores.add(tutor);
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a la información de tutores");
         }
         return tutores;
         }
         
         // DAR DE BAJA A UN TUTOR , PASANDO SU ESTADO A 0
          public void darDeBajaTutor(int dni){
            String sql = "UPDATE tutor SET estadoTutor = 0 WHERE dniTutor = ?";
         try {
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1, dni);
             int fila = ps.executeUpdate();
             if(fila == 1){
                 JOptionPane.showMessageDialog(null, "Tutor dado de baja exitosamente!");
             }else{
                 JOptionPane.showMessageDialog(null, "Ocurrio un error, verifique dni ingresado!");
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder al registro de tutores");
         }
          }
                  
        // AGREGAR NUEVO TUTOR EN LA BASE DE DATOS
        public void nuevoTutor(Tutor tutor) {
        String sql = "INSERT INTO tutor(nombreTutor,apellidoTutor,dniTutor,estadoTutor)VALUES(?,?,?,true)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tutor.getNombreTutor());
            ps.setString(2, tutor.getApellidoTutor());
            ps.setInt(3, tutor.getDniTutor());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Tutor agregado axitosamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error en la insercción, verifique datos ingresados");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error! intente nuevamente!");
        }
    }
        
     public List<Materia> obtenerMateriaPorTutor( int idTutor){
    
         List<Materia> materiacursada = new ArrayList<>();
      
                String sql = "SELECT nombre,anio,estado FROM materia WHERE idTutor = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1, idTutor);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()){
            Materia materia = new Materia();
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
           materia.setEstado(rs.getBoolean("estado"));
            materiacursada.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a materias");
        }
        return materiacursada;
         }  
}
