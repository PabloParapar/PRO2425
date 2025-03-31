package src.ud3.ejercicios.clasemath;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio26 extends Ejercicio {
    private Ejercicio26() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 26
        Escribir un programa que lea por teclado un ángulo expresado en grados y muestre por pantalla su seno, coseno y tangente:
        Ingresa un valor en grados:""");
        double grados = ingresarDecimal(entrada);
        System.out.println("Grados =\t" + grados + "º\n" +
                "Seno\t\t=\t" + Math.sin(Math.toRadians(grados)) +
                "\nCoseno\t\t=\t" + Math.cos(Math.toRadians(grados)) +
                "\nTangente\t=\t" + Math.tan(Math.toRadians(grados)));
    }
}