package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio19 extends Ejercicio {
    private Ejercicio19() {
    }

    public static void resolverEjercicio(Scanner entrada) {
        System.out.println("""
            Boletin 3 | Ejercicio 19
        Escribir un método recursivo que calcule la serie 1 + 2 + 3 + ... + n-1 + n:
        
        Ingresa el valor n de la serie:""");
        int numeroSerie = ingresarEntero(entrada);
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