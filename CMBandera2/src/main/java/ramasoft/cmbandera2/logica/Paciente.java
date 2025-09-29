package ramasoft.cmbandera2.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Paciente extends Persona{
    //Variables
    @Basic
    private String obraSocial; //Crear una clase obraSocia
    @OneToOne
    private HistoriaClinica histoClinica;
    private String tipoDeSangre;
    
    //Constructores

    public Paciente(){
    }  
    public Paciente(String obraSocial, HistoriaClinica histoClinica, String tipoDeSangre, int id_persona, String nombre, String apellido, String celular, String fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.obraSocial = obraSocial;
        this.histoClinica = histoClinica;
        this.tipoDeSangre = tipoDeSangre;
    }    
    
    //Getter y Setter
    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    public HistoriaClinica getHistoClinica() {
        return histoClinica;
    }
    public void setHistoClinica(HistoriaClinica histoClinica) {
        this.histoClinica = histoClinica;
    }
    public String getTipoDeSangre() {
        return tipoDeSangre;
    }
    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }  

    @Override
    public String toString() {
        return "Paciente{" + identificarse() + "obraSocial=" + obraSocial + ", histoClinica=" + histoClinica + ", tipoDeSangre=" + tipoDeSangre + '}';
    }    
}
