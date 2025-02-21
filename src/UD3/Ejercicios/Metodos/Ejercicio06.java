package src.UD3.Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio06 {
    public static void ejercicio6(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 6\n" + ":");
        System.out.println("Escribe la altura y sexo de una persona para indicar su tipo de talla\n(altura en metros) género (\033[36mh\u001b[0m/\033[36mm\u001b[0m):");
        float altura = entrada.nextFloat();
        String genero = entrada.next().toLowerCase();
        while (altura != 0) {
            switch (genero) {
                case "m":
                    if (altura <= 1.65) {

                    }
                    break;
                case "h":
                    break;
                default:
                    System.out.println("Género no contemplado, repítalo (\033[36mh\u001b[0m/\033[36mm\u001b[0m)");
                    genero = entrada.next().toLowerCase();
            }
        }
    }
}