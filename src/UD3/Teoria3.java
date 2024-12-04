package src.UD3;

import java.awt.*;
import java.math.*;
import java.util.Random;

import static java.lang.Math.PI;

public class Teoria3 {
    //Viernes 15/11/2024
    private static void imprimeTablaMultiplicar(int valor) {
        System.out.println("Tabla de multiplicar del " + valor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
        /*
         * Código que teníamos en el main
         *
         * for (int valor = 1; valor <= 2; valor++) {
         *    imprimeTablaMultiplicar(valor);
         * }
         */
    }

    private static int sumar(int numero1, int numero2) {
        //int resultado = numero1 + numero2;
        return numero1 + numero2;    //Siempre que el método no sea void debe tener return
    }

    private static double hacerMedia(int numero1, int numero2) {
        return (double) (numero1 + numero2) / 2;
    }

    private static void hacerPresentacion() {
        System.out.println("Pablo, edad 27, Vegadeo");
        ;
    }

    private static void imprimirPresentacion(String nombre, String lugarNacimiento, int edad) {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(lugarNacimiento);
    }

    public static void main(String[] args) {
        //Cualquier código que queramos utilizar debemos llamarlo desde el método main
        System.out.println(sumar(10, 10));
        System.out.println(hacerMedia(9, 8));
        hacerPresentacion();
        imprimirPresentacion("Pablo", "Vegadeo", 27);

        System.out.println(factorial(5));
        objetos();
        System.out.println("\n\n4 de Diciembre de 2024");
        claseMath();
        claseRandom();
    }

    //25 de Noviembre de 2024

    private static double sumar2(int a, int b) {
        return 2.0D;
    }

    private static void presentar(int edad, String nombre) {
        System.out.println(nombre + "tiene" + edad + "años");
    }

    private static void metodo() {
        int b = 10;
        for (int i = 0; i <= b; i++) {
            System.out.println(i * b);
        }
    }

    //28 de noviembre de 2024

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }

        //return factorial(n);   //Si solo hubiera esta llamada habría un error llamado StackOveflowError
    }

    //2 de Diciembre de 2024
    public static void objetos(){
        int valor = Math.abs(10);
        System.out.println(valor);

        Point puntoOrigen = new Point(5, 10);
        System.out.println(puntoOrigen.x);
        int ejeX = puntoOrigen.x;
    }

    //4 de Diciembre de 2024
    //La Clase Math

    public static void claseMath(){
        double r= 2;
        double longitudCircunferencia = 2*PI*r;
        System.out.println("\nClase Math\n"+longitudCircunferencia);
    }

    //La Clase Random
    public static void claseRandom(){
        System.out.println("\nClase Random");
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(aleatorio.nextInt());
        }
        System.out.println("\nDos constructores Random distintos generan el mismo número si tienen la misma semilla");
        Random aleatorio1 = new Random(123);
        Random aleatorio2 = new Random(123);

        for (int i = 0; i < 5; i++){
            System.out.println(aleatorio1.nextInt() +"\t"+aleatorio2.nextInt());
        }

        String texto = "data";
        System.out.println(texto.charAt(texto.length()-1));
    }
}

