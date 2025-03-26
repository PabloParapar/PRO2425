package src.ud4;

/**
 * @author lopparpab
 */
public enum Numero {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS;

    int getValue() {
        return ordinal() + 1;
    }
}
