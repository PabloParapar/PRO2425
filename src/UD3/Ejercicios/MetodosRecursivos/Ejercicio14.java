package src.UD3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void ejercicio14(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 14\n" + "Escribe un método recursivo para calcular, dado un término entero positivo, su correspondiente valor de la sucesión de Fibonacci:");
        System.out.println("Ingresa el término de la sucesión de Fibonacci a calcular:");
        int sucesion = entrada.nextInt();
        System.out.println(fibonacci(sucesion));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1 || n < 0) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}