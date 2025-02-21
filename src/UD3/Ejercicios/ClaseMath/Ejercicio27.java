package src.UD3.Ejercicios.ClaseMath;

import java.util.Scanner;

public class Ejercicio27 {
    public static void ejercicio27(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 27\n" + "Escribir un programa que simule el lanzamiento de un dado y muestre por pantalla la frecuencia de los resultados de mil lanzamientos:");
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;
        for (int i = 0; i < 1000; i++) {
            int tirada = lanzarDado();
            switch (tirada) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                case 6:
                    contador6++;
                    break;
            }
        }
        System.out.println("Tiradas 1: " + contador1 + "\tFrecuencia: " + ((double) contador1 * 100 / 1000) + "%" +
                "\nTiradas 3: " + contador3 + "\tFrecuencia: " + ((double) contador3 * 100 / 1000) + "%" +
                "\nTiradas 2: " + contador2 + "\tFrecuencia: " + ((double) contador2 * 100 / 1000) + "%" +
                "\nTiradas 4: " + contador4 + "\tFrecuencia: " + ((double) contador4 * 100 / 1000) + "%" +
                "\nTiradas 5: " + contador5 + "\tFrecuencia: " + ((double) contador5 * 100 / 1000) + "%" +
                "\nTiradas 6: " + contador6 + "\tFrecuencia: " + ((double) contador6 * 100 / 1000) + "%" +
                "\nTiradas Totales: " + (contador1 + contador2 + contador3 + contador4 + contador5 + contador6));
    }

    public static int lanzarDado() {
        return (int) Math.floor(Math.random() * 6 + 1);
    }
}