package src.ud4.coche;

public class Marca {
    String nombre;

    public Marca() {
    }

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
