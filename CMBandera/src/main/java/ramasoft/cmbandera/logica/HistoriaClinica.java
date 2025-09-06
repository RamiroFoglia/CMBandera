package ramasoft.cmbandera.logica;

import java.util.ArrayList;
import java.util.Date;

public class HistoriaClinica {
    //Variables
    private int id;
    private Date fechaNac;    
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
