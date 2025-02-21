package src.UD3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio43 {
    public static void ejercicio43(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 43\n" + "Muestra la distancia de Hamming entre dos números enteros:");
        int entero1 = entrada.nextInt();
        int entero2 = entrada.nextInt();
        calcularDistanciaHamming(entero1, entero2);
    }

    public static void calcularDistanciaHamming(int entero1, int entero2) {
        String cadena1 = Integer.toBinaryString(entero1);
        String cadena2 = Integer.toBinaryString(entero2);
        int contadorHamming = 0;
        if (cadena1.length() != cadena2.length()) {
            int distancia = Math.abs(cadena1.length() - cadena2.length());
            for (int i = 0; i < distancia; i++) {
                if (cadena1.length() < cadena2.length()) {
                    cadena1 = "0" + cadena1;
                } else {
                    cadena2 = "0" + cadena2;
                }
            }
        }
        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) != cadena2.charAt(i)) {
                contadorHamming++;
            }
        }
        System.out.println(entero1 + " = " + cadena1);
        System.out.println(entero2 + " = " + cadena2);
        System.out.println("La distancia de Hamming entre " + entero1 + " y " + entero2 + " es " + contadorHamming);
    }
}