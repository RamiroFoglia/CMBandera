package ramasoft.cmbandera.logica;

import java.util.Date;

/**
 *
 * @author BarrileteCosmico
 */
public class Consulta {
    //Variables
    private int id;
    private Date fecha;
    private String detalle;
    private Especialista doctor;
    
    //Constructores    
    public Consulta() {
    }
    public Consulta(int id, Date fecha, String detalle, Especialista doctor) {
        this.id = id;
        this.fecha = fecha;
        this.detalle = detalle;
        this.doctor = doctor;
    }   
    
    //Metodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Especialista getDoctor() {
        return doctor;
    }
    public void setDoctor(Especialista doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ID= " + id + ", Fecha=" + fecha + ", Detalle=" + detalle + ", Doctor=" + doctor + '}';
    }   
}
