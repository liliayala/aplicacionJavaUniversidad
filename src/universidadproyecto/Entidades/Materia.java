
package universidadproyecto.Entidades;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;
    private boolean estado;
    private Tutor tutor;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anio, boolean estado,Tutor tutor) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.tutor = tutor;
    }

    public Materia(String nombre, int anio, boolean estado,Tutor tutor) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
         this.tutor = tutor;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    

    @Override
    public String toString() {
        return    nombre +", "+  anio + tutor ;
    }
    
    
}
