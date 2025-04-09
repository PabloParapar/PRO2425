package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("""
                Ejercicio 8
                
                Representar en memoria un tren donde cada vagón tiene un número aleatorio de pasajeros.
                Indicar el número medio de pasajeros por vagón y cuántos vagones tiene
                más pasajeros que la media.
                """);
        System.out.println("Ingresa la cantidad de vagones:");
        Scanner entrada = new Scanner(System.in);
        int numeroVagones = entrada.nextInt();
        int [] tren = new int[numeroVagones];
        Random random = new Random();
        for (int i = 0; i < tren.length; i++) {
            tren[i] = random.nextInt(0, 100);
        }
        for (int entero : tren){
            System.out.print(entero+" ");
        }

        int pasajerosTotales = 0;
        for (int entero : tren){
            pasajerosTotales += entero;
        }
        double mediaPasajeros = ((double) pasajerosTotales / numeroVagones);
        System.out.println("\nLa media de pasajeros por vagón es: "+mediaPasajeros);

        System.out.println("Los vagones que tienen más pasajeros que la media son:");
        for (int i = 0; i < tren.length; i++) {
            if (tren[i] > mediaPasajeros){
                System.out.print(i+1+"º ");
            }
        }
        System.out.println("o también:");
        for (int i = 0; i < tren.length; i++) {
            if (tren[i] > mediaPasajeros){
                System.out.print("\033[32m"+(i+1)+" \u001b[0m");
            } else{
                System.out.print(i+1+" ");
            }
        }

    }
}
