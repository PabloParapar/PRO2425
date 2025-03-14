package src.ud3.Ejercicios.ClaseString;

import java.util.Scanner;

public class Ejercicio37 {
    public static void ejercicio37(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 37\n" + "Escribe una aplicación que concatene dos cadenas de caracteres leidas por teclado con un espacio en blanco entre ellas:");
        System.out.println("Ingresa dos cadenas de caracteres:");
        String cadena1 = entrada.next();
        String cadena2 = entrada.next();
        String cadenaFinal = cadena1.concat(" ").concat(cadena2);
        System.out.println(cadenaFinal);
    }
}