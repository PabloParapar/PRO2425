package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[] enteros = new int[50];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i;
        }
        System.out.println();
        for (int numero : enteros) {
            System.out.printf("%02d ", numero);
        }
        int[] enterosBarajado = barajarVector(enteros);
        System.out.println();
        for (int numero : enterosBarajado) {
            System.out.printf("%02d ", numero);
        }
        int contadorBaraja = contadorBaraja(enteros, enterosBarajado);

        System.out.println("\nDel Array de " + enteros.length + " elementos se han barajado " + contadorBaraja + " elementos");
    }


    public static int[] barajarVector(int[] origen) {
        int[] vectorOrigen = Arrays.copyOf(origen,origen.length);
        int[] vectorBarajado = new int[origen.length];
        Random random = new Random();
        for (int i = 0; i < vectorOrigen.length; i++) {
            int indice = random.nextInt(vectorOrigen.length);
            if (vectorOrigen[indice] != -1) {
                vectorBarajado[i] = vectorOrigen[indice];
                vectorOrigen[indice] = -1;
            } else {
                i--;
            }
        }
        return vectorBarajado;
    }
    public static int contadorBaraja(int[] origen, int[] destino){
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] != destino[i]){
                contador++;
            }
        }
        return contador;
    }
}
