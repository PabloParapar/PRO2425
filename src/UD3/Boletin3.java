package src.UD3;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Character.*;
import static java.lang.Integer.toBinaryString;

public class Boletin3 {
    private static void menuSeleccion() {
        String reset = "\u001b[0m";         // Reset
        String snooze = "\033[30m";         // Black
        String saltado = "\033[31m";        // Red
        String terminado = "\033[32m";      // Green
        String incubadora = "\033[35m";     // Magenta
        String enProceso = "\33[33m";       // Yellow
        String destacado = "\033[36m";      // Cyan
        //MENÚ EJERCICIOS
        System.out.println(
                "\n                           Unidad Didáctica 3 | Boletín 3\n\n" +
                        "        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                        "        ┃                      Ejercicios de " + destacado + "métodos" + reset + "                      ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + " 1" + reset + "    │    " + terminado + " 2" + reset + "    │    " + terminado + " 3" + reset + "    │    " + terminado + " 4" + reset + "    │    " + terminado + " 5" + reset + "    │    " + enProceso + " 6" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + incubadora + " 7" + reset + "    │    " + incubadora + " 8" + reset + "    │    " + incubadora + " 9" + reset + "    │    " + incubadora + "10" + reset + "    │    " + incubadora + "11" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                 Ejercicios de " + destacado + "métodos recursivos" + reset + "                ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + "12" + reset + "    │    " + terminado + "13" + reset + "    │    " + terminado + "14" + reset + "    │    " + terminado + "15" + reset + "    │    " + terminado + "16" + reset + "    │    " + terminado + "17" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + terminado + "18" + reset + "    │    " + terminado + "19" + reset + "    │    " + terminado + "20" + reset + "    │    " + terminado + "21" + reset + "    │    " + terminado + "22" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                      Uso básico de " + destacado + "objetos" + reset + "                      ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + enProceso + "23" + reset + "               │               " + incubadora + "24" + reset + "               ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                   Ejercicios de la clase " + destacado + "Math" + reset + "                   ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + incubadora + "25" + reset + "    │    " + incubadora + "26" + reset + "    │    " + incubadora + "27" + reset + "    │    " + incubadora + "28" + reset + "    │    " + incubadora + "29" + reset + "    │    " + incubadora + "30" + reset + "    ┃\n" +
                        "        ┠──────────┴──────────┼──────────┴──────────┼──────────┴──────────┨\n" +
                        "        ┃          " + incubadora + "31" + reset + "         │          " + incubadora + "32" + reset + "         │          " + incubadora + "33" + reset + "         ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                  Ejercicios de la clase " + destacado + "String" + reset + "                  ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + incubadora + "34" + reset + "    │    " + incubadora + "35" + reset + "    │    " + incubadora + "36" + reset + "    │    " + incubadora + "37" + reset + "    │    " + incubadora + "38" + reset + "    │    " + incubadora + "39" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + incubadora + "40" + reset + "    │    " + incubadora + "41" + reset + "    │    " + incubadora + "42" + reset + "    │    " + incubadora + "43" + reset + "    │    " + incubadora + "44" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃        Ejercicios de la clase " + destacado + "String" + reset + " y " + destacado + "clases envoltorio" + reset + "        ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + incubadora + "45" + reset + "               │               " + incubadora + "46" + reset + "               ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                  Ejercicios de " + destacado + "manejo de fechas" + reset + "                 ┃\n" +
                        "        ┠────────────────┬───────────────┬───────────────┬────────────────┨\n" +
                        "        ┃       " + snooze + "47" + reset + "       │       " + snooze + "48" + reset + "      │       " + snooze + "49" + reset + "      │       " + snooze + "50" + reset + "       ┃\n" +
                        "        ┗━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━┛\n");
    }

    public static void main(String[] args) {

        menuSeleccion();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el número del ejercicio que quieres ver (0 para salir):\n");
        int ejercicio = entrada.nextInt();

        while (ejercicio != 0) {
            switch (ejercicio) {
                case 1:
                    int mes = entrada.nextInt();
                    int anho = entrada.nextInt();
                    System.out.println("Tiene " + ejercicio1(mes, anho) + " días");
                    break;

                case 2:
                    ejercicio2(entrada);

                    break;

                case 3:
                    ejercicio3(entrada);

                    break;

                case 4:
                    ejercicio4(entrada);

                    break;

                case 5:
                    ejercicio5(entrada);

                    break;
                case 6:
                    ejercicio6(entrada);

                    break;
                case 7:
                    ejercicio7(entrada);

                    break;
                case 8:
                    ejercicio8(entrada);

                    break;
                case 9:
                    ejercicio9(entrada);

                    break;
                case 10:
                    ejercicio10(entrada);

                    break;
                case 11:
                    ejercicio11(entrada);

                    break;
                case 12:
                    ejercicio12(entrada);
                    break;
                case 13:
                    ejercicio13(entrada);
                    break;
                case 14:
                    ejercicio14(entrada);
                    break;
                case 15:
                    ejercicio15(entrada);
                    break;
                case 16:
                    ejercicio16(entrada);
                    break;
                case 17:
                    ejercicio17(entrada);
                    break;
                case 18:
                    ejercicio18(entrada);
                    break;
                case 19:
                    ejercicio19(entrada);
                    break;
                case 20:
                    ejercicio20(entrada);
                    break;
                case 21:
                    ejercicio21(entrada);
                    break;
                case 22:
                    ejercicio22(entrada);
                    break;
                case 23:
                    ejercicio23();
                    break;
                case 24:
                    ejercicio24();
                    break;
                case 25:
                    ejercicio25(entrada);
                    break;
                case 26:
                    ejercicio26(entrada);
                    break;
                case 27:
                    ejercicio27(entrada);
                    break;
                case 28:
                    ejercicio28(entrada);
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 30:
                    ejercicio30(entrada);
                    break;
                case 31:
                    ejercicio31(entrada);
                    break;
                case 32:
                    ejercicio32();
                    break;
                case 33:
                    ejercicio33();
                    break;
                case 34:
                    ejercicio34(entrada);
                    break;
                case 35:
                    ejercicio35(entrada);
                    break;
                case 36:
                    ejercicio36(entrada);
                    break;
                case 37:
                    ejercicio37(entrada);
                    break;
                case 38:
                    ejercicio38(entrada);
                    break;
                case 39:
                    ejercicio39(entrada);
                    break;
                case 40:
                    ejercicio40(entrada);
                    break;
                case 41:
                    entrada.nextLine();
                    ejercicio41(entrada);
                    break;
                case 42:
                    ejercicio42(entrada);
                    break;
                case 43:
                    ejercicio43(entrada);
                    break;
                case 44:
                    ejercicio44(entrada);
                    break;
                case 45:
                    ejercicio45(entrada);
                    break;
                case 46:
                    ejercicio46(entrada);
                    break;
                case 47:
                    ejercicio47(entrada);
                    break;
                case 48:
                    //ejercicio48(entrada);
                case 49:
                    //ejercicio49(entrada);
                case 50:
                    //ejercicio50(entrada);
                    System.out.println("Estoy en ello, paciencia\n");
                    break;
                default:
                    menuSeleccion();
                    System.out.println("Eso ni siquiera era un ejercicio");
            }
            System.out.println("Ingresa el número del siguiente ejercicio que quieres ver (0 para salir):\n");
            ejercicio = entrada.nextInt();
        }
    }

    private static boolean esBisiesto(int anho) {
        boolean bisiesto;
        if (anho % 4 == 0) {
            if (anho % 100 == 0) {
                if (anho % 400 == 0) {      //es bisiesto
                    bisiesto = true;
                } else {                    //no es bisiesto
                    bisiesto = false;
                }
            } else {                        //es bisiesto
                bisiesto = true;
            }
        } else {                            //no es bisiesto
            bisiesto = false;
        }
        return bisiesto;
    }

    private static int ejercicio1(int mes, int anho) {
        System.out.println("\n\tBoletin 3 | Ejercicio 1\n" + "Ingresa un mes y un año para mostrar en pantalla cuántos días tiene ese mes:");

        System.out.println("\nIngresa el mes [1-12]:");

        while (mes < 1 || mes > 12) {
            System.out.println("Mes no válido, vuelve a intentarlo:");
        }
        System.out.println("\nIngresa el año:");

        int dias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto(anho)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        }
        return dias;
    }

    private static void ejercicio2(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 2\n" + "Ingresa una fecha en formato dd/mm/aaaa y valida si es correcta o no con el método del ejercicio 1:");
        System.out.println("\nIngresa la fecha (dd/mm/aaaa):");
        String fecha = entrada.next();
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int anho = Integer.parseInt(fecha.substring(6, 10));

        if (dia <= 0 || mes <= 0 || mes > 12 || anho <= 0) {
            System.out.println("Fecha no válida");
        } else {
            if (dia <= ejercicio1(mes, anho)) {
                System.out.println(dia + "/" + mes + "/" + anho + " => Fecha válida");
            } else {
                System.out.println(dia + "/" + mes + "/" + anho + " => Fecha no válida");
            }
        }
    }

    private static boolean esTriangulo(int lado1, int lado2, int lado3) {
        boolean triangulo;
        if (lado1 < lado2 + lado3) {
            if (lado2 < lado1 + lado3) {
                if (lado3 < lado1 + lado2) {
                    triangulo = true;
                } else {
                    triangulo = false;
                }
            } else {
                triangulo = false;
            }
        } else {
            triangulo = false;
        }
        return triangulo;
    }

    private static void ejercicio3(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 3\n" + "Ingresa la medida de los 3 lados de un triángulo para ver si es equilátero, isósceles o escaleno:");
        System.out.println("\nIngresa los lados del triángulo");
        int lado1 = entrada.nextInt();
        int lado2 = entrada.nextInt();
        int lado3 = entrada.nextInt();

        if (esTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2) {
                if (lado2 == lado3) {
                    System.out.println("El triángulo es equilátero\n");
                } else {
                    System.out.println("El triángulo es isósceles\n");
                }
            } else if (lado1 == lado3) {
                System.out.println("El triángulo es isósceles\n");
            } else if (lado2 == lado3) {
                System.out.println("El triángulo es isósceles\n");
            } else {
                System.out.println("El triángulo es escaleno\n");
            }
        } else {
            System.out.println("No es un triángulo\n");
        }
    }

    private static boolean esVocal(String letra) {
        boolean vocal;
        if (Objects.equals(letra, "a") || Objects.equals(letra, "A") || Objects.equals(letra, "e") || Objects.equals(letra, "E") || Objects.equals(letra, "i") || Objects.equals(letra, "I") || Objects.equals(letra, "o") || Objects.equals(letra, "O") || Objects.equals(letra, "u") || Objects.equals(letra, "U")) {
            vocal = true;
        } else {
            vocal = false;
        }
        return vocal;
    }

    private static void ejercicio4a(String letra) {
        if (esVocal(letra)) {
            System.out.println(letra + " es vocal");
        } else {
            System.out.println(letra + " no es vocal");
        }
    }

    private static void ejercicio4b(String letra) {
        if (!esVocal(letra)) {
            System.out.println(letra + " es consonante");
        } else {
            System.out.println(letra + " no es consonante");
        }
    }

    private static void ejercicio4(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 4\n" + "Comprueba si el caracter ingresado es una vocal o una consonante");
        System.out.println("¿Qué quieres comprobar?\n1 · Vocales\n2 · Consonantes");
        int opcion = entrada.nextInt();

        while (opcion != 0) {
            String letra;
            switch (opcion) {
                case 1:
                    System.out.println("Comprueba si es vocal:");
                    letra = entrada.next();
                    ejercicio4a(letra);
                    break;
                case 2:
                    System.out.println("Comprueba si es consonante:");
                    letra = entrada.next();
                    ejercicio4b(letra);
                    break;
                default:
                    System.out.println("Elige otro");
                    opcion = entrada.nextInt();
                    break;
            }
        }
    }

    private static void ejercicio5(Scanner entrada) {
        String texto = entrada.next();
        String textoMinus = texto.toLowerCase();
        int longitudTexto = texto.length();
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i <= longitudTexto - 1; i++) {
            if (esVocal(String.valueOf(textoMinus.charAt(i)))) {
                switch (textoMinus.charAt(i)) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                    default:
                }
            }
        }
        float porcentajeA = (float) contadorA / longitudTexto * 100;
        float porcentajeE = (float) contadorE / longitudTexto * 100;
        float porcentajeI = (float) contadorI / longitudTexto * 100;
        float porcentajeO = (float) contadorO / longitudTexto * 100;
        float porcentajeU = (float) contadorU / longitudTexto * 100;
        System.out.println("\nCantidad A:\t" + contadorA + "\t|\tPorcentaje A:\t" + porcentajeA +
                "\nCantidad E:\t" + contadorE + "\t|\tPorcentaje E:\t" + porcentajeE +
                "\nCantidad I:\t" + contadorI + "\t|\tPorcentaje I:\t" + porcentajeI +
                "\nCantidad O:\t" + contadorO + "\t|\tPorcentaje O:\t" + porcentajeO +
                "\nCantidad U:\t" + contadorU + "\t|\tPorcentaje U:\t" + porcentajeU);
    }

    private static void ejercicio6(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 6\n" + ":");
        System.out.println("Escribe la altura y sexo de una persona para indicar su tipo de talla\n(altura en metros) género (\033[36mh\u001b[0m/\033[36mm\u001b[0m):");
        float altura = entrada.nextFloat();
        String genero = entrada.next().toLowerCase();
        while (altura != 0) {
            switch (genero) {
                case "m":
                    if (altura <= 1.65) {

                    }
                    break;
                case "h":
                    break;
                default:
                    System.out.println("Género no contemplado, repítalo (\033[36mh\u001b[0m/\033[36mm\u001b[0m)");
                    genero = entrada.next().toLowerCase();
            }
        }
    }

    private static void ejercicio7(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 7\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio8(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 8\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio9(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 9\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio10(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 10\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio11(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 11\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio12(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 12\n" + "Escribe un método recursivo que reciba un número y devuelva el número de dígitos que tiene");
        System.out.println("Ingresa el número a evaluar");
        int numeroEntrada = entrada.nextInt();
        int numero = Math.abs(numeroEntrada);
        System.out.println(numeroEntrada + " tiene " + longitudNumero(numero) + " dígitos");

    }

    private static int longitudNumero(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + longitudNumero(n / 10);
        }
    }

    private static void ejercicio13(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 13\n" + "Escribe un método recursivo para calcular la potencia de dos numeros con base real y potencia entera:");
        System.out.println("Ingresa la Base real y la potencia entera:");
        double numeroReal = entrada.nextDouble();
        int numeroEntero = entrada.nextInt();
        System.out.println(numeroReal + " ^ " + numeroEntero + " = " + potencia(numeroReal, numeroEntero));
    }

    private static double potencia(double x, int n) {
        if (n < 0) {
            if (n == -1) {
                return (1 / x);
            } else {
                return (1 / x) * potencia(x, n + 1);
            }
        } else if (n > 0) {
            if (n == 1) {
                return x;
            } else {
                return x * potencia(x, n - 1);
            }
        } else {
            return 1;
        }
    }

    private static void ejercicio14(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 14\n" + "Escribe un método recursivo para calcular, dado un término entero positivo, su correspondiente valor de la sucesión de Fibonacci:");
        System.out.println("Ingresa el término de la sucesión de Fibonacci a calcular:");
        int sucesion = entrada.nextInt();
        System.out.println(fibonacci(sucesion));
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1 || n < 0) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static void ejercicio15(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 15\n" + "Escribe un método recursivo para invertir un número entero:");
        System.out.println("Ingresa el número entero a invertir:");
        int numeroInvertir = entrada.nextInt();
        System.out.println(invertirNumero(numeroInvertir));
    }

    private static int invertirNumero(int n) {
        int l = longitudNumero(n);
        if (l == 1) {
            return n;
        } else {
            return n % 10 * (int) Math.pow(10, l - 1) + invertirNumero(n / 10);
        }
    }

    private static void ejercicio16(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 16\n" + "Escribe un método recursivo para calcular, dado un término entero positivo, la suma de sus dígitos:");
        System.out.println("Ingresa el término a calcular:");
        int numeroSumar = entrada.nextInt();
        System.out.println(sumaDigitos(numeroSumar));
    }

    private static int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumaDigitos(n / 10);
        }
    }

    private static void ejercicio17(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 17\n" + "Escribe un método recursivo para calcular, siguiendo el algoritmo de euclides, el máximo común divisor de dos números:");
        System.out.println("Ingresa los 2 números a calcular:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        System.out.println(maximoComunDivisor(numero1, numero2));
    }

    private static int maximoComunDivisor(int a, int b) {
        if (b <= a && a % b == 0) {
            return b;
        } else if (a < b) {
            return maximoComunDivisor(b, a);
        } else {
            return maximoComunDivisor(b, a % b);
        }
    }

    private static void ejercicio18(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 18\n" + "Escribe un método recursivo para calcular si un número es par o no:");
        System.out.println("Ingresa el número a comprobar:");
        int seraPar = entrada.nextInt();
        if (esPar(seraPar)) {
            System.out.println("El número " + seraPar + " es Par");
        } else {
            System.out.println("El número " + seraPar + " es Impar");
        }
    }

    private static boolean esPar(int numero) {
        if (numero > 1) {
            return esPar(numero - 2);
        } else if (numero == 1) {
            return false;
        } else {
            return true;
        }
    }

    private static void ejercicio19(Scanner entrada) {
        System.out.println("\n\tBoletin 3 | Ejercicio 19\n" + "Escribir un método recursivo que calcule la serie 1 + 2 + 3 + ... + n-1 + n:");
        System.out.println("Ingresa el valor n de la serie:");
        int numeroSerie = entrada.nextInt();
        System.out.println("El " + numeroSerie + "º término de la serie es " + serieEnteros(numeroSerie));
    }

    private static int serieEnteros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + serieEnteros(n - 1);
        }
    }

    private static void ejercicio20(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 20\n" + "Escribe un método lógico recursivo que determine si una cadena recibida por parámetro es un palíndromo:");
        System.out.println("Ingresa la cadena a comprobar:");
        String palindromo = entrada.next();

        if (esPalindromo(palindromo)) {
            System.out.println(palindromo + " es palíndromo");
        } else {
            System.out.println(palindromo + " no es palíndromo");
        }
    }

    private static boolean esPalindromo(String texto) {
        int longitud = texto.length();
        if (longitud < 2) {
            return true;
        } else {
            return texto.charAt(0) == (texto.charAt(longitud - 1)) && esPalindromo(texto.substring(1, longitud - 1));
        }
    }

    private static void ejercicio21(Scanner entrada) {

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

    private static boolean esCapicua(int numero) {
        int longitud = longitudNumero(numero);
        if (longitud < 2) {
            return true;
        } else {
            return numero / (int) Math.pow(10, longitud - 1) == numero % 10 && esCapicua((numero % (int) Math.pow(10, longitud - 1)) / 10);
        }
    }

    private static void ejercicio22(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 22\n");
        System.out.println("Escribe un método recursivo que resuelva las Torres de Hanoi dada una cantidad definida de discos:");
        int numeroDiscos = entrada.nextInt();
        int posteOrigen = entrada.nextInt();
        int posteAuxiliar = entrada.nextInt();
        int posteDestino = entrada.nextInt();
        System.out.println("Número de discos: " + numeroDiscos);
        torresDeHanoi(numeroDiscos, 1, 2, 3);
    }

    private static void torresDeHanoi(int numeroDiscos, int posteOrigen, int posteAuxiliar, int posteDestino) {
        if (numeroDiscos <= 2) {
            System.out.println("mover disco de " + posteOrigen + " a " + posteAuxiliar +
                    "\nmover disco de " + posteOrigen + " a " + posteDestino +
                    "\nmover disco de " + posteAuxiliar + " a " + posteDestino);
        } else {
            torresDeHanoi(numeroDiscos - 1, posteOrigen, posteDestino, posteAuxiliar);
            System.out.println("mover disco de " + posteOrigen + " a " + posteDestino);
            torresDeHanoi(numeroDiscos - 1, posteAuxiliar, posteOrigen, posteDestino);
        }
    }

    private static void ejercicio23() {

        System.out.println("\n\tBoletin 3 | Ejercicio 23\n");
        System.out.println("Completar el Siguiente Código:");

        Point puntoOrigen = new Point(23, 94);
        //  Completar: mostrar coordenadas x e y utilizando un campo de la clase
        System.out.println("coordenada X: " + puntoOrigen.x);
        System.out.println("coordenada Y: " + puntoOrigen.y);

        //  Completar: mostrar coordenadas utilizando métodos de dos modos distintos
        System.out.println("coordenada X: " + puntoOrigen.getX());
        System.out.println("coordenada Y: " + puntoOrigen.getY());
        System.out.println("coordenada Y: " + puntoOrigen.getLocation());

        //  Traslada el punto incrementando las coordenadas x e y en 50 unidades cada una
        puntoOrigen.translate(50, 50);
        System.out.println("coordenada X: " + puntoOrigen.x);
        System.out.println("coordenada Y: " + puntoOrigen.y);

        //  ¿Qué hace la siguiente instrucción?
        int coordenadax = new Point(10, 10).x;

        ///  Almacena en la variable coordenadax el valor x de la instancia recién creada

        //  ¿Podría recuperarse la coordenada y del punto anterior?
        //  No se puede recuperar porque almacena la variable almacena solo el valor x de la instancia creada.
    }

    private static void ejercicio24() {

        System.out.println("\n\tBoletin 3 | Ejercicio 24\n" + "Completa el siguiente código:");
        // 1. Crear una instancia de la clase rectángulo.
        Rectangle Rectangulo = new Rectangle(1, 1, 161, 100);
        /* 2. Leer el ancho y alto utilizando campos. Almacenar los resultados
           en variables y mostrarlos. Observar el tipo devuelto para saber de
           qué tipo hay que declarar las variables.*/
        int anchoRectangulo = Rectangulo.width;
        int altoRectangulo = Rectangulo.height;
        System.out.println("altoRectangulo = " + altoRectangulo);
        System.out.println("anchoRectangulo = " + anchoRectangulo);
        // 3. Cambiar el ancho a 25 y el alto a 30 modificando los campos.
        Rectangulo.width = 25;
        Rectangulo.height = 30;
        System.out.println("Ancho = " + Rectangulo.width);
        System.out.println("Alto = " + Rectangulo.height);
        // 4. Mostrar el ancho y alto utilizando métodos.
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        // 5. Cambiar el ancho y alto a 200, 200 mediante un método y mostrarlo.
        Rectangulo.setSize(200, 200);

        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        /* 6. Cambiar mediante un método la posición a 5,5, el ancho a 50 y el
           alto a 40.*/
        Rectangulo.setBounds(5, 5, 50, 40);
        System.out.println("Coordenada X = " + Rectangulo.getX());
        System.out.println("Coordenada Y = " + Rectangulo.getY());
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());
        /* 7. Cambiar mediante un método la posición a 10, 12, el ancho a 100 y
           el alto a 100*/
        Rectangulo.setBounds(10, 12, 100, 100);
        System.out.println("Coordenada X = " + Rectangulo.getX());
        System.out.println("Coordenada Y = " + Rectangulo.getY());
        System.out.println("Ancho = " + Rectangulo.getWidth());
        System.out.println("Alto = " + Rectangulo.getHeight());

    }


    private static void ejercicio25(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 25\n" + "Escribir una aplicación que lea un double por teclado y rerdondee a entero de tres formas:\n");
        System.out.println("Ingresa un valor decimal:");
        double numero = entrada.nextDouble();
        System.out.println("a.\tEntero más cercano a " + numero + ": " + Math.round(numero) +
                "\nb.\tEntero más cercano a " + numero + " hacia +infinito: " + Math.ceil(numero) +
                "\nc.\tEntero más cercano a " + numero + " hacia -infinito: " + Math.floor(numero));
    }

    private static void ejercicio26(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 26\n" + "Escribir un programa que lea por teclado un ángulo expresado en grados y muestre por pantalla su seno, coseno y tangente:");
        System.out.println("Ingresa un valor en grados:");
        double grados = entrada.nextDouble();
        System.out.println("Grados =\t" + grados + "º\n" +
                "Seno\t\t=\t" + Math.sin(Math.toRadians(grados)) +
                "\nCoseno\t\t=\t" + Math.cos(Math.toRadians(grados)) +
                "\nTangente\t=\t" + Math.tan(Math.toRadians(grados)));
    }

    private static void ejercicio27(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 27\n" + "Escribir un programa que simule el lanzamiento de un dado y muestre por pantalla la frecuencia de los resultados de mil lanzamientos:");
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;
        for (int i = 0; i < 1000; i++) {
            int tirada = lanzarDado();
            switch (tirada) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                case 6:
                    contador6++;
                    break;
            }
        }
        System.out.println("Tiradas 1: " + contador1 + "\tFrecuencia: " + ((double) contador1 * 100 / 1000) + "%" +
                "\nTiradas 3: " + contador3 + "\tFrecuencia: " + ((double) contador3 * 100 / 1000) + "%" +
                "\nTiradas 2: " + contador2 + "\tFrecuencia: " + ((double) contador2 * 100 / 1000) + "%" +
                "\nTiradas 4: " + contador4 + "\tFrecuencia: " + ((double) contador4 * 100 / 1000) + "%" +
                "\nTiradas 5: " + contador5 + "\tFrecuencia: " + ((double) contador5 * 100 / 1000) + "%" +
                "\nTiradas 6: " + contador6 + "\tFrecuencia: " + ((double) contador6 * 100 / 1000) + "%" +
                "\nTiradas Totales: " + (contador1 + contador2 + contador3 + contador4 + contador5 + contador6));
    }

    private static int lanzarDado() {
        return (int) Math.floor(Math.random() * 6 + 1);
    }

    private static void ejercicio28(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 28\n" + "Escribir un método que simule el lanzamiento de dos dados. El método recibirá un número por parámetro y devolverá true cuando los dos dados devuelvan dicho número. Invoca el método un millón de veces y calcular el porcentaje de veces que los dos dados obtienen el número indicado:");
        System.out.println("Ingresa el número a consultar (entre 1 y 6):");
        int valorDados = entrada.nextInt();
        int contadorDados = 0;
        for (int i = 0; i < 1000000; i++) {
            if (lanzarDosDados(valorDados)) {
                contadorDados++;
            }
        }
        System.out.println("Nº de veces que salió el " + valorDados + " en ambos dados: " + contadorDados +
                "\nFrecuencia: " + ((double) contadorDados * 100 / 1000000) + "%");
    }

    private static boolean lanzarDosDados(int valorDados) {
        int dado1 = lanzarDado();
        int dado2 = lanzarDado();
        if (dado1 == dado2 && dado1 == valorDados) {
            return true;
        } else {
            return false;
        }
    }

    private static void ejercicio29() {

        System.out.println("\n\tBoletin 3 | Ejercicio 29\n" + "Escribe una aplicación en Java que genere números aleatorios entre 1 y 1000000 hasta que el número generado sea 25. Una vez generado, indicar cuántos números se generaron en la simulación e indicar el tiempo en segundos que tardó en obtenerse:\n");
        generador25();
    }

    private static void generador25() {
        int numeroGenerado, contadorGenerador = 0;
        long inicioGenerador = System.currentTimeMillis();
        do {
            numeroGenerado = (int) Math.floor(Math.random() * 999999 + 1);
            contadorGenerador++;
        } while (numeroGenerado != 25);
        long finGenerador = System.currentTimeMillis();
        System.out.println("Veces ejecutado: " + contadorGenerador);
        System.out.println("Tiempo transcurrido: " + (double) (finGenerador - inicioGenerador) / 1000 + " segundos");
    }

    private static void ejercicio30(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 30\n" + "Escribir una aplicación en Java que, dadas dos medidas de los catetos de un triángulo rectángulo, devuelva la medida de la hipotenusa:");
        System.out.println("\nIngresa los valores de los catetos:");
        double cateto1 = entrada.nextDouble();
        double cateto2 = entrada.nextDouble();
        System.out.println(
                "Cateto 1\t=\t" + cateto1 +
                        "\nCateto 2\t=\t" + cateto2 +
                        "\nHipotenusa\t=\t" + calcularHipotenusa(cateto1, cateto2));
    }

    private static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt((cateto1 * cateto1 + cateto2 * cateto2));
    }

    private static void ejercicio31(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 31\n" + "Escribir un método que, a partir de la arista de un cubo, devuelva su volumen:");
        System.out.println("\nIngresa el valor de la arista del cubo:");
        double arista = entrada.nextDouble();
        double volumenCubo = calcularVolumenCubo(arista);
        System.out.println("para un cubo de arista " + arista + ", su volumen será " + volumenCubo);
    }

    private static double calcularVolumenCubo(double arista) {
        return arista * arista * arista;
    }

    private static void ejercicio32() {

        System.out.println("\n\tBoletin 3 | Ejercicio 32\n" + "Escribe una función que devuelva los resultados de la función f(x) para los enteros de x entre [-100, 100]:");
        System.out.println("x\tf(x)");
        for (int i = -100; i <= 100; i++) {
            System.out.println(i + "    " + funcionF(i));
        }
    }

    private static double funcionF(int gradoEntero) {
        return Math.sin(4 * Math.toRadians(gradoEntero)) + Math.cos(2 * Math.toRadians(gradoEntero));
    }

    private static void ejercicio33() {

        System.out.println("\n\tBoletin 3 | Ejercicio 33\n" + "Escribe una aplicación que simule una partida de cara o cruz con precio por cada tirada y premio cada ronda que el número de caras supere al de cruces:");
        jugarCaraOCruz();
    }

    private static void jugarCaraOCruz() {
        int costeRonda = 0, costeTotal = 0, conteoGanado = 0, conteoPerdido = 0, numeroSimulaciones = 100;

        for (int i = 0; i < numeroSimulaciones; i++) {
            int cantidadCara = 0, cantidadCruz = 0;
            do {
                if (lanzarCaraOCruz()) {
                    costeRonda++;
                    cantidadCara++;
                } else {
                    costeRonda++;
                    cantidadCruz++;
                }

            } while (cantidadCara - cantidadCruz != 3);
            costeTotal += 10 - costeRonda;
            if (10 - costeRonda > 0) {
                conteoGanado++;
            } else {
                conteoPerdido++;
            }
            costeRonda = 0;

        }
        System.out.println(
                "Partidas Ganadas\t=\t" + conteoGanado +
                        "\nPartidas Perdidas\t=\t" + conteoPerdido +
                        "\nFrecuencia Ganadas\t=\t" + ((double) conteoGanado * 100 / numeroSimulaciones) + "%" +
                        "\nDinero Total\t=\t" + costeTotal
        );
    }

    private static boolean lanzarCaraOCruz() {
        if (Math.round(Math.random()) == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static void ejercicio34(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 34\n" + "Escribe una aplicación que lea del teclado una cadena de caracteres y muestre la siguiente información:");
        System.out.println("\nIngresa una cadena de caracteres:");
        String cadena = entrada.next();
        System.out.println("a. Longitud = " + cadena.length());
        if (cadena.length() >= 7) {
            System.out.println("b. 7º Caracter = " + cadena.charAt(6));
        } else {
            System.out.println("b. " + cadena + " no tiene un 7º Caracter");
        }
        if (cadena.indexOf("x") != -1) {
            System.out.println("c. la posición del caracter 'x' es " + cadena.indexOf("x"));
        } else {
            System.out.println("c. la cadena " + cadena + "no tiene el signo 'x'");
        }
        System.out.println("d. " + cadena.toUpperCase());
    }

    private static void ejercicio35(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 35\n" + "Escribir una aplicación que lea del teclado una cadena de caracteres y muestre cuántas veces aparece en ella la letra 'a'. Utiliza un bucle para recorrer caracter a caracter:");
        String cadena = entrada.next();
        int conteoA = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.toLowerCase().charAt(i) == 'a') {
                conteoA++;
            }
        }
        System.out.println("Cantidad de aes en " + cadena + " = " + conteoA);
        ;
    }

    private static void ejercicio36(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 36\n" + "Escribe un programa que lea por teclado una cadena de caracteres y, a partir de ella, cree otra al revés:");
        String cadena = entrada.next();
        String cadenaInversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInversa = cadenaInversa.concat(cadena.substring(i, i + 1));
        }
        System.out.println(cadenaInversa);
    }

    private static void ejercicio37(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 37\n" + "Escribe una aplicación que concatene dos cadenas de caracteres leidas por teclado con un espacio en blanco entre ellas:");
        System.out.println("Ingresa dos cadenas de caracteres:");
        String cadena1 = entrada.next();
        String cadena2 = entrada.next();
        String cadenaFinal = cadena1.concat(" ").concat(cadena2);
        System.out.println(cadenaFinal);
    }

    private static void ejercicio38(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 38\n" + "Sin utilizar los métodos equals() o equalsIgnoreCase(), escribe un método que reciba dos cadenas e indique si son iguales o no:");
        System.out.println("\nIngresa dos cadenas de caracteres:");
        String cadena1 = entrada.next();
        String cadena2 = entrada.next();
        compararStrings(cadena1, cadena2);
    }

    private static void compararStrings(String cadena1, String cadena2) {
        boolean cadenasComparadas = true;
        if (cadena1.length() == cadena2.length()) {
            for (int i = 0; i < cadena1.length(); i++) {
                cadenasComparadas &= (cadena1.charAt(i) == cadena2.charAt(i));
            }
            if (cadenasComparadas) {
                System.out.println(cadena1 + " y " + cadena2 + " son iguales");
            } else {
                System.out.println(cadena1 + " y " + cadena2 + " no son iguales");
            }
        } else {
            System.out.println(cadena1 + " y " + cadena2 + " no son iguales");
        }
    }

    private static void ejercicio39(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 39\n" + "Escribe un método que reciba una palabra y que determine si es un palíndromo o no:");
        int numeroMetodo = entrada.nextInt();
        while (numeroMetodo != 0) {
            switch (numeroMetodo) {
                case 1: //método iterativo que compara los caracteres uno a uno
                    String cadenaA = entrada.next();
                    if (esPalindromoA(cadenaA)) {
                        System.out.println(cadenaA + " es un palíndromo");
                    } else {
                        System.out.println(cadenaA + " no es un palíndromo");
                    }
                    break;
                case 2: //método iterativo que invierte la cadena y la compara con la original
                    String cadenaB = entrada.next();

                    if (esPalindromoB(cadenaB)) {
                        System.out.println(cadenaB + " es un palíndromo");
                    } else {
                        System.out.println(cadenaB + " no es un palíndromo");
                    }
                    break;
                case 3: //método con la clase StringBuilder
                    String cadenaC = entrada.next();
                    if (esPalindromoC(cadenaC)) {
                        System.out.println(cadenaC + " es un palíndromo");
                    } else {
                        System.out.println(cadenaC + " no es un palíndromo");
                    }
                    break;
                case 4: //método recursivo
                    String cadenaD = entrada.next();
                    if (esPalindromo(cadenaD)) {
                        System.out.println(cadenaD + " es un palíndromo");
                    } else {
                        System.out.println(cadenaD + " no es un palíndromo");
                    }
                    break;
            }
            numeroMetodo = entrada.nextInt();
        }
    }

    private static boolean esPalindromoA(String texto) {
        boolean esPalindromo = true;
        for (int i = 0; i < texto.length(); i++) {
            esPalindromo &= (texto.charAt(i) == texto.charAt(texto.length() - 1 - i));
        }
        return esPalindromo;
    }

    private static boolean esPalindromoB(String texto) {
        boolean esPalindromo = true;
        String cadenaInversa = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            cadenaInversa = cadenaInversa.concat(texto.substring(i, i + 1));
        }
        for (int i = 0; i < texto.length(); i++) {
            esPalindromo &= (texto.charAt(i) == cadenaInversa.charAt(i));
        }
        return esPalindromo;
    }

    private static boolean esPalindromoC(String texto) {
        boolean esPalindromo = true;
        StringBuilder cadenaOriginal = new StringBuilder(texto);
        String cadenaInversa = cadenaOriginal.reverse().toString();
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            esPalindromo &= texto.charAt(i) == cadenaInversa.charAt(i);
        }
        return esPalindromo;
    }

    /// Ejercicio 39 sobrecargas
    /*
    private static boolean esPalindromoA(String texto, boolean soloLetras){

    }*/
    private static void ejercicio40(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 40\n" + "Escribir un método que reciba dos cadenas e indique si la segunda es una subsecuencia de la primera:");
        System.out.println("\nIngresa las dos cadenas a comprobar:");
        String cadena1 = entrada.next();
        String cadena2 = entrada.next();
        comprobarSubcadena(cadena1, cadena2);
    }

    private static void comprobarSubcadena(String cadena1, String cadena2) {
        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();
        boolean esSubcadena = false;
        for (int i = 0; i < longitud1 - longitud2; i++) {
            esSubcadena |= cadena1.substring(i, longitud2 + i).equals(cadena2);
        }
        if (esSubcadena) {
            System.out.println(cadena2 + " es subcadena de " + cadena1);
        } else {
            System.out.println(cadena2 + " no es subcadena de " + cadena1);
        }
    }

    private static void ejercicio41(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 41\n" + "Crea una aplicación que cuente las letras y las palabras de una cadena de texto:");
        String cadena;
        cadena = entrada.nextLine();
        contarPalabrasYLetras(cadena);
    }

    private static void contarPalabrasYLetras(String texto) {
        int contadorPalabras = 1;
        int contadorLetras = 0;
        texto = texto.trim();
        for (int i = 0; i < texto.length(); i++) {
            if (texto.isEmpty()) {
                System.out.println("El texto está vacío");
                contadorPalabras = 0;
                break;
            } else if (isLetter(texto.charAt(i))) {
                contadorLetras++;
            } else if (isWhitespace(texto.charAt(i))) {
                contadorPalabras++;
            }
        }
        System.out.println(texto +
                "\nNº Palabras = " + contadorPalabras +
                "\nNº Letras = " + contadorLetras);
    }

    private static void ejercicio42(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 42\n" + "Escribe una aplicación que reciba una cadena de texto y devuelva su acrónimo:");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        crearAcronimo(cadena);
    }

    private static void crearAcronimo(String texto) {
        String acronimo = "";
        texto = texto.trim();
        acronimo += texto.charAt(0);
        for (int i = 0; i < texto.length(); i++) {
            if (isWhitespace(texto.charAt(i)) && isLetter(texto.charAt(i + 1))) {
                acronimo += texto.charAt(i + 1);
            }
        }
        acronimo = acronimo.toUpperCase();
        System.out.println(texto + "\nSu acrónimo es = " + acronimo);
    }

    private static void ejercicio43(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 43\n" + "Muestra la distancia de Hamming entre dos números enteros:");
        int entero1 = entrada.nextInt();
        int entero2 = entrada.nextInt();
        calcularDistanciaHamming(entero1, entero2);
    }

    private static void calcularDistanciaHamming(int entero1, int entero2) {
        String cadena1 = toBinaryString(entero1);
        String cadena2 = toBinaryString(entero2);
        int contadorHamming = 0;
        if (cadena1.length() != cadena2.length()) {
            int distancia = Math.abs(cadena1.length() - cadena2.length());
            for (int i = 0; i < distancia; i++) {
                if (cadena1.length() < cadena2.length()) {
                    cadena1 = "0" + cadena1;
                } else {
                    cadena2 = "0" + cadena2;
                }
            }
        }
        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) != cadena2.charAt(i)) {
                contadorHamming++;
            }
        }
        System.out.println(entero1 + " = " + cadena1);
        System.out.println(entero2 + " = " + cadena2);
        System.out.println("La distancia de Hamming entre " + entero1 + " y " + entero2 + " es " + contadorHamming);
    }

    private static void ejercicio44(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 44\n" + "Escribe una aplicación donde ingreses un nombre y apellidos con varios espacios entre ellos y te devuelva el nombre con solo un espacio entre cada palabra:");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        System.out.println(cadena+"\nbien formateado es = '"+formatearNombre(cadena)+"'");
    }
    private static String formatearNombre(String texto){
        String textoOriginal = texto;
        texto = texto.trim();
        String nombreFormateado = "";
        for (int i = 0; i < texto.length(); i++){
            if(isWhitespace(texto.charAt(i))){
                nombreFormateado = nombreFormateado + " " + texto.substring(0, i);
                texto = texto.substring(i).trim();
            }
        }
        nombreFormateado = nombreFormateado.trim() + " " + texto.trim();
        return nombreFormateado;
    }

    private static void ejercicio45(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 45\n" + "Excribe una aplicación que compruebe si un NIF es correcto:");
        String cadena = entrada.next();
        comprobarNIF(cadena);
    }
    private static void comprobarNIF(String texto){
        String comprobante = "TRWAGMYFPDXBNJZSQVHLCKE";
        if(texto.length()==9 && isLetter(texto.charAt(8)) && isDigit(texto.charAt(0))&& isDigit(texto.charAt(1))&& isDigit(texto.charAt(2))&& isDigit(texto.charAt(3))&& isDigit(texto.charAt(4))&& isDigit(texto.charAt(5))&& isDigit(texto.charAt(6))&& isDigit(texto.charAt(7))) {
            Integer dni = Integer.valueOf(texto.substring(0, 8));
            Character letraDNI = toUpperCase(texto.charAt(8));
            if (comprobante.charAt(dni % 23) == letraDNI) {
                System.out.println("El NIF " + texto.toUpperCase() + " es correcto");
            } else {
                System.out.println("El NIF " + texto.toUpperCase() + " no es correcto");
            }
        } else {
            System.out.println("Este no es un NIF correcto");
        }
    }

    private static void ejercicio46(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 46\n" + ":");
        entrada.nextLine();
        String cadena = entrada.nextLine();
        //verificarCuentaBancaria(formatearNombre(cadena));
    }/*
    private static void verificarCuentaBancaria(String texto){
        String codigoBanco = (texto.substring(0, 4));
        String codigoEntidad = (texto.substring(5, 9));
        String digitosControl = (texto.substring(10, 12));
        String numeroCuenta = texto.substring(13);
        System.out.println(texto+"\n"+codigoBanco+codigoEntidad+digitosControl+numeroCuenta);
        int aa = Integer.valueOf(codigoBanco.charAt(0))*4;
        int ab = Integer.valueOf(codigoBanco.charAt(1))*8;
        int ac = Integer.valueOf(codigoBanco.charAt(2))*5;
        int ad = Integer.valueOf(codigoBanco.charAt(3))*10;
        int ae = Integer.valueOf(codigoEntidad.charAt(0))*9;
        int af = Integer.valueOf(codigoEntidad.charAt(1))*7;
        int ag = Integer.valueOf(codigoEntidad.charAt(2))*3;
        int ah = Integer.valueOf(codigoEntidad.charAt(3))*6;
        Integer primerDigitoControl = 11-((aa+ab+ac+ad+ae+af+ag+ah)%11);
        if(primerDigitoControl == 11){
            primerDigitoControl = 0;
        } else if (primerDigitoControl == 10) {
            primerDigitoControl = 1;
        }
        System.out.println("primerDigitoControl = " + primerDigitoControl);
        System.out.println("digitosControl = " + digitosControl);
    }*/

    private static void ejercicio47(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 47\n" + ":");
        System.out.println(":");
        entrada.nextLine();
        String fecha = entrada.nextLine();
        comprobarFecha(fecha);
    }
    private static void comprobarFecha(String texto){
        LocalDate fechaNacimiento = LocalDate.parse(texto);
        LocalDate fechaJubilacion = fechaNacimiento.plusYears(67);
        System.out.println("Día de la semana en que nació = "+fechaNacimiento.getDayOfWeek());
        System.out.println("Fecha de Jubilación = "+fechaJubilacion);
    }

    private static void ejercicio48(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 48\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio49(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 49\n" + "Escribir un programa que solicite una fecha y muestre el calendario del mes indicado:");
        System.out.println(":");

        //Calendario();
    }

    private static void Calendario(Date Date) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%5d", i);
            }
        }
    }

    private static void ejercicio50(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 50\n" + ":");
        System.out.println(":");
    }
}

