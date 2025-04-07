package src.ud4.coche;

public class Modelo {
    String nombre;

    public Modelo(String nombre) {
        this.nombre = nombre;
    }

    public Modelo() {
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
