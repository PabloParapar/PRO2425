package src.ud3.ejercicios.clasestring;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio37 extends Ejercicio {
    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 37\n" + "Escribe una aplicación que concatene dos cadenas de caracteres leidas por teclado con un espacio en blanco entre ellas:");
        System.out.println("Ingresa dos cadenas de caracteres:");
        entrada.nextLine();
        String cadena1 = ingresarCadena(entrada);
        String cadena2 = ingresarCadena(entrada);
        String cadenaFinal = cadena1.concat(" ").concat(cadena2);
        System.out.println(cadenaFinal);
    }
}