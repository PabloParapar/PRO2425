package src.UD3;

import java.awt.*;

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
}

