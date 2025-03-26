package src.ud4.Boletin4.Vectores;

import java.util.Scanner;

/**
 * @author lopparpab
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("\nEscribir una aplicación que solicite el tamaño de un vector de enteros y lo\n" +
                "rellene con valores ficticios.\n" +
                "Imprimir el contenido del vector en una línea separando los elementos por un\n" +
                "espacio. Después del último elemento no puede ir un espacio.");

        System.out.println("Ingresa el tamaño del nuevo vector de enteros:");
        Scanner entrada = new Scanner(System.in);
        int entradaEntero = entrada.nextInt();
        int[] enteros = new int[entradaEntero];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = (int) (1000 * Math.random());
        }

        for (int i = 0; i < enteros.length - 1; i++) {
            System.out.print(enteros[i] + " ");
        }
        System.out.print(enteros[entradaEntero - 1]);
    }
}
