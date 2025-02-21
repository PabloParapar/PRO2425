package src.UD3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void ejercicio19(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 19\n" + "Escribir un método recursivo que calcule la serie 1 + 2 + 3 + ... + n-1 + n:");
        System.out.println("Ingresa el valor n de la serie:");
        int numeroSerie = entrada.nextInt();
        System.out.println("El " + numeroSerie + "º término de la serie es " + serieEnteros(numeroSerie));
    }

    public static int serieEnteros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + serieEnteros(n - 1);
        }
    }
}