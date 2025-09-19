package ramasoft.cmbandera.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ramasoft.cmbandera.logica.HistoriaClinica;
import ramasoft.cmbandera.logica.TipoSangre;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-09-18T18:55:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, TipoSangre> tipoSangre;
    public static volatile SingularAttribute<Paciente, HistoriaClinica> historiaClinica;
    public static volatile SingularAttribute<Paciente, String> obraSocial;

}