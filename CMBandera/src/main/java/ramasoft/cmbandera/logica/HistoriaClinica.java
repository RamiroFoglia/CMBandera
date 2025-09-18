package ramasoft.cmbandera.logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class HistoriaClinica implements Serializable {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String datosDestacados;   
    @OneToMany(mappedBy = "hisClinica")
    private ArrayList<Consulta> consultas;
    
    //Constructores
    public HistoriaClinica() {
    }
    public HistoriaClinica(int id, String datosDestacados, ArrayList<Consulta> consultas) {
        this.id = id;
        this.datosDestacados = datosDestacados;
        this.consultas = consultas;
    }
       
    //Metodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }   
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    public String getDatosDestacados() {
        return datosDestacados;
    }
    public void setDatosDestacados(String datosDestacados) {
        this.datosDestacados = datosDestacados;
    }
    @Override
    public String toString() {
        return "HistoriaClinica{" + "id=" + id + ", datosDestacados=" + datosDestacados + ", consultas=" + consultas + '}';
    }   
    
    public void verConsultas(){
        for (Consulta consulta : consultas) {
            System.out.println("==>> " + consulta.toString());
        }
    }
    
       
}
