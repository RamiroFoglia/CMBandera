package ramasoft.cmbandera.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-07T12:16:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Persona.class)
public abstract class Persona_ { 

    public static volatile SingularAttribute<Persona, Date> fechaNac;
    public static volatile SingularAttribute<Persona, Integer> id_persona;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, String> celular;
    public static volatile SingularAttribute<Persona, String> nombre;

}