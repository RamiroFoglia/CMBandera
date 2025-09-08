package ramasoft.cmbandera.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera.logica.Consulta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-07T12:16:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HistoriaClinica.class)
public class HistoriaClinica_ { 

    public static volatile SingularAttribute<HistoriaClinica, Date> fechaNac;
    public static volatile ListAttribute<HistoriaClinica, Consulta> consultas;
    public static volatile SingularAttribute<HistoriaClinica, Integer> id;

}