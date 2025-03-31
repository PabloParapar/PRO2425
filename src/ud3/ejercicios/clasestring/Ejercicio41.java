package src.ud3.ejercicios.clasestring;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio41 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 41\n" + "Crea una aplicación que cuente las letras y las palabras de una cadena de texto:");
        String cadena;
        cadena = ingresarCadena(entrada);
        contarPalabrasYLetras(cadena);
    }

    public static void contarPalabrasYLetras(String texto) {
        int contadorPalabras = 1;
        int contadorLetras = 0;
        texto = texto.trim();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.isEmpty()) {
                System.out.println("El texto está vacío");
                contadorPalabras = 0;
                break;
            } else if (Character.isLetter(texto.charAt(i))) {
                contadorLetras++;
            } else if (Character.isWhitespace(texto.charAt(i))) {
                contadorPalabras++;
            }
        }
        System.out.println(texto +
                "\nNº Palabras = " + contadorPalabras +
                "\nNº Letras = " + contadorLetras);
    }
}