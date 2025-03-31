package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio18 extends Ejercicio {
    private Ejercicio18() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                Boletin 3 | Ejercicio 18
            Escribe un método recursivo para calcular si un número es par o no:
            
            Ingresa el número entero a comprobar""");
        int seraPar = ingresarEntero(entrada);
        System.out.println("El número "+seraPar);
        if (esPar(seraPar)) {
            System.out.print(" es Par");
        } else {
            System.out.print(" es Impar");
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