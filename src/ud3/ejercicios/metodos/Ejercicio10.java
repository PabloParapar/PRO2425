package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio10 extends Ejercicio {
    private Ejercicio10() {
    }

    public static void resolverEjercicio(Scanner entrada) {
        entrada.nextLine();
        System.out.println("""
            Boletin 3 | Ejercicio 10
        Escribir una aplicación que solicite una entrada en formato nombre completo de usuario, DNI
        La aplicación deberá localizar la posición del separador (la coma) y mostrar por separado el DNI y el nombre en mayúsculas.:""");

        String datos = ingresarCadena(entrada);
        String nombre = datos.substring(0,datos.indexOf(",")).toUpperCase();
        String dni = datos.substring(datos.indexOf(",")+1).trim().toUpperCase();
        System.out.println("Nombre:\t"+nombre);
        System.out.println("DNI:\t"+dni);
    }
}