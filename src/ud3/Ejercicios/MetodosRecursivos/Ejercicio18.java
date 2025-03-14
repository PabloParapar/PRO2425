package src.ud3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void ejercicio18(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 18\n" + "Escribe un método recursivo para calcular si un número es par o no:");
        System.out.println("Ingresa el número a comprobar:");
        int seraPar = entrada.nextInt();
        if (esPar(seraPar)) {
            System.out.println("El número " + seraPar + " es Par");
        } else {
            System.out.println("El número " + seraPar + " es Impar");
        }
    }

    public static boolean esPar(int numero) {
        if (numero > 1) {
            return esPar(numero - 2);
        } else if (numero == 1) {
            return false;
        } else {
            return true;
        }
    }
}