
package universidadproyecto.Entidades;


public class Tutor {
    private int idTutor;
    private String nombreTutor;
    private String apellidoTutor;
    private int dniTutor;
    private boolean estadoTutor;

    public Tutor() {
    }

    public Tutor(int idTutor, String nombreTutor, String apellidoTutor, int dniTutor, boolean estadoTutor) {
        this.idTutor = idTutor;
        this.nombreTutor = nombreTutor;
        this.apellidoTutor = apellidoTutor;
        this.dniTutor = dniTutor;
        this.estadoTutor = estadoTutor;
    }

    public Tutor(String nombreTutor, String apellidoTutor, int dniTutor, boolean estadoTutor) {
        this.nombreTutor = nombreTutor;
        this.apellidoTutor = apellidoTutor;
        this.dniTutor = dniTutor;
        this.estadoTutor = estadoTutor;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getApellidoTutor() {
        return apellidoTutor;
    }

    public void setApellidoTutor(String apellidoTutor) {
        this.apellidoTutor = apellidoTutor;
    }

    public int getDniTutor() {
        return dniTutor;
    }

    public void setDniTutor(int dniTutor) {
        this.dniTutor = dniTutor;
    }

    public boolean isEstadoTutor() {
        return estadoTutor;
    }

    public void setEstadoTutor(boolean estadoTutor) {
        this.estadoTutor = estadoTutor;
    }

    @Override
    public String toString() {
        return idTutor + ", " + nombreTutor + " "+ apellidoTutor + " dni:" + dniTutor + ", " + estadoTutor ;
    }
    
    
}
