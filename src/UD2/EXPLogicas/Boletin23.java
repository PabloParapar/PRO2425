package src.UD2.EXPLogicas;

import java.text.DecimalFormat;
import java.util.*;

public class Boletin23 {
    public static void main(String[] args) {
        String reset = "\u001b[0m";
        String snooze = "\033[30m";
        String saltado = "\033[31m";
        String terminado = "\033[32m";
        String incubadora = "\033[35m";
        String pendiente = "\33[33m";
        String destacado = "\033[36m";
        /*
        Negro:      \033[30m
        Rojo:       \033[31m
        Verde:      \033[32m
        Amarillo:   \033[33m
        Azul:       \033[34m
        Magenta:    \033[35m
        Blanco:     \033[37m
        Cyan:       \033[36m
        Reset:      \u001b[0m
        */
        //MENÚ EJERCICIOS
        System.out.println(
                "\n                     Unidad Didáctica 2 | Boletín 2 3\n\n" +
                        "        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                        "        ┃               Estructura repetitiva " + destacado + "for" + reset + "               ┃\n" +
                        "        ┠──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┨\n" +
                        "        ┃   " + terminado + "1" + reset + "  │   " + terminado + "2" + reset + "  │   " + terminado + "3" + reset + "  │   " + terminado + "4" + reset + "  │   " + terminado + "5" + reset + "  │   " + terminado + "6" + reset + "  │   " + terminado + "7" + reset + "  │   " + terminado + "8" + reset + "  ┃\n" +
                        "        ┠──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┨\n" +
                        "        ┃   " + terminado + "9" + reset + "  │  " + terminado + "10" + reset + "  │  " + terminado + "11" + reset + "  │  " + terminado + "12" + reset + "  │  " + terminado + "13" + reset + "  │  " + terminado + "14" + reset + "  │  " + terminado + "15" + reset + "  │  " + terminado + "16" + reset + "  ┃\n" +
                        "        ┠──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┨\n" +
                        "        ┃  " + terminado + "17" + reset + "  │  " + terminado + "18" + reset + "  │  " + terminado + "19" + reset + "  │  " + terminado + "20" + reset + "  │  " + terminado + "21" + reset + "  │  " + terminado + "22" + reset + "  │  " + terminado + "23" + reset + "  │  " + terminado + "24" + reset + "  ┃\n" +
                        "        ┣━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┷━━━━━━┫\n" +
                        "        ┃              Estructura repetitiva " + destacado + "while" + reset + "              ┃\n" +
                        "        ┠───────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃     " + snooze + "25" + reset + "    │    " + snooze + "26" + reset + "    │    " + snooze + "27" + reset + "    │    " + snooze + "28" + reset + "    │    " + snooze + "29" + reset + "    ┃\n" +
                        "        ┠───────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃     " + snooze + "30" + reset + "    │    " + snooze + "31" + reset + "    │    " + snooze + "32" + reset + "    │    " + snooze + "33" + reset + "    │    " + snooze + "34" + reset + "    ┃\n" +
                        "        ┣━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃             Estructura repetitiva " + destacado + "do-while" + reset + "            ┃\n" +
                        "        ┠───────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃     " + snooze + "35" + reset + "    │    " + snooze + "36" + reset + "    │    " + snooze + "37" + reset + "    │    " + snooze + "38" + reset + "    │    " + snooze + "39" + reset + "    ┃\n" +
                        "        ┣━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃       Ejercicios de estructura repetitiva libre       ┃\n" +
                        "        ┠───────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃     " + snooze + "40" + reset + "    │    " + snooze + "41" + reset + "    │    " + snooze + "42" + reset + "    │    " + snooze + "43" + reset + "    │    " + snooze + "44" + reset + "    ┃\n" +
                        "        ┠───────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃     " + snooze + "45" + reset + "    │    " + snooze + "46" + reset + "    │    " + snooze + "47" + reset + "    │    " + snooze + "48" + reset + "    │     0    ┃\n" +
                        "        ┗━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┛\n\n" +
                        "        Introduzca el número del ejercicio que desea ejecutar: ");
        Scanner boletin23 = new Scanner(System.in);
        int numeroEjercicio = boletin23.nextInt();

        switch (numeroEjercicio) {

            //ESTRUCTURA REPETITIVA FOR

            //EJERCICIO 1
            case 1:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 1\n" + "Calcular el Sumatorio de los primeros 100 números naturales\n");
                int n = 0;
                for (int i = 1; i <= 100; i++) {
                    n += i;
                }
                System.out.println("La suma de los primeros 100 números naturales es " + n);
                break;

            //EJERCICIO 2
            case 2:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 2\n" + "Calcular la media de 5 números dados por el usuario\n");

                Scanner ejercicio2 = new Scanner(System.in);

                int numero = 0;
                System.out.println("Introduzca 5 números para obtener la media:");
                for (int i = 5; i > 0; i--) {
                    System.out.println("Quedan " + i + " números por introducir: ");
                    numero += ejercicio2.nextInt();
                }
                System.out.println("La media es " + (numero / 5.0));
                ejercicio2.close();
                break;

            //EJERCICIO 3
            case 3:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 3\n" + "Calcular la media de tantos números como especifique el usuario\n");

                System.out.println("¿A cuántos números le harás la media?");
                Scanner ejercicio3 = new Scanner(System.in);
                int i3 = ejercicio3.nextInt();
                numero = 0;
                for (int i = i3; i > 0; i--) {
                    System.out.println("Introduzca un número, quedan " + i + " números por introducir: ");
                    numero += ejercicio3.nextInt();
                }
                System.out.println("La media entre los " + i3 + " números dados es: " + ((double) numero / i3));
                ejercicio3.close();
                break;

            //EJERCICIO 4
            case 4:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 4\n" + "Dados 2 números, sumar los pares dentro del intervalo entre ellos\n");

                Scanner ejercicio4 = new Scanner(System.in);
                System.out.println("Introduzca 2 valores para sumar los números pares del intervalo que forman: ");
                int i4inicio = ejercicio4.nextInt();
                int i4fin = ejercicio4.nextInt();
                int sumasPares = 0;
                if (i4inicio < i4fin) {
                    for (int i = i4inicio; i <= i4fin; i++) {
                        if (i % 2 == 0) {
                            sumasPares += i;
                        }
                    }
                } else {
                    for (int i = i4fin; i <= i4inicio; i++) {
                        if (i % 2 == 0) {
                            sumasPares += i;
                        }
                    }
                }
                System.out.println("La suma de los números pares entre " + i4inicio + " y " + i4fin + " es " + sumasPares);
                ejercicio4.close();
                break;

            //EJERCICIO 5
            case 5:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 5\n" + "Sumar los primeros 'n' términos de la serie armónica siendo 'n' especificado por el usuario\n");
                System.out.println("¿Cuántos términos de la suma armónica quiere sumar?");
                Scanner ejercicio5 = new Scanner(System.in);
                int i5 = ejercicio5.nextInt();
                double serieArmonica = 0;
                for (int i = 1; i <= i5; i++) {
                    serieArmonica += (double) 1 / i;
                }
                System.out.println("Resultado de la suma de los primeros " + i5 + " términos de la serie armónica:\n" + serieArmonica);
                ejercicio5.close();
                break;

            //EJERCICIO 6
            case 6:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 6\n" + "Sumar los primeros 'n' términos de la serie dada, siendo 'n' especificado por el usuario");

                System.out.println("¿Cuántos términos de la serie quiere sumar?");
                Scanner ejercicio6 = new Scanner(System.in);
                int i6 = ejercicio6.nextInt();
                double sumaSerie = 0;

                for (int i = 0; i <= i6 - 1; i++) {
                    if (i == 0) {
                        sumaSerie = 0;
                    } else {
                        sumaSerie += (double) (5 * i) / (2 * Math.pow(3, i));
                        //System.out.println(sumaSerie);
                    }
                }
                System.out.println("La suma de los primeros " + i6 + " términos de la serie es igual a " + sumaSerie);
                ejercicio6.close();
                break;

            //EJERCICIO 7
            case 7:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 7\n" + "Calcular la suma de los primeros 'n' términos de la serie dada, siendo 'n' especificado por el usuario");

                System.out.println("¿Cuántos términos de la serie quiere sumar?");
                Scanner ejercicio7 = new Scanner(System.in);
                int i7 = ejercicio7.nextInt();
                double sumaSerie7 = 0;

                for (int i = 1; i <= i7; i++) {
                    sumaSerie7 += i / Math.pow(2, i);
                    //System.out.println(sumaSerie7);
                }
                System.out.println("Resultado de la suma de los primeros " + i7 + " términos de la serie:\n" + sumaSerie7);
                ejercicio7.close();
                break;

            //EJERCICIO 8
            case 8:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 8\n" + "Genera una tabla de conversión de temperaturas de Fahrenheit a Celsius, Rankine y Kelvin\n");

                System.out.println("Introduzca los grados en Fahrenheit (desde / hasta):");
                Scanner ejercicio8 = new Scanner(System.in);
                int desde = ejercicio8.nextInt();
                int hasta = ejercicio8.nextInt();
                float temperaturaC, temperaturaR, temperaturaK;
                DecimalFormat tabla = new DecimalFormat("##0.00");
                if (desde < hasta) {
                    System.out.println("Temperaturas desde " + desde + "Fº hasta " + hasta + "Fº:\n┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┓\n┃\tFahrenheit\t│\tCelsius\t│\tRankine\t│\tKelvin\t┃\n┠───────────────┼───────────┼───────────┼───────────┨");
                    for (int i = desde; i <= hasta; i++) {
                        temperaturaC = (float) (5 * (i - 32)) / 9;
                        temperaturaR = (float) (i + 459.67);
                        temperaturaK = (float) (temperaturaC + 273.15);
                        System.out.println("┃\t" + tabla.format(i) + "\t\t│\t" + tabla.format(temperaturaC) + "\t│\t" + tabla.format(temperaturaR) + "\t│\t" + tabla.format(temperaturaK) + "\t┃");
                    }
                } else {
                    System.out.println("Temperaturas desde " + hasta + "Fº hasta " + desde + "Fº:\n┏━━━━━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┯━━━━━━━━━━━┓\n┃\tFahrenheit\t│\tCelsius\t│\tRankine\t│\tKelvin\t┃\n┠───────────────┼───────────┼───────────┼───────────┨");
                    for (int i = hasta; i <= desde; i++) {
                        temperaturaC = (float) (5 * (i - 32)) / 9;
                        temperaturaR = (float) (i + 459.67);
                        temperaturaK = (float) (temperaturaC + 273.15);
                        System.out.println("┃\t" + tabla.format(i) + "\t\t│\t" + tabla.format(temperaturaC) + "\t│\t" + tabla.format(temperaturaR) + "\t│\t" + tabla.format(temperaturaK) + "\t┃");
                    }
                }
                System.out.println("┗━━━━━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━┷━━━━━━━━━━━┛");
                break;

            //EJERCICIO 9
            case 9:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 9 a)\n" + "Calcula el factorial de un número dado por el usuario\n");
                System.out.println("¿De qué número quiere calcular su factorial?");
                Scanner ejercicio9 = new Scanner(System.in);
                int factorial = ejercicio9.nextInt();
                long resultadoFactorial = 1;
                switch (factorial) {
                    case 0:
                    case 1:
                        System.out.println("El Factorial de " + factorial + " es 1");
                        break;
                    default:
                        for (int i = 1; i <= factorial; i++) {
                            resultadoFactorial *= i;
                        }
                        System.out.println("El Factorial de " + factorial + "! es " + resultadoFactorial);
                        break;
                }

                System.out.println("\n\tBoletin 2 3 | Ejercicio 9 b)\n" + "Calcula el factorial de los 20 primeros números naturales");
                long factorial20 = 1;
                for (int i = 1; i <= 20; i++) {
                    factorial20 *= i;
                    System.out.println(i + "!\t=\t" + factorial20);
                }
                ejercicio9.close();
                break;

            //EJERCICIO 10
            case 10:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 10\n" + "Lista los 'n' primeros números de la serie 1, -2, 4, -8... dado 'n' por el usuario\n");
                System.out.println("¿Cuándos números de la serie quiere listar?");
                Scanner ejercicio10 = new Scanner(System.in);
                int numeroSerie = ejercicio10.nextInt();
                for (int i = 0; i <= numeroSerie; i++) {
                    System.out.println((long) Math.pow(-2, i));
                }
                ejercicio10.close();
                break;

            //EJERCICIO 11
            case 11:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 11\n" + "Dados 'n' números por el usuario, indica el mayor, el menor y la media\n");

                int numeroMayor, numeroMenor, cantidad, numeroEntrada;
                double mediaNumero = 0;
                Scanner ejercicio11 = new Scanner(System.in);
                System.out.println("¿Cuántos números quiere procesar?\n");
                cantidad = ejercicio11.nextInt();
                System.out.println("Indica cuáles son: \n");
                numeroMayor = 0;
                numeroMenor = 0;
                for (int i = 1; i <= cantidad; i++) {
                    numeroEntrada = ejercicio11.nextInt();
                    mediaNumero += numeroEntrada;
                    if (i == 1) {
                        numeroMayor = numeroEntrada;
                        numeroMenor = numeroEntrada;
                    } else {
                        if (numeroMayor < numeroEntrada) {
                            numeroMayor = numeroEntrada;
                        } else if (numeroMenor > numeroEntrada) {
                            numeroMenor = numeroEntrada;
                        }
                    }
                }
                System.out.println("Número Mayor\t=\t" + numeroMayor + "\nNúmero Menor\t=\t" + numeroMenor + "\nMedia Aritmética\t=\t" + mediaNumero / cantidad);
                ejercicio11.close();
                break;

            //EJERCICIO 12
            case 12:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 12 a)\n" + "Dado un número entre 1 y 9 muestra su tabla de multiplicar\n");
                System.out.println("¿De qué número desea saber su tabla de multiplicar?");
                Scanner ejercicio12 = new Scanner(System.in);
                int numeroTabla = ejercicio12.nextInt();
                if (numeroTabla >= 1 && numeroTabla <= 9) {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numeroTabla + " * " + i + " = " + (numeroTabla * i));
                    }
                } else {
                    System.out.println("El número no es correcto");
                }
                ejercicio12.close();
                System.out.println("\n\tBoletin 2 3 | Ejercicio 12 b)\n" + "Lista las tablas de multiplicar del 1 al 9\n");

                for (int i = 1; i <= 9; i++) {
                    System.out.println("┏━━━━━━━━━━━━━━━━━━━┓\n┃\t  Tabla del " + i + "  \t┃\n┠───────────────────┨");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println("┃\t" + i + " * " + j + "\t=\t" + (i * j) + "\t┃");
                    }
                    System.out.println("┗━━━━━━━━━━━━━━━━━━━┛\n\n");
                }
                break;

            //EJERCICIO 13
            case 13:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 13\n" + "Calcula el siguiente sumatorio y productorio hasta un numero 'n' dado por el usuario\n");
                Scanner ejercicio13 = new Scanner(System.in);
                int numeroSumatorio = ejercicio13.nextInt();
                double sumatorio, productorio, terminoSumatorio;
                sumatorio = 0;
                productorio = 1;
                for (int i = 1; i <= numeroSumatorio; i++) {
                    terminoSumatorio = 1.0 / i;
                    if (i >= numeroSumatorio) {
                        for (int j = numeroSumatorio; j <= i; j++) {
                            productorio *= j;
                            //System.out.println(i + ", " + j + ", productorio: " + productorio);
                        }
                    }
                    sumatorio += terminoSumatorio + productorio;
                    //System.out.println(i + ", sumatorio: " + sumatorio);
                }
                System.out.println("Resultado: " + sumatorio);
                /*
                A efectos prácticos, se reduce al sumatorio de ( 1 / i ) + n
                 */
                ejercicio13.close();
                break;

            //EJERCICIO 14
            case 14:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 14\n" + "Muestra en pantalla todos los divisores de un número 'n' dado por el usuario\n");
                System.out.println("¿De qué número desea saber sus divisores?");
                Scanner ejercicio14 = new Scanner(System.in);
                int numeroDivisores = ejercicio14.nextInt();
                System.out.println("Los divisores de " + numeroDivisores + " son:");
                for (int i = numeroDivisores; i >= 1; i--) {
                    if (numeroDivisores % i == 0) {
                        System.out.println("\t· " + i);
                    }
                }
                ejercicio14.close();
                break;

            //EJERCICIO 15
            case 15:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 15\n" + "Calcula el cuadrado de los 10 primeros números pares\n");

                System.out.println("El cuadrado de los primeros 10 números pares son:");
                for (int i = 2; i <= 20; i += 2) {
                    System.out.println("\t· " + (int) Math.pow(i, 2));
                }
                break;

            //EJERCICIO 16
            case 16:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 16\n" + "Dadas por el usuario una base y un exponente máximo calcular las potencias de la base hasta llegar al exponente máximo\n");
                Scanner ejercicio16 = new Scanner(System.in);
                System.out.println("¿De qué número quiere calcular las potencias?");
                int base = ejercicio16.nextInt();
                System.out.println("Indique la potencia más alta a la que desea elevar " + base);
                int potencia = ejercicio16.nextInt();
                for (int i = 1; i <= potencia; i++) {
                    System.out.println(base + " ^ " + i + " = " + (int)Math.pow(base, i));
                }
                ejercicio16.close();
                break;

            //EJERCICIO 17
            case 17:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 17\n" + "Comprobar la velocidad de dos códigos distintos para efectuar la misma tarea y mostrar el más rápido\n");

                long tiempoInicio1 = System.currentTimeMillis();
                for (int i = 1; i <= 1000000; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                }
                long tiempoFinal1 = System.currentTimeMillis();
                long tiempoInicio2 = System.currentTimeMillis();
                for (int i = 1; i <= 1000000; i++) {
                    if ((i & 1) == 0) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                }
                long tiempoFinal2 = System.currentTimeMillis();
                System.out.println("Método 1:\nTiempo inicio = " + tiempoInicio1 + "\tTiempo final = " + tiempoFinal1 + "\t\tTiempo total = " + (tiempoFinal1 - tiempoInicio1) + "\n\nMétodo 2:\nTiempo inicio = " + tiempoInicio2 + "\tTiempo final = " + tiempoFinal2 + "\t\tTiempo total = " + (tiempoFinal2 - tiempoInicio2));
                if (tiempoFinal1 - tiempoInicio1 > tiempoFinal2 - tiempoInicio2) {
                    System.out.println("El segundo método es más rápido");
                } else {
                    System.out.println("El primer método es más rápido");
                }

                break;
            case 18:

                //EJERCICIO 18
                System.out.println("\n\tBoletin 2 3 | Ejercicio 18\n" + "Dado un rango, calcular los cubos de los impares dentro del rango\n");

                Scanner ejercicio18 = new Scanner(System.in);
                System.out.println("Indica el primer número del intervalo a comprobar");
                int inicioIntervaloCubo = ejercicio18.nextInt();
                System.out.println("Indica el último número del intervalo a comprobar");
                int finalIntervaloCubo = ejercicio18.nextInt();
                for (int i = inicioIntervaloCubo; (i <= finalIntervaloCubo) && (i - inicioIntervaloCubo < 20); i++) {
                    if ((i & 1) != 0) {
                        System.out.println("\t· " + (long) Math.pow(i, 3));
                    }
                }
                ejercicio18.close();
                break;

            //EJERCICIO 19
            case 19:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 19\n" + "Dados dos años, calcular los años bisiestos dentro del rango de los años dados\n");

                Scanner ejercicio19 = new Scanner(System.in);
                System.out.println("Indica el año del incio del intervalo a comprobar");
                int anhoInicio = ejercicio19.nextInt();
                System.out.println("Indica el año del final del intervalo a comprobar");
                int anhoFinal = ejercicio19.nextInt();
                System.out.println("Los años comprendidos entre " + anhoInicio + " y " + anhoFinal + " son:");
                for (int i = anhoInicio; i <= anhoFinal; i++) {
                    if (i % 4 == 0) {
                        if (i % 100 == 0) {
                            if (i % 400 == 0) {
                                System.out.println("\t· " + i);
                            } //else no es bisiesto
                        } else { //es bisiesto
                            System.out.println("\t· " + i);
                        }
                    } //else no es bisiesto
                }
                ejercicio19.close();
                break;

            //EJERCICIO 20
            case 20:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 20\n" + "Mostrar en pantalla el triángulo de Floyd ascendente y descendente dado el número de filas\n");
                System.out.println("Indica cuántas filas tendrá el triángulo de Floyd");
                Scanner ejercicio20 = new Scanner(System.in);
                int filasFloyd = ejercicio20.nextInt();
                int numeroFloyd = 1;
                System.out.println("\nAscendente\n");
                for (int i = 1; i <= filasFloyd; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("\t" + numeroFloyd);
                        numeroFloyd++;
                    }
                    System.out.println();
                }
                System.out.println("\nDescendente\n");
                numeroFloyd = 1;
                for (int i = 1; i <= filasFloyd; i++) {
                    for (int j = filasFloyd; j >= i; j--) {
                        System.out.print("\t" + numeroFloyd);
                        numeroFloyd++;
                    }
                    System.out.println();
                }
                ejercicio20.close();
                break;

            //EJERCICIO 21
            case 21:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 21\n" + "Muestra en pantalla un menú con opciones indicadas por un número\n");

                System.out.println("\t1.\tCuadrado.\n\t2.\tRectángulo.\n\t3.\tTriángulo\n\t4.\tCírculo.\n\t0.\tSalir.\n\nSeleccione una opción del menú");
                Scanner ejercicio21 = new Scanner(System.in);
                int menu = ejercicio21.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Cuadrado.");
                        break;
                    case 2:
                        System.out.println("Rectángulo.");
                        break;
                    case 3:
                        System.out.println("Triángulo.");
                        break;
                    case 4:
                        System.out.println("Círculo");
                        break;
                    case 0:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("ERROR | OPCIÓN NO VÁLIDA");
                }
                ejercicio21.close();
                break;

            //EJERCICIO 22
            case 22:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 22\n" + "Calcular el cuadrado de un número 'n' dado por el usuario, usando únicamente sumas\n");

                Scanner ejercicio22 = new Scanner(System.in);
                int numeroBase = ejercicio22.nextInt();
                int numeroCuadrado = 0;

                for (int i = 0; i < numeroBase; i++) {
                    numeroCuadrado += (1 + 2 * i);
                }
                System.out.println("El cuadrado de "+numeroBase+" es "+numeroCuadrado);
                ejercicio22.close();
                break;

            //EJERCICIO 23
            case 23:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 23\n" + "Multiplicar dos números sin usar el operador de multiplicación\n");

                Scanner ejercicio23 = new Scanner(System.in);
                int producto1 = ejercicio23.nextInt();
                int producto2 = ejercicio23.nextInt();
                int productoFinal = 0;
                for (int i = 1; i <= producto2; i++) {
                    productoFinal += producto1;
                }
                System.out.println("El producto entre "+producto1+" y "+producto2+" es igual a "+productoFinal);
                ejercicio23.close();
                break;

            //EJERCICIO 24
            case 24:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 24\n" + "Calcular la división entera y resto entre dos números dados sin utilizar los operadores de división y módulo\n");

                Scanner ejercicio24 = new Scanner(System.in);
                System.out.println("Indica un Dividendo: ");
                int entradaDividendo = ejercicio24.nextInt();
                int dividendo = entradaDividendo;
                System.out.println("Indica un Divisor: ");
                int divisor = ejercicio24.nextInt();


                for (int i = 0; ; i++) {
                    if (dividendo > divisor) {
                        dividendo -= divisor;
                    } else {
                        System.out.println(entradaDividendo + "/" + divisor + " =>\tEntero: " + i + "\tResto: " + dividendo);
                        break;
                    }
                }
                break;

            //ESTRUCTURA REPETITIVA WHILE

            //EJERCICIO 25
            case 25:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 25\n");
                System.out.println("SIN EMPEZAR");
                break;

            //EJERCICIO 26
            case 26:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 26\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 27
            case 27:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 27\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 28
            case 28:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 28\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 29
            case 29:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 29\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 30
            case 30:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 30\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 31
            case 31:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 31\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 32
            case 32:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 32\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 33
            case 33:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 33\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 34
            case 34:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 34\n");
                System.out.println("SIN EMPEZAR");


                break;

            //ESTRUCTURA REPETITIVA DO-WHILE

            //EJERCICIO 35
            case 35:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 35\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 36
            case 36:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 36\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 37
            case 37:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 37\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 38
            case 38:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 38\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 39
            case 39:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 39\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIOS DE ESTRUCTURA REPETITIVA LIBRE

            //EJERCICIO 40
            case 40:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 40\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 41
            case 41:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 41\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 42
            case 42:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 42\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 43
            case 43:

                System.out.println("\n\tBoletin 2 3 | Ejercicio 43\n");
                System.out.println("SIN EMPEZAR");

                break;

            //EJERCICIO 44
            case 44:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 44\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 45
            case 45:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 45\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 46
            case 46:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 46\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 47
            case 47:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 47\n");
                System.out.println("SIN EMPEZAR");


                break;

            //EJERCICIO 48
            case 48:
                System.out.println("\n\tBoletin 2 3 | Ejercicio 48\n");
                System.out.println("SIN EMPEZAR");

                break;

            default:
                System.out.println("Ese no sale en el boletin, escoge otro: \n");
                break;
        }
    }
}