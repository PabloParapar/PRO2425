package src.ud4.Boletin4.VectoresMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Qué tamaño tendrá la Matriz? (alto y ancho distintos)");
        int alto = entrada.nextInt();
        int ancho = entrada.nextInt();
        int[][] matriz = new int[alto][ancho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1000);
            }
        }

        for (int[] value : matriz) {
            System.out.println();
            for (int numero : value) {
                System.out.printf("%03d ", numero);
            }
        }
        System.out.println();
        System.out.println("Qué filas quieres intercambiar)");
        int indice1 = entrada.nextInt();
        int indice2 = entrada.nextInt();
        int [] temporal = matriz[indice1];
        matriz[indice1] = matriz[indice2];
        matriz[indice2] = temporal;

        for (int[] ints : matriz) {
            System.out.println();
            for (int numero : ints) {
                System.out.printf("%03d ", numero);
            }
        }
    }
}