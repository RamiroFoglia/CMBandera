package ramasoft.cmbandera2.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author BarrileteCosmico
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable{
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;
    @Basic
    private String nombre;
    private String apellido;
    private String celular;
    private String fechaNac;

    //Constructores
    public Persona() {
    }    
    public Persona(int id_persona, String nombre, String apellido, String celular, String fechaNac) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }
    
    //Getter y Setter 
    public int getId_persona() {
        return id_persona;
    }
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return this.identificarse() + ", celular=" + celular + ", fechaNac=" + fechaNac + '}';
    }
    
    public String identificarse(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
}
