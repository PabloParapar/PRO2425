package examen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número decimal para calcular sus redondeos:");
        double numeroRedondeo = entrada.nextDouble();
        while (numeroRedondeo != 0) {
            System.out.println("Entero más cercano: " + Math.round(numeroRedondeo));
            System.out.println("Entero más cercano hacia +infinito: " + Math.ceil(numeroRedondeo));
            System.out.println("Entero más cercano hacia -infinito: " + Math.floor(numeroRedondeo));
            System.out.println("\nIngresa otro (o cancela con 0):");
            numeroRedondeo = entrada.nextDouble();
        }
    }
}
