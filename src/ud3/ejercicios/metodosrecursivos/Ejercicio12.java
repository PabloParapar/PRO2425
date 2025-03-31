package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio12 extends Ejercicio {
    private Ejercicio12() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 12
        Escribe un método recursivo que reciba un número y devuelva el número de dígitos que tiene
        
        Ingresa el número a evaluar:""");
        int numeroEntrada = ingresarEntero(entrada);
        int numero = Math.abs(numeroEntrada);
        System.out.println(numeroEntrada + " tiene " + longitudNumero(numero) + " dígitos");

    }

    public static int longitudNumero(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + longitudNumero(n / 10);
        }
    }
}