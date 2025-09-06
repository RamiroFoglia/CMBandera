package ramasoft.cmbandera.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ramasoft.cmbandera.logica.Especialista;
import ramasoft.cmbandera.logica.Persona;
import ramasoft.cmbandera.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    //Variables Controladoras
    PersonaJpaController persJpa = new PersonaJpaController();
    EspecialistaJpaController espJpa = new EspecialistaJpaController();
    PacienteJpaController pasJpa = new PacienteJpaController();
    
    //Metodos psra la clase Persona
    public void crearPersona(Persona p) {
        persJpa.create(p);
    }
    public void eliminarPersona(int id) {
        try {
            persJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarPersona(Persona p) {
        try {
            persJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Persona traerPersona(int id) {
        return  persJpa.findPersona(id);
    }
    public ArrayList<Persona> traerListaPersonas() {
        List<Persona> listTemp = persJpa.findPersonaEntities();
        ArrayList<Persona> listaFinal = new ArrayList<>(listTemp);
        return listaFinal;
    }

    //Metodos para la clase Especialista
    public void crearEspecialista(Especialista e) {
       espJpa.create(e);
    }
    public void eliminarEspecialista(int id) {
        try {
            espJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarEspecialista(Especialista p) {
        try {
            espJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Especialista traerEspecialista(int id) {
        return espJpa.findEspecialista(id);
    }
    public ArrayList<Especialista> traerListaEspecialista() {
        List<Especialista> listaTemp = espJpa.findEspecialistaEntities();
        ArrayList<Especialista> listaFinal = new ArrayList<>(listaTemp);
        return listaFinal;
    }
    
    
    
 

   

}
