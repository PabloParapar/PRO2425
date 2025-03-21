package src.ud4.Boletin4.Vectores;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("""
                Escribir una aplicación que rellene un vector de enteros y visualice los valores
                superiores a la media.
                Ingresa el tamaño del vector""");
        Scanner entrada = new Scanner(System.in);
        int tamannoVector = entrada.nextInt();

        int [] vectorEnteros = new int [tamannoVector];

        for (int i = 0; i < vectorEnteros.length; i++) {
            vectorEnteros[i]= (int) (100 * Math.random());
        }

        double valorMedio = 0;

        for (int i = 0; i < vectorEnteros.length; i++){
            valorMedio += vectorEnteros[i];
        }
        valorMedio = valorMedio / tamannoVector;

        for (int i = 0; i < vectorEnteros.length; i++){
            if (vectorEnteros[i]>valorMedio){
                System.out.print("\033[32m"+vectorEnteros[i]+" ");
            } else {
                System.out.print("\033[31m"+vectorEnteros[i]+" ");
            }
        }
    }
}
