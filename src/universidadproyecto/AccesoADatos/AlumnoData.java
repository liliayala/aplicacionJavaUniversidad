
package universidadproyecto.AccesoADatos;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import universidadproyecto.Entidades.Alumno;




public class AlumnoData {
    
   private  Connection connection = null;
  

    public AlumnoData() {
        connection = Conexion.ConexcionDB();
    }
   
   
   public void guardarAlumno(Alumno alumno){
   
     String sql = "insert into alumno(DNI,nombre,apellido,fechaNacimiento,estado)values(?,?,?,?,?)";
     
       try {
           PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, alumno.getDNI());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//localDate a Date
            ps.setBoolean(5, alumno.isEstado()); 
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            //verificando si se ingreso correctamente con su id
            if(rs.next()){
            alumno.setIdAlumno(1);
            JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente 😄😄😄");
            }
            
            //cerrando el preparedStatement de esta consulta
            ps.close();
       } catch (SQLException ex ) {
          JOptionPane.showMessageDialog(null, "Ocurrio un error en la inserción 😱");
       }
     
   }
  
   public Alumno buscarAlumno(int id){
   Alumno alumno = null;
   String sql = "SELECT  DNI, nombre, apellido, fechaNacimiento, estado FROM alumno WHERE idAlumno = ? AND estado = 1";
   PreparedStatement ps = null;
   
       try {
           ps = connection.prepareStatement(sql);
           ps.setInt(1, id);
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next()){
               alumno = new Alumno();
               alumno.setIdAlumno(id);
               alumno.setDNI(rs.getInt("DNI"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
               alumno.setEstado(true);
               
           }else{
           JOptionPane.showMessageDialog(null, "No existe el alumno😱😱");
           }
           ps.close();
           
       } catch (SQLException ex ) {
           JOptionPane.showMessageDialog(null, "Se produjo un error😱😱");
       }catch(NullPointerException nx){
           JOptionPane.showMessageDialog(null, "El Alumno no existe o ya se dio de baja anteriormente");
       }
       return alumno;
   }
   
   public Alumno buscarAlumnoPorDni(int dni){
       Alumno alumno = null;
       
       String sql = "SELECT idAlumno,DNI,nombre,apellido,fechaNacimiento FROM alumno WHERE DNI = ? AND estado = 1";
       PreparedStatement ps = null;
       
       try {
           ps = connection.prepareStatement(sql);
           ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               alumno = new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setDNI(rs.getInt(("DNI")));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
               alumno.setEstado(true);
               
           }else{
           JOptionPane.showMessageDialog(null, "No existe el alumno😱😱");
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Se produjo un error en la busqueda😱😱");
       }
       return alumno;
   }
   
   
   public  List<Alumno> listarAlumnos(){
       List<Alumno> alumnos = new ArrayList<>();
       
       String sql = "SELECT * FROM alumno WHERE estado = 1";
       try {
           PreparedStatement ps = connection.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               Alumno alumno = new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setDNI(rs.getInt("DNI"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setEstado(rs.getBoolean("estado"));
               alumnos.add(alumno);   
           }
           ps.close();
        
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo acceder a los datos😱😱");
       }
        return alumnos;
   }
   
   public void modificarAlumno(Alumno alumno){
   
       String sql = "UPDATE alumno SET dni = ?, nombre= ?, apellido= ?, fechaNacimiento=? WHERE DNI = ?";
        PreparedStatement ps = null;
        
       try {
           ps = connection.prepareStatement(sql);
           ps.setInt(1, alumno.getDNI());
           ps.setString(2, alumno.getNombre());
           ps.setString(3, alumno.getApellido());
           ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()) );
           ps.setInt(5, alumno.getIdAlumno());
           int exito = ps.executeUpdate();
           
           if(exito==1){
               JOptionPane.showMessageDialog(null, "Modificado Correctamente 😄😄");
           }else{
               JOptionPane.showMessageDialog(null, "El alumno no exite😱😱");
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Se produjo un error al acceder al registro de Alumnos");
       }
       
   }
  
   public void eliminarAlumno(int dni){
   
   String sql = "UPDATE alumno SET estado = 0 WHERE DNI = ?";
       try {
           PreparedStatement ps = connection.prepareStatement(sql);
           ps.setInt(1, dni);
           int fila = ps.executeUpdate();
           if(fila==1){
           
           JOptionPane.showMessageDialog(null,"Eliminado correctamente 😄😄");
           
           }else{
           
           JOptionPane.showMessageDialog(null,"El alumno no existe o ya se encuentra dado de baja");
           }
           ps.close();
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a los datos de alumno");
       }
   }
   
}
