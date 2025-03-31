package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio16 extends Ejercicio {
    private Ejercicio16() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 16
        Escribe un método recursivo para calcular, dado un término entero positivo, la suma de sus dígitos:
        Ingresa el término a calcular:""");
        int numeroSumar = ingresarEntero(entrada);
        System.out.println(sumaDigitos(numeroSumar));
    }

    public static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }
}