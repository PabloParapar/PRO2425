package src.UD3.Ejercicios.ClasesEnvoltorio;

import java.util.Scanner;

public class Ejercicio45 {
    public static void ejercicio45(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 45\n" + "Excribe una aplicación que compruebe si un NIF es correcto:");
        String cadena = entrada.next();
        comprobarNIF(cadena);
    }

    public static void comprobarNIF(String texto) {
        String comprobante = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (texto.length() == 9 && Character.isLetter(texto.charAt(8)) && Character.isDigit(texto.charAt(0)) && Character.isDigit(texto.charAt(1)) && Character.isDigit(texto.charAt(2)) && Character.isDigit(texto.charAt(3)) && Character.isDigit(texto.charAt(4)) && Character.isDigit(texto.charAt(5)) && Character.isDigit(texto.charAt(6)) && Character.isDigit(texto.charAt(7))) {
            Integer dni = Integer.valueOf(texto.substring(0, 8));
            Character letraDNI = Character.toUpperCase(texto.charAt(8));
            if (comprobante.charAt(dni % 23) == letraDNI) {
                System.out.println("El NIF " + texto.toUpperCase() + " es correcto");
            } else {
                System.out.println("El NIF " + texto.toUpperCase() + " no es correcto");
            }
        } else {
            System.out.println("Este no es un NIF correcto");
        }
    }
}