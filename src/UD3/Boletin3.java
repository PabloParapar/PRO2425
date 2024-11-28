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
                        "        ┃    " + terminado + " 1" + reset + "    │    " + terminado + " 2" + reset + "    │    " + terminado + " 3" + reset + "    │    " + terminado + " 4" + reset + "    │    " + saltado + " 5" + reset + "    │    " + incubadora + " 6" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + incubadora + " 7" + reset + "    │    " + incubadora + " 8" + reset + "    │    " + incubadora + " 9" + reset + "    │    " + incubadora + "10" + reset + "    │    " + incubadora + "11" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                 Ejercicios de " + destacado + "métodos recursivos" + reset + "                ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + enProceso + "12" + reset + "    │    " + snooze + "13" + reset + "    │    " + snooze + "14" + reset + "    │    " + snooze + "15" + reset + "    │    " + snooze + "16" + reset + "    │    " + snooze + "17" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + snooze + "18" + reset + "    │    " + snooze + "19" + reset + "    │    " + snooze + "20" + reset + "    │    " + snooze + "21" + reset + "    │    " + snooze + "22" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                      Uso básico de " + destacado + "objetos" + reset + "                      ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + snooze + "23" + reset + "               │               " + snooze + "24" + reset + "               ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                   Ejercicios de la clase " + destacado + "Math" + reset + "                   ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + snooze + "25" + reset + "    │    " + snooze + "26" + reset + "    │    " + snooze + "27" + reset + "    │    " + snooze + "28" + reset + "    │    " + snooze + "29" + reset + "    │    " + snooze + "30" + reset + "    ┃\n" +
                        "        ┠──────────┴──────────┼──────────┴──────────┼──────────┴──────────┨\n" +
                        "        ┃          " + snooze + "31" + reset + "         │          " + snooze + "32" + reset + "         │          " + snooze + "33" + reset + "         ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                  Ejercicios de la clase " + destacado + "String" + reset + "                  ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + snooze + "34" + reset + "    │    " + snooze + "35" + reset + "    │    " + snooze + "36" + reset + "    │    " + snooze + "37" + reset + "    │    " + snooze + "38" + reset + "    │    " + snooze + "39" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + snooze + "40" + reset + "    │    " + snooze + "41" + reset + "    │    " + snooze + "42" + reset + "    │    " + snooze + "43" + reset + "    │    " + snooze + "44" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃        Ejercicios de la clase " + destacado + "String" + reset + " y " + destacado + "clases envoltorio" + reset + "        ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + snooze + "45" + reset + "               │               " + snooze + "46" + reset + "               ┃\n" +
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
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    ejercicio12(entrada);
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
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
        for (int i = 0; i <= longitudTexto; i++) {
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
                }
            }
        }
        float porcentajeA = (float) contadorA / longitudTexto * 100;
        float porcentajeE = (float) contadorE / longitudTexto * 100;
        float porcentajeI = (float) contadorI / longitudTexto * 100;
        float porcentajeO = (float) contadorO / longitudTexto * 100;
        float porcentajeU = (float) contadorU / longitudTexto * 100;
        System.out.println("\nCantidad A:\t" + contadorA + "\t|\tPorcentaje A:\t" + porcentajeA);
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

    private static void ejercicio13(Scanner entrada){
        System.out.println("Ingresa la Base real y la potencia entera:");
        double numeroReal = entrada.nextDouble();
        int numeroEntero = entrada.nextInt();
        //potencia(numeroReal, numeroEntero);
    }
    /*
    private static double potencia(double x, int n){
        if(n < 0) {
            if(n < -1){

            }
        } else if (n > 0) {
            if (n <= 1) {
                return 1;
            } else {
                return x * potencia(x, n - 1);
            }
        } else {
            return 1;
        }
    }*/
}

