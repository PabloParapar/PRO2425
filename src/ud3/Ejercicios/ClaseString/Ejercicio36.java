package src.ud3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio36 {
    public static void ejercicio36(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 36\n" + "Escribe un programa que lea por teclado una cadena de caracteres y, a partir de ella, cree otra al revés:");
        String cadena = entrada.next();
        String cadenaInversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInversa = cadenaInversa.concat(cadena.substring(i, i + 1));
        }
        System.out.println(cadenaInversa);
    }
}