package ramasoft.cmbandera.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera.logica.Especialista;
import ramasoft.cmbandera.logica.HistoriaClinica;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-07T12:16:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Especialista> doctor;
    public static volatile SingularAttribute<Consulta, Date> fecha;
    public static volatile SingularAttribute<Consulta, HistoriaClinica> histoCli;
    public static volatile SingularAttribute<Consulta, Integer> id;
    public static volatile SingularAttribute<Consulta, String> detalle;

}