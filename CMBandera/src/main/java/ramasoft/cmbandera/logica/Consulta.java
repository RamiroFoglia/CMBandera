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
    private int id_consulta;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic
    private String detalle;
    @OneToOne
    private Especialista doctor;
    @ManyToOne
    HistoriaClinica hisClinica;
    
    //Constructores    
    public Consulta() {
    }
    public Consulta(int id_consulta, Date fecha, String detalle, Especialista doctor, HistoriaClinica hisClinica) {
        this.id_consulta = id_consulta;
        this.fecha = fecha;
        this.detalle = detalle;
        this.doctor = doctor;
        this.hisClinica = hisClinica;
    }
       
    //Metodos   
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
    public int getId_consulta() {
        return id_consulta;
    }
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }
    public HistoriaClinica getHisClinica() {
        return hisClinica;
    }
    public void setHisClinica(HistoriaClinica hisClinica) {
        this.hisClinica = hisClinica;
    }    

    @Override
    public String toString() {
        return "Fecha= " + fecha + "----- Detalle= " + detalle + "----- Doctor=" + doctor + '}';
    }   

   
}
