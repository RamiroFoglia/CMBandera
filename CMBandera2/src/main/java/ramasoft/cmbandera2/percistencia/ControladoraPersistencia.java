package ramasoft.cmbandera2.percistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.Persona;
import ramasoft.cmbandera2.percistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author BarrileteCosmico
 */
public class ControladoraPersistencia {
    EspecialistaJpaController espeJpa = new EspecialistaJpaController();
    PersonaJpaController perJpa = new PersonaJpaController();

    //Metodos para la clase Persona
    public void crearPersona(Persona p) {
        perJpa.create(p);
    }
    public void eliminarPersona(int id) {
        try {
            perJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarPersona(Persona p) {
        try {
            perJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Persona traerPersona(int id) {
        return perJpa.findPersona(id);
    }
    public ArrayList<Persona> traerListaPersonas() {
        List<Persona> listTemp = perJpa.findPersonaEntities();
        ArrayList<Persona> listFinal = new ArrayList<>(listTemp);
        return listFinal;
    }

    //Metodos para la clase Especialista
    public void crearEspecialista(Especialista e) {
        espeJpa.create(e);
    }
    public void eliminarEspecialista(int id) {
        try {
            espeJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarEspecialista(Especialista p) {
        try {
            espeJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Especialista traerEspecialista(int id) {
        return  espeJpa.findEspecialista(id);
    }
    public ArrayList<Especialista> traerListaEspecialista() {
        List<Especialista> listTemp = espeJpa.findEspecialistaEntities();
        ArrayList<Especialista> listFinal = new ArrayList<>(listTemp);
        return listFinal;
    }
}
