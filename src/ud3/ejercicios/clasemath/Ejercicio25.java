package src.ud3.ejercicios.clasemath;

import java.util.Scanner;

public class Ejercicio25 {
    private Ejercicio25() {
    }

    public static void ejercicio25(Scanner entrada) {

        System.out.println("""
                    Boletin 3 | Ejercicio 25
                Escribir una aplicación que lea un double por teclado y redondee a entero de tres formas:" +
                Ingresa un valor decimal:""");
        double numero = entrada.nextDouble();
        System.out.println(
                "a.\tEntero más cercano a " + numero + ": " + Math.round(numero) +
                "\nb.\tEntero más cercano a " + numero + " hacia +infinito: " + Math.ceil(numero) +
                "\nc.\tEntero más cercano a " + numero + " hacia -infinito: " + Math.floor(numero));
    }
}