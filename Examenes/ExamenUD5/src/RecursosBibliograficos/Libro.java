package RecursosBibliograficos;

import Interface.Prestable;
import Personas.Autor;

public class Libro extends RecursoBibliografico implements Prestable {
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, int anoPublicacion, boolean disponible) {
        super(titulo, anoPublicacion, disponible);
    }
    public Libro(String titulo, int anoPublicacion, boolean disponible, Autor autor) {
        super(titulo, anoPublicacion, disponible);
        this.autor = autor;
        autor.setLibro(this);
    }

    @Override
    public String mostrarInformacion() {
        return "Libro{" +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public void prestar() {
        if (this.disponible){
            System.out.println("Se ha prestado el libro "+this.titulo);
            this.disponible = false;
        } else {
            System.out.println("El libro "+this.titulo+" no está disponible");
        }
    }

    @Override
    public void devolver() {
        if (!this.disponible){
            System.out.println("Se ha devuelto el libro "+this.titulo);
            this.disponible = true;
        } else {
            System.out.println("El libro "+this.titulo+" ya está en la biblioteca");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
        if(autor.getLibro() != this) {
            autor.setLibro(this);
        }
    }
}
