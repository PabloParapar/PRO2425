package src.UD2;

import java.util.Scanner;

public class Teoria2 {
    public static void main(String[] args) {
        // 07 de Octubre de 2024
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(true);
        System.out.println(!true);
        System.out.println(false && false);
        System.out.println(!false);

        /*Miércoles 09 de Octubre de 2024

        ESTRUCTURAS CONDICIONALES | Sentencia if y switch-case

        Una secuencia if permite ejecutar código dada una condición
        */
        System.out.println("Buenas");
        int edad = 5;
        if (edad >= 18) {
            System.out.println("Puede beber");

        }
        System.out.println("Adios\n");

        /*Si la secuencia if tiene solo una línea se podría poner sin llaves, para nosotros va a ser necesario.
          Java no distingue la indentación como una estructura funcional de código.

          Si un número es par imprime "Par", y si número es impar imprime "Impar"
        */
        int numero;
        numero = 2;
        if (numero % 2 == 0) {
            System.out.println(numero + " es Par");
        }
        numero = 3;
        if (numero % 2 == 0) {
            System.out.println(numero + " es Par");
        }
        if (!(numero % 2 == 0)) {
            System.out.println(numero + " es Impar");
        }
        numero = 2;
        if (!(numero % 2 == 0)) {
            System.out.println(numero + " es Impar");
        }

        /*
        Sentencia if-else

        Si la condición es cierta se ejecuta un bloque de sentencias, si es falsa se ejecuta otro bloque de sentencias.

        Un diagrama sobre if-else puede caer en el examen
         */
        System.out.println("Buenas");
        edad = 6;
        if (edad >= 18) {
            System.out.println("Puede beber");
        } else {
            System.out.println("No puede beber");
        }
        System.out.println("Adios\n");

        edad = 15;

        if (edad >= 18) {
            System.out.println("Es mayor de edad, su edad es " + edad);
        } else {
            System.out.println("Es menor de edad, su edad es " + edad);
        }
        edad = 25;
        if (edad >= 18) {
            System.out.println("Es mayor de edad, su edad es " + edad);
        } else {
            System.out.println("Es menor de edad, su edad es " + edad);
        }

        //Jueves, 10 de Octubre de 2024

        edad = 2;
        //Código sin anidar. Es poco eficiente si para la última condición tiene que comprobar todas las anteriores
        System.out.println("\nEsta persona tiene " + edad + " años");
        if (edad <= 3) {
            System.out.println("Esta persona es un bebé");
        }
        if (edad <= 11 && edad > 3) {
            System.out.println("Esta persona es un bebé");
        }
        if (edad <= 17 && edad > 11) {
            System.out.println("Esta persona estudia en secundaria");
        }
        if (edad <= 35 && edad > 17) {
            System.out.println("Esta persona es joven");
        }
        if (edad <= 66 && edad > 35) {
            System.out.println("Esta persona es adulta");
        }
        if (edad > 66) {
            System.out.println("Esta persona es anciana");
        }

        edad = 52;
        //Código anidado. Poco Eficiente si para llegar a la última condición debe comprobar todas las anteriores
        System.out.println("\nEsta persona tiene " + edad + " años");

        if (edad <= 3) {
            System.out.println("Esta persona es un bebé");
        } else {
            if (edad <= 11) {
                System.out.println("Esta persona estudia en primaria");
            } else {
                if (edad <= 17) {
                    System.out.println("Esta persona estudia en secundaria");
                } else {
                    if (edad <= 35) {
                        System.out.println("Esta persona es joven");
                    } else {
                        if (edad <= 66) {
                            System.out.println("Esta persona es adulta");
                        } else {
                            if (edad > 66) {
                                System.out.println("Esta persona es anciana");
                            }
                        }
                    }
                }
            }
        }
        /*
        Código mejor anidado. Victor nos recomienda esta versión, al segmentar en dos partes
        nos permite ahorrar pasos a la hora de comprobar las condiciones.
        Si la variable valiera 80 no necesitaría comprobar todas las condiciones como ocurría en las anteriores.
        */
        edad = 70;
        if (edad <= 17) {
            if (edad < 3) {
                System.out.println("bebé");
            } else if (edad <= 11) {
                System.out.println("primaria");
            } else {
                System.out.println("secundaria");
            }
        } else {
            if (edad <= 66) {
                if (edad <= 35) {
                    System.out.println("joven");
                } else {
                    System.out.println("adulto");
                }
            } else {
                System.out.println("anciano");
            }
        }

        //MIÉRCOLES 16/10/2024

        //Version if sin anidar
        System.out.println("\nDia con if sin anidar");
        int dia = 1;
        if (dia == 1) {
            System.out.println("Lunes");
        }
        if (dia == 2) {
            System.out.println("Martes");
        }
        if (dia == 3) {
            System.out.println("Miércoles");
        }
        if (dia == 4) {
            System.out.println("Jueves");
        }
        if (dia == 5) {
            System.out.println("Viernes");
        }
        if (dia > 5) {
            System.out.println("Fin de Semana");
        }
        //Version if else Anidada
        System.out.println("\nDia con if else anidado");

        if (dia <= 5) {
            if (dia <= 3) {
                if (dia <= 2) {
                    if (dia <= 1) {
                        System.out.println("Lunes");
                    } else {
                        System.out.println("Martes");
                    }
                } else {
                    System.out.println("Miércoles");
                }
            } else if (dia < 5) {
                System.out.println("Jueves");
            } else {
                System.out.println("Viernes");
            }
        } else {
            System.out.println("Fin de Semana");
        }

        //Version Switch
        System.out.println("\nDia con Switch case");
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de Semana");
        }

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia Laborable");
                break;
            default:
                System.out.println("Fin de Semana");
        }
        //Jueves 24 de Octubre de 2024

        for (int i = 0; i < 10; i++){
            System.out.println("El número es "+i);
        }
        for (int i = 0; i < 5; i++){
            System.out.println("El número es "+i);
        }
        //Cada variable i es accesible únicamente desde for

        Scanner in = new Scanner(System.in);
        System.out.println("Numero de iteraciones: ");
        int iteracion;
        for ( iteracion = in.nextInt(); iteracion > 0 ; iteracion--) {
            //..
        }
        int iteracion2;
        for ( iteracion2 = in.nextInt(); iteracion > 0 ; iteracion--) {
            //...
        }
}}


