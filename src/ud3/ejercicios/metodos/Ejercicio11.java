package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio11 extends Ejercicio {
    private Ejercicio11() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                Boletin 3 | Ejercicio 11
                    Codificar un método que reciba como parámetro un número e indique si es un número perfecto o no
                    Utilizando el método anterior, escribir un programa que localice los cuatro primeros números perfectos:""");

        int contadorPerfecto = 0;
        for (int i = 1; contadorPerfecto < 4; i++) {

            if (verificarNumeroPerfecto(i)) {
                System.out.println(i);
                contadorPerfecto++;
            }
        }

    }


    public static boolean verificarNumeroPerfecto(int numeroCandidato) {
        int comprobante = 0;
        for (int i = 1; i < numeroCandidato; i++) {
            if (numeroCandidato % i == 0){
                comprobante += i;
            }
            if (comprobante > numeroCandidato){
                break;
            }
        }
        return comprobante == numeroCandidato;
    }
}