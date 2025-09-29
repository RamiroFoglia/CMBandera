package ramasoft.cmbandera2.logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class HistoriaClinica implements Serializable {

    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idHistoriaClinica;
    @Basic
    private String observaciones;
    @OneToMany(mappedBy = "hisClinica")
    private ArrayList<Consulta> consultas;
    @OneToOne
    private Paciente paciente;

    //Constructores
    public HistoriaClinica() {
    }
    public HistoriaClinica(int idHistoriaClinica, String observaciones, ArrayList<Consulta> consultas, Paciente paciente) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.observaciones = observaciones;
        this.consultas = consultas;
        this.paciente = paciente;
    }

    

    //Getter y Setter
    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }
    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    } 
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public String toString() {
        return "HistoriaClinica{" + "ID=" + idHistoriaClinica + ", Observaciones= " + observaciones + ", Consultas= " + consultas + ", Paciente= " + paciente.identificarse() + '}';
    }     
}
