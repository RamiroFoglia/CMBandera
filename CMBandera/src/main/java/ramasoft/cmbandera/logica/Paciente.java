package ramasoft.cmbandera.logica;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Paciente extends Persona {
    //Variables 
    @Basic
    private String obraSocial;//crear clase ObraSocial
    @OneToOne
    private HistoriaClinica historiaClinica;
    private TipoSangre tipoSangre;
    

    //Constructores
    public Paciente() {
    } 
    public Paciente(String obraSocial, HistoriaClinica historiaClinica, TipoSangre tipoSangre, int id_persona, String nombre, String apellido, String celular, Date fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.obraSocial = obraSocial;
        this.historiaClinica = historiaClinica;
        this.tipoSangre = tipoSangre;
    }   

    //Metodos
    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "obraSocial=" + obraSocial + ", historiaClinica=" + historiaClinica + ", tipoSangre=" + tipoSangre + '}';
    }
         
    public void verHistoriaClinica(){
        this.historiaClinica.verConsultas();
    }
    
    
    
    
    

}
