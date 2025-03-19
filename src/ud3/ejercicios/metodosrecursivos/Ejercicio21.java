package src.ud3.ejercicios.metodosrecursivos;

import java.util.Scanner;

public class Ejercicio21 {

    public static void ejercicio21(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 21
        Escribe un método lógico recursivo que determine si un número entero recibido por parámetro es capicúa:""");
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
    private Ejercicio21() {
    }
    public static boolean esCapicua(int numero) {
        int longitud = Ejercicio12.longitudNumero(numero);
        if (longitud < 2) {
            return true;
        } else {
            return numero / (int) Math.pow(10, longitud - 1.0) == numero % 10 && esCapicua((numero % (int) Math.pow(10, longitud - 1.0)) / 10);
        }
    }
}