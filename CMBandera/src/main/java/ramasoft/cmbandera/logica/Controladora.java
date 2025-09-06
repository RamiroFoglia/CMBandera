package ramasoft.cmbandera.logica;

import java.util.ArrayList;
import ramasoft.cmbandera.persistencia.ControladoraPersistencia;


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
}