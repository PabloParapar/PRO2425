package src.ud3.ejercicios.metodosrecursivos;

import java.util.Scanner;

public class Ejercicio15 {
    private Ejercicio15() {
    }

    public static void ejercicio15(Scanner entrada) {


        System.out.println("""
            Boletin 3 | Ejercicio 15
        Escribe un método recursivo para invertir un número entero:
        
        Ingresa el número entero a invertir:""");
        int numeroInvertir = entrada.nextInt();
        System.out.println(invertirNumero(numeroInvertir));
    }

    public static int invertirNumero(int n) {
        int l = Ejercicio12.longitudNumero(n);
        if (l == 1) {
            return n;
        } else {
            return n % 10 * (int) Math.pow(10, l - 1.0) + invertirNumero(n / 10);
        }
    }
}