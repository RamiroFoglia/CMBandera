package ramasoft.cmbandera2.logica;

import java.util.ArrayList;
import ramasoft.cmbandera2.percistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersi = new ControladoraPersistencia();

    //Metodos para la clase Persona
    public void crearPersona(Persona p) {
        controlPersi.crearPersona(p);
    }
    
    public void eliminarPersona(int id) {
        controlPersi.eliminarPersona(id);
    }
    
    public void editarPersona(Persona p) {
        controlPersi.editarPersona(p);
    }
    
    public Persona traerPersona(int id) {
        return controlPersi.traerPersona(id);
    }
    
    public ArrayList<Persona> traerListaPersonas() {
        return controlPersi.traerListaPersonas();
    }

    //Metodos para la clase Especialista
    public void crearEspecialista(Especialista e) {
        controlPersi.crearEspecialista(e);
    }
    
    public void eliminarEspecialista(int id) {
        controlPersi.eliminarEspecialista(id);
    }
    
    public void editarEspecialista(Especialista p) {
        controlPersi.editarEspecialista(p);
    }
    
    public Especialista traerEspecialista(int id) {
        return controlPersi.traerEspecialista(id);
    }
    
    public ArrayList<Especialista> traerListaEspecialista() {
        return controlPersi.traerListaEspecialista();
    }
    
    public void guardarEspecialista(String nombre, String apellido, String celular, String fecha, String espe, String matricula) {
        Especialista profesional = new Especialista();
        
        profesional.setNombre(nombre);
        profesional.setApellido(apellido);
        profesional.setCelular(celular);
        profesional.setEspecialidad(espe);
        profesional.setFechaNac(fecha);
        profesional.setMatricula(matricula);
        
        controlPersi.crearEspecialista(profesional);
    }

    //Metodos para la clase Paciente
    public void crearPaciente(Paciente p) {
        controlPersi.crearPaciente(p);
    }
    
    public void eliminarPacinete(int idPaciente) {
        controlPersi.eliminarPaciente(idPaciente);
    }
    
    public void editarPaciente(Paciente p) {
        controlPersi.editarPaciente(p);
    }
    
    public Paciente traerPaciente(int idPaciente) {
        return controlPersi.traerPaciente(idPaciente);
    }
    
    public ArrayList<Paciente> traerListaPacientes() {
        return controlPersi.traerListaPacientes();
    }

    public void guardarPaciente(String nombre, String apellido, String celular, String fecha, String tipoSangre, String obraSocial) {
        Paciente paciente = new Paciente();
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setCelular(celular);
        paciente.setFechaNac(fecha);
        paciente.setTipoDeSangre(tipoSangre);
        paciente.setObraSocial(obraSocial);
        
        controlPersi.crearPaciente(paciente);
    }

    //Metodos para la clase Consultas
    public void crearConsulta(Consulta c) {
        controlPersi.crearConsulta(c);
    }
    
    public void eliminarConsulta(int idConsulta) {
        controlPersi.eliminarConsulta(idConsulta);
    }
    
    public void editarConsulta(Consulta c) {
        controlPersi.editarConsulta(c);
    }
    
    public Consulta traerConsulta(int idConsulta) {
        return controlPersi.traerConsulta(idConsulta);
    }
    
    public ArrayList<Consulta> traerListaConsultas() {
        return controlPersi.traerListaConsultas();
    }

    //Metodos para la clase HistoriaClinica
    public void crearHistoriaClinica(HistoriaClinica hc) {
        controlPersi.crearHistoriaClinica(hc);
    }
    
    public void eliminarHistoriaClinica(int id) {
        controlPersi.eliminarHistoriaClinica(id);
    }
    
    public void editarHistoriaClinica(HistoriaClinica hc) {
        controlPersi.editarHistoriaClinica(hc);
    }
    
    public HistoriaClinica traerHistoriaClinica(int id) {
        return controlPersi.traerHistoriaClinica(id);
    }
    
    public ArrayList<HistoriaClinica> traerListaHistoriasClinicas() {
        return controlPersi.traerListaHistoriasClinicas();
    }    
}
