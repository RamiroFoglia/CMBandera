package ramasoft.cmbandera2.percistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ramasoft.cmbandera2.logica.Consulta;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.HistoriaClinica;
import ramasoft.cmbandera2.logica.Paciente;
import ramasoft.cmbandera2.logica.Persona;
import ramasoft.cmbandera2.percistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author BarrileteCosmico
 */
public class ControladoraPersistencia {
    EspecialistaJpaController espeJpa = new EspecialistaJpaController();
    PersonaJpaController perJpa = new PersonaJpaController();
    PacienteJpaController paciJpa = new PacienteJpaController();
    ConsultaJpaController consJpa = new ConsultaJpaController();
    HistoriaClinicaJpaController hisJpa = new HistoriaClinicaJpaController();

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
    
    //Metodos para la clase Paciente
    public void crearPaciente(Paciente p) {
        paciJpa.create(p);
    }
    public void editarPaciente(Paciente p) {
        try {
            paciJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarPaciente(int idPaciente) {
        try {
            paciJpa.destroy(idPaciente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Paciente traerPaciente(int idPaciente) {
        return  paciJpa.findPaciente(idPaciente);
    }  

    public ArrayList<Paciente> traerListaPacientes() {
         List<Paciente> listTemp = paciJpa.findPacienteEntities();
        ArrayList<Paciente> listaFinal = new ArrayList<>(listTemp);
        return listaFinal;
    }

    //Metodos para la clase Consulta
    public void crearConsulta(Consulta c) {
        consJpa.create(c);
    }
    public void eliminarConsulta(int idConsulta) {
        try {
            consJpa.destroy(idConsulta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarConsulta(Consulta c) {
        try {
            consJpa.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Consulta traerConsulta(int idConsulta) {
        return consJpa.findConsulta(idConsulta);
    }
    public ArrayList<Consulta> traerListaConsultas() {
        List<Consulta> listTemp = consJpa.findConsultaEntities();
        ArrayList<Consulta> listFinal = new ArrayList<>(listTemp);
        return listFinal;
    }

    //Metodos para la clase HistoriaClinica
    public void crearHistoriaClinica(HistoriaClinica hc) {
        hisJpa.create(hc);
    }
    public void eliminarHistoriaClinica(int id) {
        try {
            hisJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarHistoriaClinica(HistoriaClinica hc) {
        try {
            hisJpa.edit(hc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public HistoriaClinica traerHistoriaClinica(int id) {
        return hisJpa.findHistoriaClinica(id);
    }
    public ArrayList<HistoriaClinica> traerListaHistoriasClinicas() {
        List<HistoriaClinica> listTemp = hisJpa.findHistoriaClinicaEntities();
        ArrayList<HistoriaClinica> listFinal = new ArrayList<>(listTemp);
        return listFinal;
    }    
}
