package src.UD3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio44 {
    public static void ejercicio44(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 44\n" + "Escribe una aplicación donde ingreses un nombre y apellidos con varios espacios entre ellos y te devuelva el nombre con solo un espacio entre cada palabra:");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        System.out.println(cadena + "\nbien formateado es = '" + formatearNombre(cadena) + "'");
    }

    public static String formatearNombre(String texto) {
        String textoOriginal = texto;
        texto = texto.trim();
        String nombreFormateado = "";
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isWhitespace(texto.charAt(i))) {
                nombreFormateado = nombreFormateado + " " + texto.substring(0, i);
                texto = texto.substring(i).trim();
            }
        }
        nombreFormateado = nombreFormateado.trim() + " " + texto.trim();
        return nombreFormateado;
    }
}