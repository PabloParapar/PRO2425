package src.ud3.Ejercicios.ClaseMath;

import java.util.Scanner;

public class Ejercicio31 {
    public static void ejercicio31(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 31\n" + "Escribir un método que, a partir de la arista de un cubo, devuelva su volumen:");
        System.out.println("\nIngresa el valor de la arista del cubo:");
        double arista = entrada.nextDouble();
        double volumenCubo = calcularVolumenCubo(arista);
        System.out.println("para un cubo de arista " + arista + ", su volumen será " + volumenCubo);
    }

    public static double calcularVolumenCubo(double arista) {
        return arista * arista * arista;
    }
}