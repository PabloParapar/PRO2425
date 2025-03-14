package src.ud3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio42 {
    public static void ejercicio42(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 42\n" + "Escribe una aplicación que reciba una cadena de texto y devuelva su acrónimo:");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        crearAcronimo(cadena);
    }

    public static void crearAcronimo(String texto) {
        String acronimo = "";
        texto = texto.trim();
        acronimo += texto.charAt(0);
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i)) && Character.isLetter(texto.charAt(i + 1))) {
                acronimo += texto.charAt(i + 1);
            }
        }
        acronimo = acronimo.toUpperCase();
        System.out.println(texto + "\nSu acrónimo es = " + acronimo);
    }
}