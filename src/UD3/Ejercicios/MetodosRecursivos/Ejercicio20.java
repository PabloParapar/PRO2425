package src.UD3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio20 {
    public static void ejercicio20(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 20\n" + "Escribe un método lógico recursivo que determine si una cadena recibida por parámetro es un palíndromo:");
        System.out.println("Ingresa la cadena a comprobar:");
        String palindromo = entrada.next();

        if (esPalindromo(palindromo)) {
            System.out.println(palindromo + " es palíndromo");
        } else {
            System.out.println(palindromo + " no es palíndromo");
        }
    }

    public static boolean esPalindromo(String texto) {
        int longitud = texto.length();
        if (longitud < 2) {
            return true;
        } else {
            return texto.charAt(0) == (texto.charAt(longitud - 1)) && esPalindromo(texto.substring(1, longitud - 1));
        }
    }
}