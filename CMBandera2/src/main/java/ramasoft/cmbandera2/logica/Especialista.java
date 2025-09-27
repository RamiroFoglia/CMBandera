package ramasoft.cmbandera2.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author BarrileteCosmico
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Especialista extends Persona{
    //Variables
    @Basic
    private String matricula;
    private String especialidad;
    
    //Constructores
    public Especialista() {
    }   

    public Especialista(String matricula, String especialidad, int id_persona, String nombre, String apellido, String celular, String fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }
    
    
    //Getter y Setter
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }
   
    
    
}
