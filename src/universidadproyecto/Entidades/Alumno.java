
package universidadproyecto.Entidades;

import java.time.LocalDate;


public class Alumno {
    private int idAlumno;
    private int DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, int DNI, String nombre, String apellido, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(int DNI, String nombre, String apellido, LocalDate fechaNacimiento, boolean estado) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idAlumno + ", " + DNI + ", " + nombre + ", " + apellido ;
    }
    
    
    
}
