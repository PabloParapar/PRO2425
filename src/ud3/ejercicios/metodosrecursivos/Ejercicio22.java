package src.ud3.ejercicios.metodosrecursivos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

/**
 * @author lopparpab
 */
public class Ejercicio22 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                    Boletin 3 | Ejercicio 22
                Escribe un método recursivo que resuelva las Torres de Hanoi dada una cantidad definida de discos:""");
        int numeroDiscos = ingresarEntero(entrada);
        int posteOrigen = ingresarEntero(entrada);
        int posteAuxiliar = ingresarEntero(entrada);
        int posteDestino = ingresarEntero(entrada);
        System.out.println("Número de discos: " + numeroDiscos);
        torresDeHanoi(numeroDiscos, 1, 2, 3);
    }

    private Ejercicio22() {
    }

    /**
     * Imprime en pantalla los pasos a seguir para resolver un caso de las Torres de Hanoi especificando:
     *  el número de discos, el poste inicial, el poste Auxiliar y el poste Destino
     *
     * @param numeroDiscos
     * @param posteOrigen
     * @param posteAuxiliar
     * @param posteDestino
     */
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