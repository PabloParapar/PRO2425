package src.UD3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio38 {
    public static void ejercicio38(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 38\n" + "Sin utilizar los métodos equals() o equalsIgnoreCase(), escribe un método que reciba dos cadenas e indique si son iguales o no:");
        System.out.println("\nIngresa dos cadenas de caracteres:");
        String cadena1 = entrada.next();
        String cadena2 = entrada.next();
        compararStrings(cadena1, cadena2);
    }

    public static void compararStrings(String cadena1, String cadena2) {
        boolean cadenasComparadas = true;
        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < cadena1.length(); i++) {
                cadenasComparadas &= (cadena1.charAt(i) == cadena2.charAt(i));
            }
            if (cadenasComparadas) {
                System.out.println(cadena1 + " y " + cadena2 + " son iguales");
            } else {
                System.out.println(cadena1 + " y " + cadena2 + " no son iguales");
            }
        } else {
            System.out.println(cadena1 + " y " + cadena2 + " no son iguales");
        }
    }
}