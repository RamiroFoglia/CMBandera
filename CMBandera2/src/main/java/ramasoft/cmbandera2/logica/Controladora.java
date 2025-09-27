package ramasoft.cmbandera2.logica;

import java.util.ArrayList;
import java.util.List;
import ramasoft.cmbandera2.interfazGrafica.VentanaEspecialistas;
import ramasoft.cmbandera2.percistencia.ControladoraPersistencia;

/**
 *
 * @author BarrileteCosmico
 */
public class Controladora {
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();
     //Metodos para la clase Persona
    public void crearPersona(Persona p){
        controlPersi.crearPersona(p);        
    }
    public void eliminarPersona(int id){
        controlPersi.eliminarPersona(id);
    }
     public void editarPersona(Persona p){
        controlPersi.editarPersona(p);        
    }
     public Persona traerPersona(int id){
         return controlPersi.traerPersona(id);
     }
     public ArrayList<Persona> traerListaPersonas(){
         return controlPersi.traerListaPersonas();
     }
     
     //Metodos para la clase Especialista
     public void crearEspecialista(Especialista e){
         controlPersi.crearEspecialista(e);
     }
     public void eliminarEspecialista(int id){
         controlPersi.eliminarEspecialista(id);
     }
     public void editarEspecialista(Especialista p){
        controlPersi.editarEspecialista(p);        
    }
     public Especialista traerEspecialista(int id){
         return controlPersi.traerEspecialista(id);
     }
     public ArrayList<Especialista> traerListaEspecialista(){
         return controlPersi.traerListaEspecialista();
     }

    public void guardar(String nombre, String apellido, String celular, String fecha, String espe, String matricula) {
       Especialista profesional = new Especialista();
       
       profesional.setNombre(nombre);
       profesional.setApellido(apellido);
       profesional.setCelular(celular);
       profesional.setEspecialidad(espe);
       profesional.setFechaNac(fecha);
       profesional.setMatricula(matricula);
       
       controlPersi.crearEspecialista(profesional);
    }

    public List<VentanaEspecialistas> traerEspecialistas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
