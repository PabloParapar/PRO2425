package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio04 extends Ejercicio {
    public static boolean esVocal(String letra) {
        boolean vocal;
        if (Objects.equals(letra, "a") || Objects.equals(letra, "A") || Objects.equals(letra, "e") || Objects.equals(letra, "E") || Objects.equals(letra, "i") || Objects.equals(letra, "I") || Objects.equals(letra, "o") || Objects.equals(letra, "O") || Objects.equals(letra, "u") || Objects.equals(letra, "U")) {
            vocal = true;
        } else {
            vocal = false;
        }
        return vocal;
    }

    public static void ejercicio4a(String letra) {
        if (esVocal(letra)) {
            System.out.println(letra + " es vocal");
        } else {
            System.out.println(letra + " no es vocal");
        }
    }

    public static void ejercicio4b(String letra) {
        if (!esVocal(letra)) {
            System.out.println(letra + " es consonante");
        } else {
            System.out.println(letra + " no es consonante");
        }
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 4
        Comprueba si el caracter ingresado es una vocal o una consonante
        
        ¿Qué quieres comprobar?
        1 · Vocales
        2 · Consonantes""");
        int opcion = ingresarEntero(entrada);
        entrada.nextLine();

        while (opcion != 0) {
            String letra;
            switch (opcion) {
                case 1:
                    System.out.println("Comprueba si es vocal:");
                    letra = ingresarCadena(entrada);
                    ejercicio4a(letra);
                    break;
                case 2:
                    System.out.println("Comprueba si es consonante:");
                    letra = ingresarCadena(entrada);
                    ejercicio4b(letra);
                    break;
                default:
                    System.out.println("Elige otro");
                    opcion = ingresarEntero(entrada);
                    break;
            }
        }
    }
    private Ejercicio04() {
    }
}