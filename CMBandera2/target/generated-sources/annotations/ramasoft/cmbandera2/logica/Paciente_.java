package ramasoft.cmbandera2.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera2.logica.HistoriaClinica;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-28T21:39:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, String> tipoDeSangre;
    public static volatile SingularAttribute<Paciente, String> obraSocial;
    public static volatile SingularAttribute<Paciente, HistoriaClinica> histoClinica;

}