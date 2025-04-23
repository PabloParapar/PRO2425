package src.ud4.Boletin4.Vectores;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("¿Cúantos elementos tendrá el vector?");
        int casos = entrada.nextInt();
        int[] enteros = new int[casos];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = random.nextInt(casos);
        }
        System.out.println("El Array en cuestión:");
        for (int entero : enteros){
            System.out.printf("%02d ",entero);
        }
    }

    public static int [] ordenarBurbuja(int [] origen){
        int [] vectorOrigen = origen.clone();
        int [] vectorOrdenado = new int[origen.length];


        return vectorOrdenado;
    }
    public static int [] ordenarQuicksort(int [] origen){
        int [] vectorOrigen = origen.clone();
        int [] vectorOrdenado = new int[origen.length];


        return vectorOrdenado;
    }
    public static int [] ordenarMergesort(int [] origen){
        int [] vectorOrigen = origen.clone();
        int [] vectorOrdenado = new int[origen.length];


        return vectorOrdenado;
    }
}
