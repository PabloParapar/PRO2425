/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PaqueteExamenUD2;

import java.util.Scanner;

/**
 *
 * @author lopparpab
 */
public class ExamenUD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al examen de la UD2 - estructuras de control. Seleccione la opción deseada\n1-\tMultiplicador\n2-\tCuadrado\n3-\tFactorial\n4-\tFibonacci\n");
        int ejercicio = entrada.nextInt();
        while (true) {
            switch (ejercicio) {
                case 1: //Multiplicador
                    System.out.println("\nIngrese dos números para obtener su multiplicación\n");
                    Scanner ejercicio1 = new Scanner(System.in);
                    int factor1 = ejercicio1.nextInt();
                    int factor2 = ejercicio1.nextInt();
                    int producto = 0;
                    for (int i = 1; i <= factor2; i++) {
                        producto += factor1;
                    }
                    System.out.println("El resultado de " + factor1 + " * " + factor2 + " es igual a " + producto);

                    break;
                case 2: //Cuadrado
                    System.out.println("\nCalcula el cuadrado de los 10 primeros números pares\n");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + "-\t" + i * 2 + "^2 = " + 4 * i * i);
                    }
                    break;
                case 3: //Factorial
                    System.out.println("\nIngresa un número para calcular su factorial\n");
                    long factorial = 1;
                    Scanner ejercicio3 = new Scanner(System.in);
                    int numEjercicio3 = ejercicio3.nextInt();
                    if (numEjercicio3 == 0 || numEjercicio3 == 1) {
                        System.out.println("Factorial de " + numEjercicio3 + " = " + factorial);
                    } else {
                        for (int i = 1; i <= numEjercicio3; i++) {
                            factorial *= i;
                        }
                        System.out.println("Factorial de " + numEjercicio3 + " = " + factorial);
                    }
                    break;
                case 4: //Fibonacci
                    System.out.println("\nIngrese hasta qué número de la secuencia de Fibonacci quiere calcular:\n");
                    Scanner ejercicio4 = new Scanner(System.in);
                    int numeroFibonacci = ejercicio4.nextInt();
                    int secuenciaFibonacci;
                    int primeroFibonacci = 0;
                    int segundoFibonacci = 1;
                    for (int i = 0; i <= numeroFibonacci; i++) {
                        secuenciaFibonacci = primeroFibonacci + segundoFibonacci;
                        System.out.println("F(" + i + ") = " + secuenciaFibonacci);
                        primeroFibonacci = segundoFibonacci;
                        segundoFibonacci = secuenciaFibonacci;
                    }
                    break;
                default:
                    System.out.println("\n\nERROR, vuelva a indicar el ejercicio");
                    break;
            }
            System.out.println("\n\nBienvenido al examen de la UD2 - estructuras de control. Seleccione la opción deseada\n1-\tMultiplicador\n2-\tCuadrado\n3-\tFactorial\n4-\tFibonacci");
            ejercicio = entrada.nextInt();
        }
    }
}
