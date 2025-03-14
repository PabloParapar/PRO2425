package src.ud3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio15 {
    public static void ejercicio15(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 15\n" + "Escribe un método recursivo para invertir un número entero:");
        System.out.println("Ingresa el número entero a invertir:");
        int numeroInvertir = entrada.nextInt();
        System.out.println(invertirNumero(numeroInvertir));
    }

    public static int invertirNumero(int n) {
        int l = Ejercicio12.longitudNumero(n);
        if (l == 1) {
            return n;
        } else {
            return n % 10 * (int) Math.pow(10, l - 1) + invertirNumero(n / 10);
        }
    }
}