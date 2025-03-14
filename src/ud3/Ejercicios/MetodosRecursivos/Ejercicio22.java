package src.ud3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio22 {
    public static void ejercicio22(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 22\n");
        System.out.println("Escribe un método recursivo que resuelva las Torres de Hanoi dada una cantidad definida de discos:");
        int numeroDiscos = entrada.nextInt();
        int posteOrigen = entrada.nextInt();
        int posteAuxiliar = entrada.nextInt();
        int posteDestino = entrada.nextInt();
        System.out.println("Número de discos: " + numeroDiscos);
        torresDeHanoi(numeroDiscos, 1, 2, 3);
    }

    public static void torresDeHanoi(int numeroDiscos, int posteOrigen, int posteAuxiliar, int posteDestino) {
        if (numeroDiscos <= 2) {
            System.out.println("mover disco de " + posteOrigen + " a " + posteAuxiliar +
                    "\nmover disco de " + posteOrigen + " a " + posteDestino +
                    "\nmover disco de " + posteAuxiliar + " a " + posteDestino);
        } else {
            torresDeHanoi(numeroDiscos - 1, posteOrigen, posteDestino, posteAuxiliar);
            System.out.println("mover disco de " + posteOrigen + " a " + posteDestino);
            torresDeHanoi(numeroDiscos - 1, posteAuxiliar, posteOrigen, posteDestino);
        }
    }
}