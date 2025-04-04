package src.ud4;

public class Generico<T> {

    // T es el parámetro de tipo genérico.
    // Debe ser una sola letra y estar en mayúsculas
    private T objeto;

    Generico(T o) {
        objeto = o;
    }

    T getObjeto() {
        return objeto;
    }

    void mostrarTipo() {
        System.out.println("El tipo de T es: " + objeto.getClass().getName());
    }

}
