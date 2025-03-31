package src.ud3.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Ejercicio {


    public static void resolverEjercicio(Scanner escaner) {
    }

    public static int ingresarEntero(Scanner escaner) {
        int numeroEntero;
        try {
            System.out.println("Ingresa un número entero:");
            numeroEntero = escaner.nextInt();
            return numeroEntero;
        } catch (InputMismatchException entero) {
            System.out.println("\033[31m" + "Error: Ingresaste un valor que no es entero" + "\u001b[0m");
            escaner.nextLine();
            return ingresarEntero(escaner);
        } catch (Exception entero) {
            System.out.println("\033[31m" + "Error inesperado: " + "\u001b[0m" + entero.getMessage());
            escaner.nextLine();
            return ingresarEntero(escaner);
        }

    }

    public static double ingresarDecimal(Scanner escaner) {
    double numeroDecimal;
        try {
            System.out.println("Ingresa un número decimal:");
            numeroDecimal = escaner.nextDouble();
            return numeroDecimal;
        } catch (InputMismatchException decimal) {
            System.out.println("\033[31m" + "Error: No ingresaste un valor válido" + "\u001b[0m");
            escaner.nextLine();
            return ingresarDecimal(escaner);
        }catch (NumberFormatException decimal) {
            System.out.println("\033[31m" + "Error: Ingresaste un valor no válido" + "\u001b[0m");
            escaner.nextLine();
            return ingresarDecimal(escaner);
        } catch (Exception decimal) {
            System.out.println("\033[31m" + "Error inesperado: " + "\u001b[0m" + decimal.getMessage());
            escaner.nextLine();
            return ingresarDecimal(escaner);
        }

    }

    public static String ingresarCadena(Scanner escaner) {
        //escaner.nextLine();
        String cadena = escaner.nextLine();
        if (cadena.trim().isEmpty()){
            System.out.println("\033[31m" + "Error: Ingresaste una cadena vacía" + "\u001b[0m");
            return ingresarCadena(escaner);
        }
        return cadena;
    }
}
