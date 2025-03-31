package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio06 extends Ejercicio {
    private Ejercicio06() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                Boletin 3 | Ejercicio 6
                    Escribe la altura y sexo de una persona para indicar su tipo de talla
                    (altura en metros) género (\033[36mh\u001b[0m/\033[36mm\u001b[0m):""");
        double altura = ingresarDecimal(entrada);
        entrada.nextLine();
        String genero = ingresarGenero(entrada);
        while (altura != 0) {
            switch (genero) {
                case "m":
                    if (altura <= 1.65) {
                        if (altura < 1.50) {
                            System.out.println("Esta mujer de " + altura + " metros es de talla Baja");
                        } else {
                            System.out.println("Esta mujer de " + altura + " metros es de talla Normal");
                        }
                    } else if (altura > 1.65) {
                        System.out.println("Esta mujer de " + altura + " metros es de talla Alta");
                    }
                    break;
                case "h":
                    if (altura <= 1.75) {
                        if (altura < 1.60) {
                            System.out.println("Este hombre de " + altura + " metros es de talla Baja");
                        } else {
                            System.out.println("Este hombre de " + altura + " metros es de talla Normal");
                        }
                    } else if (altura > 1.75) {
                        System.out.println("Este hombre de " + altura + " metros es de talla Alta");
                    }
                    break;
                default:
            }
            System.out.println("Ingresa la altura en metros");
            altura = ingresarDecimal(entrada);
            entrada.nextLine();
            genero = ingresarGenero(entrada);
        }
    }

    public static String ingresarGenero(Scanner escaner) {
        System.out.println("Ingresa el género (\033[36mh\u001b[0m/\033[36mm\u001b[0m)");
        String genero = ingresarCadena(escaner).toLowerCase().trim();
        if (genero.equals("m") || genero.equals("h")) {
            return genero;
        } else {
            System.out.println("Género no contemplado, repítalo (\033[36mh\u001b[0m/\033[36mm\u001b[0m)");
            return ingresarGenero(escaner);
        }
    }
}