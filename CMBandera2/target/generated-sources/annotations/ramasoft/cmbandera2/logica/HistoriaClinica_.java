package ramasoft.cmbandera2.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera2.logica.Consulta;
import ramasoft.cmbandera2.logica.Paciente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-28T21:39:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HistoriaClinica.class)
public class HistoriaClinica_ { 

    public static volatile SingularAttribute<HistoriaClinica, Paciente> paciente;
    public static volatile SingularAttribute<HistoriaClinica, String> observaciones;
    public static volatile SingularAttribute<HistoriaClinica, Integer> idHistoriaClinica;
    public static volatile ListAttribute<HistoriaClinica, Consulta> consultas;

}