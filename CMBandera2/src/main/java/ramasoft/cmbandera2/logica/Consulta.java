package ramasoft.cmbandera2.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Consulta implements Serializable {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inConsulta;
    @Basic
    private String fecha;
    private String detalle;
    @OneToOne
    private Especialista doctor;
    @ManyToOne
    private HistoriaClinica hisClinica;
    
    //Constructores
    public Consulta() {
    }
    public Consulta(int inConsulta, String fecha, String detalle, Especialista doctor, HistoriaClinica hisClinica) {
        this.inConsulta = inConsulta;
        this.fecha = fecha;
        this.detalle = detalle;
        this.doctor = doctor;
        this.hisClinica = hisClinica;
    }
    
    //Getter y Setter
    public int getInConsulta() {
        return inConsulta;
    }
    public void setInConsulta(int inConsulta) {
        this.inConsulta = inConsulta;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
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
    public HistoriaClinica getHisClinica() {
        return hisClinica;
    }
    public void setHisClinica(HistoriaClinica hisClinica) {
        this.hisClinica = hisClinica;
    }

    @Override
    public String toString() {
        return "Consulta{" + "inConsulta=" + inConsulta + ", fecha=" + fecha + ", detalle=" + detalle + ", doctor=" + doctor + ", hisClinica=" + hisClinica + '}';
    }    
    
}
