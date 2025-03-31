package src.ud4.colecciones;

import java.util.Objects;

public class Articulito {
    private String nombre;
    private Integer cantidad;

    public Articulito(String nombre) {
        this.nombre = nombre;
    }

    public Articulito(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    /*
    Generamos los métodos equals y hashCode
    donde seleccionamos los atributos con los que queremos trabajar
    Los campos que no incluyamos en el equals no los incluirá en el hashCode
     */

    @Override
    public String toString() {
        if(cantidad != null) {
            return "Articulito{" +
                    "nombre='" + nombre + '\'' +
                    ", cantidad=" + cantidad +
                    '}';
        } else {
            return "Articulito{" +
                    "nombre='" + nombre + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulito that = (Articulito) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
