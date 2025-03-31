package src.ud3.ejercicios.clasestring;

import src.ud3.ejercicios.Ejercicio;
import src.ud3.ejercicios.metodosrecursivos.Ejercicio20;

import java.util.Scanner;

public class Ejercicio39 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 39\n" + "Escribe un método que reciba una palabra y que determine si es un palíndromo o no:");
        int numeroMetodo = ingresarEntero(entrada);
        while (numeroMetodo != 0) {
            switch (numeroMetodo) {
                case 1: //método iterativo que compara los caracteres uno a uno
                    String cadenaA = ingresarCadena(entrada);
                    if (esPalindromoA(cadenaA)) {
                        System.out.println(cadenaA + " es un palíndromo");
                    } else {
                        System.out.println(cadenaA + " no es un palíndromo");
                    }
                    break;
                case 2: //método iterativo que invierte la cadena y la compara con la original
                    String cadenaB = ingresarCadena(entrada);

                    if (esPalindromoB(cadenaB)) {
                        System.out.println(cadenaB + " es un palíndromo");
                    } else {
                        System.out.println(cadenaB + " no es un palíndromo");
                    }
                    break;
                case 3: //método con la clase StringBuilder
                    String cadenaC = ingresarCadena(entrada);
                    if (esPalindromoC(cadenaC)) {
                        System.out.println(cadenaC + " es un palíndromo");
                    } else {
                        System.out.println(cadenaC + " no es un palíndromo");
                    }
                    break;
                case 4: //método recursivo
                    String cadenaD = ingresarCadena(entrada);
                    if (Ejercicio20.esPalindromo(cadenaD)) {
                        System.out.println(cadenaD + " es un palíndromo");
                    } else {
                        System.out.println(cadenaD + " no es un palíndromo");
                    }
                    break;
            }
            numeroMetodo = ingresarEntero(entrada);
        }
    }

    public static boolean esPalindromoA(String texto) {
        boolean esPalindromo = true;
        for (int i = 0; i < texto.length(); i++) {
            esPalindromo &= (texto.charAt(i) == texto.charAt(texto.length() - 1 - i));
        }
        return esPalindromo;
    }

    public static boolean esPalindromoB(String texto) {
        boolean esPalindromo = true;
        String cadenaInversa = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            cadenaInversa = cadenaInversa.concat(texto.substring(i, i + 1));
        }
        for (int i = 0; i < texto.length(); i++) {
            esPalindromo &= (texto.charAt(i) == cadenaInversa.charAt(i));
        }
        return esPalindromo;
    }

    public static boolean esPalindromoC(String texto) {
        boolean esPalindromo = true;
        StringBuilder cadenaOriginal = new StringBuilder(texto);
        String cadenaInversa = cadenaOriginal.reverse().toString();
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            esPalindromo &= texto.charAt(i) == cadenaInversa.charAt(i);
        }
        return esPalindromo;
    }
}