package ramasoft.cmbandera;

import ramasoft.cmbandera.persistencia.ControladoraPersistencia;
import ramasoft.cmbandera.ventanas.Inicio;

public class Principal {

    public static void main(String[] args) {
        ControladoraPersistencia control = new ControladoraPersistencia();
        Inicio iniciar = new Inicio();
        iniciar.setVisible(true);

    }
}
