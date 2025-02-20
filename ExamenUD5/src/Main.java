import Personas.Artista;
import Personas.Autor;
import RecursosBibliograficos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1º Creamos Recursos Bibliográficos");
        Libro donQuijote = new Libro("Don Quijote de la Mancha", 1620, true);
        Revista muyInteresante = new Revista("Muy Interesante", 2025, true, 1);
        CD motomami = new CD("Motomami", 2022, true);
        System.out.println(
        donQuijote.mostrarInformacion()+"\n"+
        muyInteresante.mostrarInformacion()+"\n"+
        motomami.mostrarInformacion()
        );
        System.out.println("2º Creamos Personas");
        Artista rosalia = new Artista("Rosalia", "Motomami", "32323232f", 1995);
        Autor cervantes = new Autor("Don", "Cervantes", "desconocido", 1600);
        System.out.println(
                rosalia.toString()+"\n"+
                cervantes.toString()
        );

        System.out.println("3º Asignamos Recursos Bibliográficos a Personas");

        rosalia.setCd(motomami);
        donQuijote.setAutor(cervantes);

        System.out.println(
                donQuijote.mostrarInformacion()+"\n"+
                        muyInteresante.mostrarInformacion()+"\n"+
                        motomami.mostrarInformacion()
        );

        System.out.println(
                rosalia.toString()+"\n"+
                cervantes.toString()
        );
        System.out.println("4º Prestamos y Devolvemos");
        System.out.println(donQuijote.isDisponible());
        donQuijote.prestar();
        System.out.println(donQuijote.isDisponible());
        donQuijote.devolver();
        System.out.println(donQuijote.isDisponible());
    }
}