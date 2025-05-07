package Personas;

import RecursosBibliograficos.Libro;

public class Autor extends Persona{

    private Libro libro;        //Debería ser una lista

    public Autor() {
    }

    public Autor(String nombre, String apellido, String nif, int annoNacimiento) {
        super(nombre, apellido, nif, annoNacimiento);
    }

    public Autor(String nombre, String apellido, String nif, int annoNacimiento, int annoDefuncion, Libro libro) {
        super(nombre, apellido, nif, annoNacimiento, annoDefuncion);
        this.libro = libro;
        libro.setAutor(this);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "libro=" + libro +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", annoNacimiento=" + annoNacimiento +
                ", annoDefuncion=" + annoDefuncion +
                '}';
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
        libro.setAutor(this);
    }
}
