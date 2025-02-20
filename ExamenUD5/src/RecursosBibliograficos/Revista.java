package RecursosBibliograficos;

import Interface.Prestable;

public class Revista extends RecursoBibliografico implements Prestable {

    private int numero;

    public Revista() {
    }

    public Revista(String titulo, int anoPublicacion, boolean disponible, int numero) {
        super(titulo, anoPublicacion, disponible);
        this.numero = numero;
    }

    @Override
    public String mostrarInformacion() {
        return "Revista{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public void prestar() {
        if (this.disponible){
            System.out.println("Se ha prestado la revista "+this.titulo + " número "+this.numero);
            this.disponible = false;
        } else {
            System.out.println("La revista "+this.titulo+" número "+this.numero+" no está disponible");
        }
    }

    @Override
    public void devolver() {
        if (!this.disponible){
            System.out.println("Se ha devuelto la revista "+this.titulo + " número "+this.numero);
            this.disponible = true;
        } else {
            System.out.println("La revista "+this.titulo+" número "+this.numero+" ya está en la biblioteca");
        }
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
