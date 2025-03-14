package src.ud3.Ejercicios.MetodosRecursivos;

import java.util.Scanner;

public class Ejercicio21 {
    public static void ejercicio21(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 21");
        System.out.println("Escribe un método lógico recursivo que determine si un número entero recibido por parámetro es capicúa:");
        //String numeroCapicua = entrada.next();
        int numeroCapicua = entrada.nextInt();
        /*
        if(esCapicua(numeroCapicua)){
            System.out.println("El número "+numeroCapicua+" es capicúa");
        } else {
            System.out.println("El número "+numeroCapicua+" no es capicúa");
        }*/
        if (esCapicua(numeroCapicua)) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("no es capicúa");
        }
    }

    public static boolean esCapicua(int numero) {
        int longitud = Ejercicio12.longitudNumero(numero);
        if (longitud < 2) {
            return true;
        } else {
            return numero / (int) Math.pow(10, longitud - 1) == numero % 10 && esCapicua((numero % (int) Math.pow(10, longitud - 1)) / 10);
        }
    }
}