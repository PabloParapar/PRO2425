package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio13 extends Ejercicio {
    private Ejercicio13() {
    }

    public static void resolverEjercicio(Scanner entrada) {
        System.out.println("""
            Boletin 3 | Ejercicio 13
        Escribe un método recursivo para calcular la potencia de dos numeros con base real y potencia entera:
        Ingresa la Base real y la potencia entera:
        """);
        double numeroReal = ingresarDecimal(entrada);
        int numeroEntero = ingresarEntero(entrada);
        System.out.println(numeroReal + " ^ " + numeroEntero + " = " + potencia(numeroReal, numeroEntero));
    }

    public static double potencia(double x, int n) {
        if (n < 0) {
            if (n == -1) {
                return (1 / x);
            } else {
                return (1 / x) * potencia(x, n + 1);
            }
        } else if (n > 0) {
            if (n == 1) {
                return x;
            } else {
                return x * potencia(x, n - 1);
            }
        } else {
            return 1;
        }
    }
}