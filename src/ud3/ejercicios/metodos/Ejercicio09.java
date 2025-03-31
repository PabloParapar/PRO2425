package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio09 extends Ejercicio {
    private Ejercicio09() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                    Boletin 3 | Ejercicio 9
                
                1.- Transformar a binario.
                2.- Transformar a octal.
                3.- Transformar a hexadecimal.
                
                4.- Fin del proceso""");
        int seleccion = ingresarEntero(entrada);
        entrada.nextLine();
        while (seleccion != 4) {
            switch (seleccion) {
                case 1:
                    System.out.println(
                    convertirABinario(entrada));
                    break;
                case 2:
                    System.out.println(
                    convertirAOctal(entrada));
                    break;
                case 3:
                    System.out.println(
                    convertirAHexadecimal(entrada));
                    break;
                default:
                    System.out.println("""
                            Cuando el usuario teclee una opción, la aplicación le pedirá un número y
                            realizará la conversión de notación solicitada""");
            }
            menu();
            seleccion = ingresarEntero(entrada);
        }

    }

    public static void menu(){
        System.out.println("""
                1.- Transformar a binario.
                2.- Transformar a octal.
                3.- Transformar a hexadecimal.
                
                4.- Fin del proceso""");
    }

    public static String convertirABinario(Scanner escaner) {
        int numeroOriginal = ingresarEntero(escaner);
        return Integer.toBinaryString(numeroOriginal);
    }

    public static String convertirAOctal(Scanner escaner) {
        int numeroOriginal = ingresarEntero(escaner);
        return Integer.toOctalString(numeroOriginal);
    }

    public static String convertirAHexadecimal(Scanner escaner) {
        int numeroOriginal = ingresarEntero(escaner);
        return Integer.toHexString(numeroOriginal);
    }
}