package ramasoft.cmbandera.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta implements Serializable {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic
    private String detalle;
    @OneToOne
    private Especialista doctor;
    @ManyToOne
    private HistoriaClinica histoCli;
    
    //Constructores    
    public Consulta() {
    }
    public Consulta(int id, Date fecha, String detalle, Especialista doctor, HistoriaClinica histoCli) {
        this.id = id;
        this.fecha = fecha;
        this.detalle = detalle;
        this.doctor = doctor;
        this.histoCli = histoCli;
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

    public HistoriaClinica getHistoCli() {
        return histoCli;
    }

    public void setHistoCli(HistoriaClinica histoCli) {
        this.histoCli = histoCli;
    }

    @Override
    public String toString() {
        return "Consulta{" + "id=" + id + ", fecha=" + fecha + ", detalle=" + detalle + ", doctor=" + doctor + ", histoCli=" + histoCli + '}';
    }
       
    
    public String armarConsulta(){
        String consulta = "\t[Fecha]= "+this.fecha+"\t[Doctor/a]= "+ this.doctor.identificarse()+"\t[Detalle]= " + this.detalle;
        return consulta;      
        
    }
}
