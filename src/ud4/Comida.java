package src.ud4;

/**
 * @author lopparpab
 */
public interface Comida {
    enum PlatoPrincipal implements Comida {
        //implements indica que cumple con las restricciones de la interfaz
        BACALAO, RAXO, PULPO
    }

    enum Postre implements Comida {
        HELADO, TARTA
    }
}
