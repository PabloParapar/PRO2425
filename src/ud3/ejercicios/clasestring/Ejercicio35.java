package src.ud3.ejercicios.clasestring;

import java.util.Scanner;

public class Ejercicio35 {
    public static void ejercicio35(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 35\n" + "Escribir una aplicación que lea del teclado una cadena de caracteres y muestre cuántas veces aparece en ella la letra 'a'. Utiliza un bucle para recorrer caracter a caracter:");
        String cadena = entrada.next();
        int conteoA = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.toLowerCase().charAt(i) == 'a') {
                conteoA++;
            }
        }
        System.out.println("Cantidad de aes en " + cadena + " = " + conteoA);
        ;
    }
}