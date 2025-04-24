package src.ud4.Boletin4.VectoresMultidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Qué tamaño tendrá la Matriz?");
        int tamanno = entrada.nextInt();
        int[][] matriz = new int[tamanno][tamanno];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        int max = matriz[0][0];
        int maxi = 0;
        int maxj = 0;
        int min = matriz[0][0];
        int mini = 0;
        int minj = 0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                int numero = matriz[i][j];
                System.out.printf("%02d ", numero);
                if (numero > max){
                    max = numero;
                    maxi = i;
                    maxj = j;
                } else if (numero < min){
                    min = numero;
                    mini = i;
                    minj = j;
                }
            }
        }
        System.out.println();
        System.out.println("\nValor Máximo: "+max+" ("+maxi+", "+maxj+")");
        System.out.println("\nValor Mínimo: "+min+" ("+mini+", "+minj+")");
    }
}
