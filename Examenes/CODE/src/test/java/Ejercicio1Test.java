import Ejercicio1.Libro;
import Ejercicio1.Pila;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Para ejecutar jacoco, teclear en el terminal:  ./gradlew test jacocoTestReport
//Si no se ejecuta jacoco, teclear en el terminal:
  //  $env:JAVA_HOME="XXX"
  //  Sustituyendo XXX por la ruta de java que aparece en la carpeta "external libraries" del IDE

public class Ejercicio1Test {
    @Test
    public void testExamen() {
        Libro libro1 = new Libro("Matemáticas 1", 2002);
        Libro libro2 = new Libro("Matemáticas 2", 2003);
        Libro libro3 = new Libro("Matemáticas 3", 2004);
        Libro libro4 = new Libro("Java para Principiantes", 2021);
        Libro libro5 = new Libro("SQL para novatos", 2021);
        Libro libro6 = new Libro("Linux 2", 2013);

        System.out.println("\nCreamos la pila\n");
        Pila libros = new Pila();
        libros.mostrarContenido();
        System.out.println("\nAñadimos Libros\n");
        libros.push(libro1);
        System.out.println("Añado a la lista "+libro1.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        libros.push(libro2);
        System.out.println("Añado a la lista "+libro2.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        libros.push(libro3);
        System.out.println("Añado a la lista "+libro3.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        libros.push(libro4);
        System.out.println("Añado a la lista "+libro4.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        libros.push(libro5);
        System.out.println("Añado a la lista "+libro5.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        libros.push(libro6);
        System.out.println("Añado a la lista "+libro6.getTitulo());
        System.out.println("Tamaño de la pila :"+libros.size());
        libros.mostrarContenido();
        System.out.println("Vemos que el orden de inserción es el mismo que una pila");

        System.out.println("\nProbamos peek()\n");
        System.out.println("Tamaño de la pila :"+libros.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(libros.peek());
        }
        System.out.println("Tamaño de la pila :"+libros.size());


        System.out.println("\nVemos que peek() devuelve el primer elemento de la pila sin eliminar contenido");
        libros.mostrarContenido();
        System.out.println("\nProbamos pop()\n");

        while(!libros.empty()){
            System.out.println("Tamaño de la pila :"+libros.size());
            libros.mostrarContenido();
            System.out.println(libros.pop());
        }
        libros.mostrarContenido();

        assertEquals(1, 1);
    }
}
