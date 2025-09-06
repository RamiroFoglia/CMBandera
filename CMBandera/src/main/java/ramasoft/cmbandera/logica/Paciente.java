package ramasoft.cmbandera.logica;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Paciente extends Persona {
    //Variables   
    private String obraSocial;//crear clase ObraSocial
//    private HistoriaClinica historiaClinica;
    private TipoSangre tipoSangre;
    private ArrayList<Consulta> listaConsultas;

    //Constructores
    public Paciente() {
    }   

    public Paciente(String obraSocial, TipoSangre tipoSangre, ArrayList<Consulta> listaConsultas, int id_persona, String nombre, String apellido, String celular, Date fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.obraSocial = obraSocial;
        this.tipoSangre = tipoSangre;
        this.listaConsultas = listaConsultas;
    }
   

    //Metodos
    public String getObraSocial() {
        return obraSocial;
    }
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
//    public HistoriaClinica getHistoriaClinica() {
//        return historiaClinica;
//    }
//    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
//        this.historiaClinica = historiaClinica;
//    }
    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }
    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    @Override
    public String toString() {
        return "Paciente{" + "obraSocial=" + obraSocial + ", tipoSangre=" + tipoSangre + ", listaConsultas=" + listaConsultas + '}';
    }
    
    
    
    public void mostrarConsultas(){
        for (Consulta listaConsulta : listaConsultas) {
            System.out.println("--> " + listaConsulta);
        }
    }
    
    
    
    
    

}
