package examen;

import java.util.Scanner;

import static java.lang.Character.isWhitespace;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuántos casos quiere comprobar:");
        int cantidadCasos = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidadCasos; i++) {
            String cadena1 = entrada.nextLine();
            String cadena2 = entrada.nextLine();
            comprobarAnagrama(cadena1, cadena2);
        }
    }

    public static void comprobarAnagrama(String cadena1, String cadena2) {
        String primerTermino = formatearTexto(cadena1);
        String segundoTermino = formatearTexto(cadena2);
        //System.out.println(primerTermino + " " + segundoTermino);
        if (primerTermino.length() == segundoTermino.length()) {
            if (recorrerAnagrama(primerTermino, segundoTermino)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static boolean recorrerAnagrama(String primerTermino, String segundoTermino) {
        int longitud = primerTermino.length();
        //boolean existeCaracter = false;
        if (longitud <= 1) {
            return primerTermino.charAt(0) == segundoTermino.charAt(0);
        } else {
            for (int i = 0; i < primerTermino.length(); i++) {
                if (primerTermino.charAt(0) == segundoTermino.charAt(i)) {
                    primerTermino = primerTermino.substring(1);
                    segundoTermino = segundoTermino.substring(0, i) + segundoTermino.substring(i + 1);
                    break;
                }
                if (primerTermino.charAt(0) != segundoTermino.charAt(segundoTermino.length() - 1) && i == segundoTermino.length() - 1) {
                    return false;
                }
            }
            return true && recorrerAnagrama(primerTermino, segundoTermino);
        }
    }

    public static String formatearTexto(String texto) {
        //String textoOriginal = texto;
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            if (isWhitespace(texto.charAt(i))) {
                resultado = resultado + texto.substring(0, i);
                texto = texto.substring(i).trim();
            }
        }
        return (resultado + texto).toLowerCase().trim();
    }
}