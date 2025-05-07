package RecursosBibliograficos;

import Interface.Prestable;
import Personas.Artista;

public class CD extends RecursoBibliografico implements Prestable {

    private Artista artista;

    public CD() {
    }

    public CD(String titulo, int anoPublicacion, boolean disponible) {
        super(titulo, anoPublicacion, disponible);
    }
    public CD(String titulo, int anoPublicacion, boolean disponible, Artista artista) {
        super(titulo, anoPublicacion, disponible);
        this.artista = artista;
        artista.setCd(this);
    }

    @Override
    public String mostrarInformacion() {
        return "CD{" +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public void prestar() {
        if (this.disponible){
            System.out.println("Se ha prestado el disco "+this.titulo);
            this.disponible = false;
        } else {
            System.out.println("El disco "+this.titulo+" no está disponible");
        }
    }

    @Override
    public void devolver() {
        if (!this.disponible){
            System.out.println("Se ha devuelto el disco "+this.titulo);
            this.disponible = true;
        } else {
            System.out.println("El disco "+this.titulo+" ya está en la biblioteca");
        }
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
        if(artista.getCd() != this) {
            artista.setCd(this);
        }
    }
}
