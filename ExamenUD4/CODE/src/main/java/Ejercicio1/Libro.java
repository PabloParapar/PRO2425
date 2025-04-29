package Ejercicio1;

public class Libro {
    private String titulo;
    private Integer annoEdicion;

    public Libro() {
    }

    public Libro(String titulo, Integer annoEdicion) {
        this.titulo = titulo;
        this.annoEdicion = annoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnnoEdicion() {
        return annoEdicion;
    }

    public void setAnnoEdicion(Integer annoEdicion) {
        this.annoEdicion = annoEdicion;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", annoEdicion=" + annoEdicion +
                "}";
    }
}
