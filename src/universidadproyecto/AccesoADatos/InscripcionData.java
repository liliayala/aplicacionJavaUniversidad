
package universidadproyecto.AccesoADatos;

import java.sql.Connection;
import universidadproyecto.Entidades.Inscripcion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadproyecto.Entidades.Alumno;
import universidadproyecto.Entidades.Materia;



public class InscripcionData {
    private  Connection connection = null;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData mateData = new MateriaData();
  
    public InscripcionData() {
        connection = Conexion.ConexcionDB();
    }
    
            //guardarInscripcion
    public void guardarInscripcion(Inscripcion inscripto) {
        
        String sql = "INSERT INTO inscripcion( idAlumno,idMateria,nota)VALUES (?,?,?)";
        try{
         PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ps.setInt(1, inscripto.getAlumno().getIdAlumno());
         ps.setInt(2,inscripto.getMateria().getIdMateria());
         ps.setDouble(3, inscripto.getNota());
         ps.executeUpdate();
         ResultSet rs = ps.getGeneratedKeys();
         
         if(rs.next()){
         inscripto.setIdInscripcion(rs.getInt(1));
         JOptionPane.showMessageDialog(null, "Alumno Inscripto Correctamente😄😄");
         }
         ps.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "😱😱Ocurrio un error!😱😱");
        
    }
    }
                    // actualizarNota
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada exitosamente 😄😄😄");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a inscripciones");
        }

    }
                //borrarInscripcionAlumnoMateria
    public void borrarInscripcionAlumnoMateria(int idAlumno, int idMateria) {
        String sql = "DELETE  FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada Exitosamente 😄😄");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a inscripciones");
        }

    }
                            //obtenerInscripciones() 
    public List<Inscripcion> obtenerInscripciones(){
 
        List<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscrip = new Inscripcion();
                inscrip.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                inscrip.setAlumno(alu);
                inscrip.setMateria(mate);
                inscrip.setNota(rs.getDouble("nota"));
                cursadas.add(inscrip);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a inscripciones");
        }
        return cursadas;
    }
                        //obtenerInscripcionesPorAlumno PROBADO CON EXITO
    public List<Inscripcion> obtenerInscripcionesPorAlumno( int idAlu) {
    List<Inscripcion> inscripcionAlumno = new ArrayList<>();
    
    String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
              ps.setInt(1, idAlu);
              ResultSet rs = ps.executeQuery();
              
               while (rs.next()) {
                Inscripcion inscrip = new Inscripcion();
                inscrip.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                inscrip.setAlumno(alu);
                inscrip.setMateria(mate);
                inscrip.setNota(rs.getDouble("nota"));
                inscripcionAlumno.add(inscrip);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a inscripciones");
        }
        return inscripcionAlumno;
}
    
                    //obtenerMateriasCursadas PROBADA CON EXITO 
         public List<Materia> obtenerMateriasCursadas(int idAlum){
                List<Materia> materiacursada = new ArrayList<>();
      
                String sql = "SELECT inscripcion.idMateria,materia.nombre,anio, nota FROM inscripcion  JOIN materia ON materia.idMateria = inscripcion.idMateria  WHERE inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1, idAlum);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()){
            Materia materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
            Inscripcion inscripcion = new Inscripcion();
            
            inscripcion.setNota(rs.getDouble("nota"));
            materiacursada.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a inscripciones");
        }
        return materiacursada;
         }
    
                            // obetenerMateriaNoCursada PROBADO CON EXITO
         public List<Materia> obetenerMateriaNoCursada(int idAlum){
         ArrayList<Materia> materias = new ArrayList<>();
                
         String sql = "SELECT * FROM materia WHERE idMateria NOT IN "
                 + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
         
         try {
            PreparedStatement ps = connection.prepareStatement(sql);
             ps.setInt(1, idAlum);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()){
            Materia materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
            materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a inscripciones");
        }
         
        return materias;
          
         }
         
        public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
         ArrayList<Alumno> alumnosMateria = new ArrayList<>();
         String sql = "SELECT alumno.idAlumno, DNI, alumno.nombre, apellido, fechaNacimiento, alumno.estado FROM alumno JOIN inscripcion ON inscripcion.idAlumno = alumno.idAlumno WHERE idMateria = ?";
//         String sql= "SELECT alumno.idAlumno, DNI, alumno.nombre, apellido, fechaNacimiento, alumno.estado FROM inscripcion JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno JOIN materia ON inscripcion.idMateria = materia.idMateria WHERE materia.idMateria = ?";
    
    try {
        PreparedStatement ps=connection.prepareStatement(sql); 
        ps.setInt(1, idMateria);
        
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            
            Alumno alumno=new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDNI(rs.getInt("DNI"));
            alumno.setApellido(rs.getString("apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setEstado(rs.getBoolean("estado"));
            alumnosMateria.add(alumno);
        }
       
        ps.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar acceder a una de las tablas");
        
        
    }
    return alumnosMateria;
         
        } 
        
        public List<Inscripcion> obtenerInscripciones2(){
 
        List<Inscripcion> cursadas = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscrip = new Inscripcion();
                inscrip.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("idMateria"));
                inscrip.setAlumno(alu);
                inscrip.setMateria(mate);
                inscrip.setNota(rs.getDouble("nota"));
                cursadas.add(inscrip);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al acceder a inscripciones");
        }
        return cursadas;
    }
                        //obtenerInscripcionesPorAlumno PROBADO CON EXITO
    public List<Inscripcion> obtenerNota( int idAlu) {
    List<Inscripcion> notaAlumno = new ArrayList<>();
    
    String sql = "SELECT nota FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
              ps.setInt(1, idAlu);
              ResultSet rs = ps.executeQuery();
              
               while (rs.next()) {
                Inscripcion inscrip = new Inscripcion();
                inscrip.setNota(rs.getDouble("nota"));
                notaAlumno.add(inscrip);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar acceder a inscripciones");
        }
        return notaAlumno;
        
        
    }
        
//     private List<Inscripcion> obtenerInscripcionesQuery(String sql) {
//        List<Inscripcion> inscripciones = new ArrayList<>();
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Alumno a = new Alumno(rs.getInt("idAlumno"), rs.getInt("DNI"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado"));
//               
//                Materia m = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("estado"));
//                 Inscripcion i = new Inscripcion(rs.getInt("idInscripcion"), rs.getInt("nota"), a, m);
//                
//                inscripciones.add(i);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
//        }
//        return inscripciones;
//    }
//        
//   public List<Inscripcion> obtenerInscripciones() {
//        String sql = "SELECT idInscripcion, m.idMateria, m.nombre, nota, m.estado, a.idAlumno, DNI, apellido, a.nombre, fechaNacimiento, a.estado, anio FROM inscripcion i "
//                + "JOIN alumno a ON i.idAlumno = a.idAlumno "
//                + "JOIN materia m ON i.idMateria = m.idMateria ";
//        return obtenerInscripcionesQuery(sql);
//   }
   
}