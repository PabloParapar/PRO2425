package src.UD3.Ejercicios.ClaseMath;

import java.util.Scanner;

public class Ejercicio28 {
    public static void ejercicio28(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 28\n" + "Escribir un método que simule el lanzamiento de dos dados. El método recibirá un número por parámetro y devolverá true cuando los dos dados devuelvan dicho número. Invoca el método un millón de veces y calcular el porcentaje de veces que los dos dados obtienen el número indicado:");
        System.out.println("Ingresa el número a consultar (entre 1 y 6):");
        int valorDados = entrada.nextInt();
        int contadorDados = 0;
        for (int i = 0; i < 1000000; i++) {
            if (lanzarDosDados(valorDados)) {
                contadorDados++;
            }
        }
        System.out.println("Nº de veces que salió el " + valorDados + " en ambos dados: " + contadorDados +
                "\nFrecuencia: " + ((double) contadorDados * 100 / 1000000) + "%");
    }

    public static boolean lanzarDosDados(int valorDados) {
        int dado1 = Ejercicio27.lanzarDado();
        int dado2 = Ejercicio27.lanzarDado();
        if (dado1 == dado2 && dado1 == valorDados) {
            return true;
        } else {
            return false;
        }
    }
}