package src.ud4.Boletin4.VectoresMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {
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

        int maxFila[] = new int[alto];
        int maxCol[] = new int[ancho];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = matriz[i][j];
                if (maxFila[i] < numero){
                    maxFila[i] = numero;
                }
                if (maxCol[j] < numero){
                    maxCol[j] = numero;
                }
            }
        }
        System.out.println("\033[32mMáximo de la Fila");
        System.out.println("\033[35mMáximo de la Columna");
        System.out.println("\033[36mCoinciden Máximo de Fila y Columna\u001b[0m");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = matriz[i][j];
                if (maxFila[i] == numero){
                    System.out.print("\033[32m");
                }
                if (maxCol[j] == numero){
                    System.out.print("\033[35m");
                }
                if (maxCol[j] == numero && maxFila[i] == numero){
                    System.out.print("\033[36m");
                }
                System.out.printf("%03d ", numero);
                System.out.print("\u001b[0m");
            }
            System.out.print("\033[32m");
            System.out.printf("\t%03d", maxFila[i]);
            System.out.print("\u001b[0m");
        }
        System.out.print("\033[35m");
        System.out.println("\n");
        for (int i = 0; i < maxCol.length; i++) {
            System.out.printf("%03d ", maxCol[i]);
        }
    }
}