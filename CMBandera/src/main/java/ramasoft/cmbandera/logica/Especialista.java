package ramasoft.cmbandera.logica;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_persona")
public class Especialista extends Persona {

    //Variables
    @Basic
    private String matricula;
    private Especialidades especialidad;

    //Constructore
    public Especialista() {
    }

    public Especialista(String matricula, Especialidades especialidad, int id_persona, String nombre, String apellido, String celular, Date fechaNac) {
        super(id_persona, nombre, apellido, celular, fechaNac);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    //Metodos
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Especialidades getEspecialista() {
        return especialidad;
    }
    public void setEspecialista(Especialidades especialista) {
        this.especialidad = especialista;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + ", " + this.getApellido() + ", matricula=" + matricula + ", especialidad=" + especialidad + '}';
    }

}
