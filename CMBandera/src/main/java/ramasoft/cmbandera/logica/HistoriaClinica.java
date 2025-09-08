package ramasoft.cmbandera.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HistoriaClinica implements Serializable {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;    
    @OneToMany(mappedBy = "histoCli")
    private ArrayList<Consulta> consultas;
    
    //Constructores
    public HistoriaClinica() {
    }
    public HistoriaClinica(int id, Date fechaNac, ArrayList<Consulta> consultas) {
        this.id = id;
        this.fechaNac = fechaNac;
        this.consultas = consultas;
    }
    
    //Metodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Fecha de Nacimiento: " + fechaNac + "\t";
        
    }
       
}
