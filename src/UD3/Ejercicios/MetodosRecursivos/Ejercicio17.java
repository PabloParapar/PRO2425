package src.UD3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void ejercicio17(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 17\n" + "Escribe un método recursivo para calcular, siguiendo el algoritmo de euclides, el máximo común divisor de dos números:");
        System.out.println("Ingresa los 2 números a calcular:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        System.out.println(maximoComunDivisor(numero1, numero2));
    }

    public static int maximoComunDivisor(int a, int b) {
        if (b <= a && a % b == 0) {
            return b;
        } else if (a < b) {
            return maximoComunDivisor(b, a);
        } else {
            return maximoComunDivisor(b, a % b);
        }
    }
}