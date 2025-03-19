package src.ud3.ejercicios.metodosrecursivos;

import java.util.Scanner;

public class Ejercicio17 {
    private Ejercicio17() {
    }

    public static void ejercicio17(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 17
        Escribe un método recursivo para calcular, siguiendo el algoritmo de euclides, el máximo común divisor de dos números:
        Ingresa los 2 números a calcular:""");
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