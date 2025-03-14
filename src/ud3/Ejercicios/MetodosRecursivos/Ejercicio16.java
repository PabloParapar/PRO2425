package src.ud3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void ejercicio16(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 16\n" + "Escribe un método recursivo para calcular, dado un término entero positivo, la suma de sus dígitos:");
        System.out.println("Ingresa el término a calcular:");
        int numeroSumar = entrada.nextInt();
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