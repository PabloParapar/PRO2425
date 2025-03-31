package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio03 extends Ejercicio {
    public static boolean esTriangulo(int lado1, int lado2, int lado3) {
        boolean triangulo;
        if (lado1 < lado2 + lado3) {
            if (lado2 < lado1 + lado3) {
                if (lado3 < lado1 + lado2) {
                    triangulo = true;
                } else {
                    triangulo = false;
                }
            } else {
                triangulo = false;
            }
        } else {
            triangulo = false;
        }
        return triangulo;
    }

    public static void resolverEjercicio(Scanner entrada) {
        System.out.println("""
            Boletin 3 | Ejercicio 3
        Ingresa la medida de los 3 lados de un triángulo para ver si es equilátero, isósceles o escaleno:
        
        Ingresa las medidas de los lados del triángulo""");
        int lado1 = ingresarEntero(entrada);
        int lado2 = ingresarEntero(entrada);
        int lado3 = ingresarEntero(entrada);

        if (esTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2) {
                if (lado2 == lado3) {
                    System.out.println("El triángulo es equilátero\n");
                } else {
                    System.out.println("El triángulo es isósceles\n");
                }
            } else if (lado1 == lado3) {
                System.out.println("El triángulo es isósceles\n");
            } else if (lado2 == lado3) {
                System.out.println("El triángulo es isósceles\n");
            } else {
                System.out.println("El triángulo es escaleno\n");
            }
        } else {
            System.out.println("No es un triángulo\n");
        }
    }

    private Ejercicio03() {
    }
}