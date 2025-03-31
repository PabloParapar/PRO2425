package src.ud3.ejercicios.clasemath;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio30 extends Ejercicio {
    private Ejercicio30() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 30
        Escribir una aplicación en Java que, dadas dos medidas de los catetos de un triángulo rectángulo, devuelva la medida de la hipotenusa:
        
        Ingresa los valores de los catetos:""");
        double cateto1 = ingresarDecimal(entrada);
        double cateto2 = ingresarDecimal(entrada);
        System.out.println(
                "Cateto 1\t=\t" + cateto1 +
                        "\nCateto 2\t=\t" + cateto2 +
                        "\nHipotenusa\t=\t" + calcularHipotenusa(cateto1, cateto2));
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt((cateto1 * cateto1 + cateto2 * cateto2));
    }
}