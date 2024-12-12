package src.UD3;

import java.util.Objects;
import java.util.Scanner;

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
                        "        ┃    " + terminado + "18" + reset + "    │    " + terminado + "19" + reset + "    │    " + saltado + "20" + reset + "    │    " + enProceso + "21" + reset + "    │    " + incubadora + "22" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                      Uso básico de " + destacado + "objetos" + reset + "                      ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + incubadora + "23" + reset + "               │               " + incubadora + "24" + reset + "               ┃\n" +
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
                case 22:
                    //ejercicio22(entrada);
                case 23:
                    //ejercicio23(entrada);
                case 24:
                    //ejercicio24(entrada);
                case 25:
                    //ejercicio25(entrada);
                case 26:
                    //ejercicio26(entrada);
                case 27:
                    //ejercicio27(entrada);
                case 28:
                    //ejercicio28(entrada);
                case 29:
                    //ejercicio29(entrada);
                case 30:
                    //ejercicio30(entrada);
                case 31:
                    //ejercicio31(entrada);
                case 32:
                    //ejercicio32(entrada);
                case 33:
                    //ejercicio33(entrada);
                case 34:
                    //ejercicio34(entrada);
                case 35:
                    //ejercicio35(entrada);
                case 36:
                    //ejercicio36(entrada);
                case 37:
                    //ejercicio37(entrada);
                case 38:
                    //ejercicio38(entrada);
                case 39:
                    //ejercicio39(entrada);
                case 40:
                    //ejercicio40(entrada);
                case 41:
                    //ejercicio41(entrada);
                case 42:
                    //ejercicio42(entrada);
                case 43:
                    //ejercicio43(entrada);
                case 44:
                    //ejercicio44(entrada);
                case 45:
                    //ejercicio45(entrada);
                case 46:
                    //ejercicio46(entrada);
                case 47:
                    //ejercicio47(entrada);
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
        for (int i = 0; i <= longitudTexto-1 ; i++) {
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
        System.out.println( "\nCantidad A:\t" + contadorA + "\t|\tPorcentaje A:\t" + porcentajeA +
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
        while (altura != 0){
            switch (genero){
                case "m":
                    if(altura <= 1.65){

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
        System.out.println("El "+numeroSerie+"º término de la serie es "+serieEnteros(numeroSerie));
    }

    private static int serieEnteros(int n){
        if(n==1){
            return 1;
        } else{
            return n + serieEnteros(n-1);
        }
    }

    private static void ejercicio20(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 20\n" + "Escribe un método lógico recursivo que determine si una cadena recibida por parámetro es un palíndromo:");
        System.out.println("Ingresa la cadena a comprobar:");
        String palindromo = entrada.next();
        /*
        if(esPalindromo(palindromo)){
            System.out.println(palindromo+" es palíndromo");
        } else{
            System.out.println(palindromo+" no es palíndromo");
        }*/
        invertirCadena(palindromo);
    }

    private static boolean esPalindromo(String texto){
        int longitud = texto.length();
        if (longitud <= 2){
            return true;
        } else{
            return texto.charAt(1) == texto.charAt(longitud-1) && esPalindromo(texto);
        }
        /*
        * charat(1).equals(charat(longitud-1) && ...
        * */
    }
    private static void invertirCadena(String texto){
        int longitud = texto.length();
        String textoInvertido = "";
        for (int i = longitud-1; i >= 0; i--){
            textoInvertido.concat(String.valueOf(texto.charAt(i)));
        }
        System.out.println(textoInvertido);
    }

    private static void ejercicio21(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 21\n" + ":");
        System.out.println("Escribe un método lógico recursivo que determine si un número entero recibido por parámetro es capicúa:");
        int numeroCapicua = entrada.nextInt();
        if(esCapicua(numeroCapicua)){
            System.out.println("El número "+numeroCapicua+" es capicúa");
        } else {
            System.out.println("El número "+numeroCapicua+" no es capicúa");
        }
    }

    private static boolean esCapicua(int numero){
        int longitud = longitudNumero(numero);
        /*for (int i = longitud; i>0; i--){
            return true;
        }*/
        return true;
    }

    private static void ejercicio22(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 22\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio23(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 23\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio24(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 24\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio25(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 25\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio26(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 26\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio27(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 27\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio28(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 28\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio29(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 29\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio30(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 30\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio31(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 31\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio32(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 32\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio33(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 33\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio34(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 34\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio35(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 35\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio36(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 36\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio37(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 37\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio38(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 38\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio39(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 39\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio40(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 40\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio41(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 41\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio42(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 42\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio43(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 43\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio44(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 44\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio45(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 45\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio46(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 46\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio47(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 47\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio48(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 48\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio49(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 49\n" + ":");
        System.out.println(":");
    }

    private static void ejercicio50(Scanner entrada) {

        System.out.println("\n\tBoletin 3 | Ejercicio 50\n" + ":");
        System.out.println(":");
    }
}

