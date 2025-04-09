package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("""
                Dado un texto tecleado por pantalla, se desea conocer la frecuencia de
                aparición de cada una de las letras del abecedario. No mostrar aquellas letras
                que no aparecen en el texto.
                """);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el texto a comprobar:");
        String texto = entrada.nextLine();
        String textoACalcular = texto.toLowerCase();
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] calculoLetras = new int[27];
        int totalLetras = 0;
        for (int i = 0; i < textoACalcular.length(); i++) {
            char letra = textoACalcular.charAt(i);
            for (int j = 0; j < letras.length; j++) {
                if (letra == letras[j]) {
                    calculoLetras[j] += 1;
                    totalLetras++;
                }
            }
        }
        for (int i = 0; i < calculoLetras.length; i++) {
            if (calculoLetras[i] != 0) {
                System.out.println(letras[i] + " = " + ((double)calculoLetras[i]/totalLetras)*100+" %");
            }
        }
    }
}
