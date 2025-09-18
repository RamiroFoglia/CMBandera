package ramasoft.cmbandera.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ramasoft.cmbandera.logica.Consulta;
import ramasoft.cmbandera.logica.Especialista;
import ramasoft.cmbandera.logica.HistoriaClinica;
import ramasoft.cmbandera.logica.Paciente;
import ramasoft.cmbandera.logica.Persona;
import ramasoft.cmbandera.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    //Variables Controladoras
    PersonaJpaController persJpa = new PersonaJpaController();
    EspecialistaJpaController espJpa = new EspecialistaJpaController();
    PacienteJpaController pasJpa = new PacienteJpaController();
    ConsultaJpaController consJpa = new ConsultaJpaController();
    HistoriaClinicaJpaController hisClJpa = new HistoriaClinicaJpaController();
    
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

    //Metodos para la clase Pacinete
    public void crearPaciente(Paciente p) {
        pasJpa.create(p);
    }
    public void eliminarPaciente(int id) {
        try {
            pasJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarPaciente(Paciente p) {
        try {
            pasJpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Paciente traerPaciente(int id) {
        return pasJpa.findPaciente(id);
    }
    public ArrayList<Paciente> traerListaPacinete() {
        List<Paciente> listaTemp = pasJpa.findPacienteEntities();
        ArrayList<Paciente> listaFinal = new ArrayList<>(listaTemp);
        return listaFinal;
    }

    //Metodos para la clase Consulta
    public void crearConsulta(Consulta c) {
        consJpa.create(c);
    }
    public void eliminarConsulta(int id) {
        try {
            consJpa.destroy(id);
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
    public Consulta traerConsulta(int id) {
        return consJpa.findConsulta(id);
    }
    public ArrayList<Consulta> traerListaConsulta() {
        List<Consulta> listaTemp = consJpa.findConsultaEntities();
        ArrayList<Consulta> listaFinal = new ArrayList<>(listaTemp);
        return listaFinal;
    }

    //Metodos para la clase HistoriaClinica
    public void crearHistoriaClinica(HistoriaClinica hc) {
        hisClJpa.create(hc);
    }
    public void eliminarHistoriaClinica(int id) {
        try {
            hisClJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarHistoriaClinica(HistoriaClinica c) {
        try {
            hisClJpa.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public HistoriaClinica traerHistoriaClinica(int id) {
        return  hisClJpa.findHistoriaClinica(id);
    }
    public ArrayList<HistoriaClinica> traerListaHistoriaClinica() {
        List<HistoriaClinica> listaTemp = hisClJpa.findHistoriaClinicaEntities();
        ArrayList<HistoriaClinica> listaFinal = new ArrayList<HistoriaClinica>();
        return listaFinal;
    }

}
