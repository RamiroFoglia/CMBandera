package ramasoft.cmbandera.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {
    //Variables   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;  
    @Basic
    private String nombre;
    private String apellido;
    private String celular;   
    @Temporal(TemporalType.DATE)
    private Date fechaNac;       
    
    //COnstructores
    public Persona() {
    }
    public Persona(int id_persona, String nombre, String apellido, String celular, Date fechaNac) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }     
    public int getId_persona() {
        return id_persona;
    }

    //Metodos
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
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    @Override
    public String toString() {
        return "Persona{" + "Id= " + id_persona + ", nombre= " + nombre + ", apellido= " + apellido + ", celular= " + celular + ", fechaNac=" + fechaNac + '}';
    } 
    public String identificarse(){
        return this.getApellido() + ", " + this.getNombre();
    }
}
