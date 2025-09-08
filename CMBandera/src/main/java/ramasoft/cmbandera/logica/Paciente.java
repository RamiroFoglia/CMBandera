package ramasoft.cmbandera.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Paciente extends Persona {

    //Variables  
    @Basic
    private String obraSocial;//crear clase ObraSocial    
    private TipoSangre tipoSangre;
    @OneToOne
    private HistoriaClinica historiaClinica;

    //Constructores
    public Paciente() {
    }
    public Paciente(String obraSocial, TipoSangre tipoSangre, HistoriaClinica historiaClinica, int id_persona, String nombre, String apellido, String celular, Date fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.obraSocial = obraSocial;
        this.tipoSangre = tipoSangre;
        this.historiaClinica = historiaClinica;
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
        return "Paciente{" + "obraSocial=" + obraSocial + ", tipoSangre=" + tipoSangre + ", historiaClinica=" + historiaClinica + '}';
    }   
        
}


