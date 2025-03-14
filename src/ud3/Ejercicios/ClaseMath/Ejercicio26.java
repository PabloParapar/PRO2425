package src.ud3.Ejercicios.ClaseMath;

import java.util.Scanner;

public class Ejercicio26 {
    public static void ejercicio26(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 26\n" + "Escribir un programa que lea por teclado un ángulo expresado en grados y muestre por pantalla su seno, coseno y tangente:");
        System.out.println("Ingresa un valor en grados:");
        double grados = entrada.nextDouble();
        System.out.println("Grados =\t" + grados + "º\n" +
                "Seno\t\t=\t" + Math.sin(Math.toRadians(grados)) +
                "\nCoseno\t\t=\t" + Math.cos(Math.toRadians(grados)) +
                "\nTangente\t=\t" + Math.tan(Math.toRadians(grados)));
    }
}