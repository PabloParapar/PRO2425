package src.ud3.Ejercicios.ClaseMath;

import java.util.Scanner;

public class Ejercicio25 {
    public static void ejercicio25(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 25\n" + "Escribir una aplicación que lea un double por teclado y rerdondee a entero de tres formas:\n");
        System.out.println("Ingresa un valor decimal:");
        double numero = entrada.nextDouble();
        System.out.println("a.\tEntero más cercano a " + numero + ": " + Math.round(numero) +
                "\nb.\tEntero más cercano a " + numero + " hacia +infinito: " + Math.ceil(numero) +
                "\nc.\tEntero más cercano a " + numero + " hacia -infinito: " + Math.floor(numero));
    }
}