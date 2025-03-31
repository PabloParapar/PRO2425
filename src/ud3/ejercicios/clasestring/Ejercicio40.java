package src.ud3.ejercicios.clasestring;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio40 extends Ejercicio {
    /// Ejercicio 39 sobrecargas
    /*
    private static boolean esPalindromoA(String texto, boolean soloLetras){

    }*/
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 40\n" + "Escribir un método que reciba dos cadenas e indique si la segunda es una subsecuencia de la primera:");
        System.out.println("\nIngresa las dos cadenas a comprobar:");
        entrada.nextLine();
        String cadena1 = ingresarCadena(entrada);
        String cadena2 = ingresarCadena(entrada);
        comprobarSubcadena(cadena1, cadena2);
    }

    public static void comprobarSubcadena(String cadena1, String cadena2) {
        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();
        boolean esSubcadena = false;
        for (int i = 0; i < longitud1 - longitud2; i++) {
            esSubcadena |= cadena1.substring(i, longitud2 + i).equals(cadena2);
        }
        if (esSubcadena) {
            System.out.println(cadena2 + " es subcadena de " + cadena1);
        } else {
            System.out.println(cadena2 + " no es subcadena de " + cadena1);
        }
    }
}