package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("""
                Ejercicio 9
                
                Escribir un programa que transforme un numero entero mayor o igual que cero
                a binario de dos modos distintos:
                
                a) Usando la Clase Integer:
                b) Creando un método que utilice un vector:
                """);
        Scanner entrada = new Scanner(System.in);
        int numeroOrigen = ingresarEnteroPositivo(entrada);

        System.out.println("a) Usando la Clase Integer:");

        System.out.println(numeroOrigen+" en binario -> "+Integer.toBinaryString(numeroOrigen));

        System.out.println("b) Creando un método que utilice un vector:");

        System.out.println(imprimirBinario(calcularVectorBinario(numeroOrigen)));


    }

    public static int ingresarEnteroPositivo(Scanner escaner) {
        try {
            int enteroPositivo = escaner.nextInt();
            if (enteroPositivo < 0) {
                System.out.println("Entrada incorrecta: Número menor que cero");
                escaner.nextLine();
                return ingresarEnteroPositivo(escaner);
            }
            return enteroPositivo;
        } catch (NullPointerException e) {
            System.out.println("Error en la entrada");
            escaner.nextLine();
            return ingresarEnteroPositivo(escaner);
        } finally {
            escaner.nextLine();
        }
    }

    public static String imprimirBinario(byte[] vector){
        String binario = "";
        for (int i = vector.length-1; i > 0; i--) {
            binario += vector[i];
        }
        return binario;
    }

    public static byte[] calcularVectorBinario(int numeroOrigen){
        byte [] vectorBinario = new byte[calcularIndice(numeroOrigen)];
        for (int i = 0; i < vectorBinario.length; i++) {
            if (numeroOrigen % 2 == 0){
                vectorBinario[i] = 0;
            } else {
                vectorBinario[i] = 1;
            }
            numeroOrigen /= 2;
        }
        return vectorBinario;
    }
    public static int calcularIndice(int numeroOrigen){
        int indice = 0;
        for (int i = 1; i < numeroOrigen; i++) {
            if (numeroOrigen < Math.pow(2, i)){
                indice = i;
                break;
            }
        }
        return indice;
    }
}
