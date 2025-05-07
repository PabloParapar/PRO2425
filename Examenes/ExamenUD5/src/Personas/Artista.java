package Personas;

import RecursosBibliograficos.CD;

public class Artista extends Persona {
    private CD cd;      //Debería ser una lista

    public Artista() {
    }

    public Artista(String nombre, String apellido, String nif, int annoNacimiento) {
        super(nombre, apellido, nif, annoNacimiento);
    }

    public Artista(String nombre, String apellido, String nif, int annoNacimiento, int annoDefuncion, CD cd) {
        super(nombre, apellido, nif, annoNacimiento, annoDefuncion);
        this.cd = cd;
        cd.setArtista(this);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "cd=" + cd +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", annoNacimiento=" + annoNacimiento +
                ", annoDefuncion=" + annoDefuncion +
                '}';
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
        if (cd.getArtista() != this) {
            cd.setArtista(this);    //Añadimos el cd al artista y a la vez el artista al cd
        }
    }
}
