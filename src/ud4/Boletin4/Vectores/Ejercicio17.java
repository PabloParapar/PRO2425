package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {

        int [] boleto;
        int numeroCasos = 20;
        for (int i = 0; i < numeroCasos; i++) {
            boleto = rellenarVector();
            System.out.println();
            for (int numero: boleto){
                System.out.printf("%02d ", numero);
            }
        }
    }
    public static int[] rellenarVector(){
        Integer [] candidatos = new Integer [49];
        int [] resultado = new int[7];
        for (int i = 1; i <= candidatos.length; i++) {
            candidatos[i-1] = i;
        }
        Random random = new Random();
        for (int i = 0; i < resultado.length; i++) {
            int indice = random.nextInt(candidatos.length-i);
            resultado[i] = candidatos[indice];
            candidatos[indice] = 0;
            Arrays.sort(candidatos, Comparator.reverseOrder());
        }
        Arrays.sort(resultado);
        return resultado;
    }
}
