package ramasoft.cmbandera2.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.HistoriaClinica;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-28T21:39:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Especialista> doctor;
    public static volatile SingularAttribute<Consulta, String> fecha;
    public static volatile SingularAttribute<Consulta, HistoriaClinica> hisClinica;
    public static volatile SingularAttribute<Consulta, Integer> inConsulta;
    public static volatile SingularAttribute<Consulta, String> detalle;

}