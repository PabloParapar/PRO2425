package src.ud3.ejercicios.clasemath;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio31 extends Ejercicio {
    private Ejercicio31() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 31
        Escribir un método que, a partir de la arista de un cubo, devuelva su volumen
        Ingresa el valor de la arista del cubo:""");
        double arista = ingresarDecimal(entrada);
        double volumenCubo = calcularVolumenCubo(arista);
        System.out.println("para un cubo de arista " + arista + ", su volumen será " + volumenCubo);
    }

    public static double calcularVolumenCubo(double arista) {
        return arista * arista * arista;
    }
}