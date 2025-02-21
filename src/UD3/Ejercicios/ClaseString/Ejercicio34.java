package src.UD3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio34 {
    public static void ejercicio34(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 34\n" + "Escribe una aplicación que lea del teclado una cadena de caracteres y muestre la siguiente información:");
        System.out.println("\nIngresa una cadena de caracteres:");
        String cadena = entrada.next();
        System.out.println("a. Longitud = " + cadena.length());
        if (cadena.length() >= 7) {
            System.out.println("b. 7º Caracter = " + cadena.charAt(6));
        } else {
            System.out.println("b. " + cadena + " no tiene un 7º Caracter");
        }
        if (cadena.indexOf("x") != -1) {
            System.out.println("c. la posición del caracter 'x' es " + cadena.indexOf("x"));
        } else {
            System.out.println("c. la cadena " + cadena + "no tiene el signo 'x'");
        }
        System.out.println("d. " + cadena.toUpperCase());
    }
}