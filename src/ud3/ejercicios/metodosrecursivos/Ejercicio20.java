package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

/**
 * @author lopparpab
 */
public class Ejercicio20 extends Ejercicio {
    private Ejercicio20() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 20
        Escribe un método lógico recursivo que determine si una cadena recibida por parámetro es un palíndromo:
        
        Ingresa la cadena a comprobar""");
        entrada.nextLine();
        String palindromo = ingresarCadena(entrada);

        if (esPalindromo(palindromo)) {
            System.out.println(palindromo + " es palíndromo");
        } else {
            System.out.println(palindromo + " no es palíndromo");
        }
    }

    /**
     *
     * @param texto
     * @return Devuelve un valor booleano conforme si el texto ingresado es un palíndromo o no
     */
    public static boolean esPalindromo(String texto) {
        int longitud = texto.length();
        if (longitud < 2) {
            return true;
        } else {
            return texto.charAt(0) == (texto.charAt(longitud - 1)) && esPalindromo(texto.substring(1, longitud - 1));
        }
    }
}