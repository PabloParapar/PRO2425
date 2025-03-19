package src.ud2.explogicas;

import java.util.Scanner;

public class Boletin22 {
    public static void main(String[] args) {

        //MENÚ EJERCICIOS
        menuEjercicios();
        Scanner boletin22 = new Scanner(System.in);
        int numeroEjercicio = boletin22.nextInt();
        while (numeroEjercicio != 0) {
            switch (numeroEjercicio) {

                //EJERCICIO 1
                case 1:
                    ejercicio1(boletin22);
                    break;

                //EJERCICIO 2
                case 2:
                    ejercicio2(boletin22);
                    break;

                //EJERCICIO 3
                case 3:
                    ejercicio3(boletin22);
                    break;

                //EJERCICIO 4
                case 4:
                    ejercicio4(boletin22);
                    break;

                //EJERCICIO 5
                case 5:
                    ejercicio5(boletin22);
                    break;

                //EJERCICIO 6
                case 6:
                    ejercicio6(boletin22);
                    break;

                //EJERCICIO 7
                case 7:
                    ejercicio7(boletin22);
                    break;

                //EJERCICIO 8
                case 8:
                    ejercicio8(boletin22);
                    break;

                //EJERCICIO 9
                case 9:
                    ejercicio9(boletin22);
                    break;

                //EJERCICIO 10
                case 10:
                    ejercicio10(boletin22);
                    break;

                //EJERCICIO 11
                case 11:
                    ejercicio11(boletin22);
                    break;

                //EJERCICIO 12
                case 12:
                    ejercicio12(boletin22);
                    break;

                //EJERCICIO 13
                case 13:
                    ejercicio13(boletin22);
                    break;

                //EJERCICIO 14
                case 14:
                    ejercicio14(boletin22);
                    break;

                //EJERCICIO 15
                case 15:
                    ejercicio15(boletin22);
                    break;

                //EJERCICIO 16
                case 16:
                    ejercicio16(boletin22);
                    break;

                //EJERCICIO 17
                case 17:
                    ejercicio17(boletin22);
                    break;

                //EJERCICIO 18
                case 18:
                    ejercicio18(boletin22);
                    break;

                //EJERCICIO 19
                case 19:
                    ejercicio19(boletin22);
                    break;
                default:
                    System.out.println("""
                            \033[31m
                            Eso no es un ejercicio
                            \u001b[0m""");
            }
            menuEjercicios();
            numeroEjercicio = boletin22.nextInt();
        }
    }
    private static void menuEjercicios(){
        String reset = "\u001b[0m";         //Reset
        String snooze = "\033[30m";         //Black
        String saltado = "\033[31m";        //Red
        String terminado = "\033[32m";      //Green
        String incubadora = "\033[35m";     //Magenta
        String enProceso = "\33[33m";       //Yellow
        String destacado = "\033[36m";      //Cyan

        System.out.println("\n                   Unidad Didáctica 2 | Boletín 2 2\n\n" +
                "        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                "        ┃               Estructuras Condicionales               ┃\n" +
                "        ┠───────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                "        ┃      " + terminado + "1" + reset + "    │     " + terminado + "2" + reset + "    │     " + terminado + "3" + reset + "    │     " + terminado + "4" + reset + "    │     " + terminado + "5" + reset + "    ┃\n" +
                "        ┠───────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                "        ┃      " + terminado + "6" + reset + "    │     " + terminado + "7" + reset + "    │     " + terminado + "8" + reset + "    │     " + terminado + "9" + reset + "    │    " + terminado + "10" + reset + "    ┃\n" +
                "        ┠───────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                "        ┃     " + terminado + "11" + reset + "    │    " + terminado + "12" + reset + "    │    " + terminado + "13" + reset + "    │    " + terminado + "14" + reset + "    │    " + terminado + "15" + reset + "    ┃\n" +
                "        ┠───────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                "        ┃     " + terminado + "16" + reset + "    │    " + terminado + "17" + reset + "    │    " + terminado + "18" + reset + "    │    " + terminado + "19" + reset + "    │  0 EXIT  ┃\n" +
                "        ┗━━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┛\n\n" +
                "         Ingresa el número del ejercicio que desea ejecutar: ");
    }

    private static void ejercicio1(Scanner boletin22) {
        System.out.println("""
                    Boletin 2 2 | Ejercicio 1
                Ingresa una nota entre [0-10]
                """);
        System.out.println("Introduzca la nota del alumno: ");
        int nota = boletin22.nextInt();

        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }
    }

    private static void ejercicio2(Scanner boletin22) {
        System.out.println("""
                    Boletin 2 2 | Ejercicio 2
                Ingresa una nota para comprobar si es correcta, en ese caso mostrar si el alumno ha aprobado o no
                """);
        System.out.println("Introduzca la nota del alumno: ");
        int nota2 = boletin22.nextInt();

        if (nota2 <= 10 && nota2 >= 0) {
            System.out.println("La nota " + nota2 + " es correcta");
            if (nota2 >= 5) {
                System.out.println("Usted está aprobado");
            } else {
                System.out.println("Usted está suspenso");
            }
        } else {
            System.out.println("La nota " + nota2 + " es incorrecta");
        }
    }

    private static void ejercicio3(Scanner boletin22) {
        System.out.println("""
                    Boletin 2 2 | Ejercicio 3
                Ingresa un número entero para comprobar si no es 0, si no lo es comprobar si es par o impar
                """);
        System.out.println("Introduzca un número entero: ");
        int numeroEntero = boletin22.nextInt();

        if (numeroEntero != 0) {
            if (numeroEntero % 2 == 0) {
                System.out.println("El número " + numeroEntero + " es par");
            } else {
                System.out.println("El número " + numeroEntero + " es impar");
            }
        } else {
            System.out.println("Su número es cero");
        }
    }

    private static void ejercicio4(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 4
        Determinar el precio final de la compra en función a la cantidad y el precio por unidad, y aplicando los descuentos
        """);
        System.out.println("¿Cuántos productos va a comprar?: ");
        int cantidadCompra = boletin22.nextInt();
        System.out.println("¿Cuánto vale el producto?: ");
        double precioUnidad = boletin22.nextDouble();
        double precioFinal = precioUnidad * cantidadCompra;
        System.out.println("Precio real: " + precioFinal + "€");
        if (cantidadCompra <= 24) {
            if (cantidadCompra < 10) {
                // < 10 | sin descuento
                System.out.println("Sin Descuento");
                precioFinal *= 1;
            } else {
                //[10,24] | descuento del 10%
                System.out.println("Descuento del 10%");
                precioFinal *= 0.9;
            }
        } else {
            if (cantidadCompra <= 100) {
                //[25,100] | descuento del 20%
                System.out.println("Descuento del 20%");
                precioFinal *= 0.8;
            } else {
                // >100 | descuento del 40%
                System.out.println("Descuento del 40%");
                precioFinal *= 0.6;
            }
        }
        System.out.println("Precio con descuento: " + precioFinal + "€");
    }

    private static void ejercicio5(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 5
        Determina el salario neto de un trabajador en función a los hijos que tiene
        """);

        System.out.println("¿Cuánto cobra el trabajador?");
        double salarioBruto = boletin22.nextDouble();
        double salarioNeto;
        System.out.println("¿Cuántos hijos tiene?: ");
        int numeroHijos = boletin22.nextInt();

        if (numeroHijos <= 7) {
            if (numeroHijos <= 2) {
                //20%
                salarioNeto = salarioBruto * 0.8;
            } else if (numeroHijos <= 5) {
                //15%
                salarioNeto = salarioBruto * 0.85;
            } else {
                //10%
                salarioNeto = salarioBruto * 0.9;
            }
        } else if (numeroHijos < 10) {
            //5%
            salarioNeto = salarioBruto * 0.95;
        } else {
            //0%
            salarioNeto = salarioBruto;
        }
        System.out.println("Con " + numeroHijos + " hijos mi salario de " + salarioBruto + "€ pasa a ser " + salarioNeto + "€");
    }

    private static void ejercicio6(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 6
        Ingresa la hora y el minuto para mostrarlo en formato AM/PM""");

        System.out.println("Inserta la hora y el minuto");
        int insertarHora = boletin22.nextInt();
        int insertarMinuto = boletin22.nextInt();
        String minuto;
        if (insertarMinuto < 10) {
            minuto = "0" + insertarMinuto;
        } else {
            minuto = String.valueOf(insertarMinuto);
        }
        if (insertarHora > 12) {
            System.out.println((insertarHora - 12) + ":" + minuto + " PM");
        } else {
            System.out.println(insertarHora + ":" + minuto + " AM");
        }
    }

    private static void ejercicio7(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 7
        Dadas las 4 cifras de un número mostrar en pantalla el redondeo a la centena más próxima""");

        System.out.println("Ingresa los valores de 'a', 'b', 'c' y 'd': ");
        int a = boletin22.nextInt();
        int b = boletin22.nextInt();
        int c = boletin22.nextInt();
        int d = boletin22.nextInt();

        int enteroN = a * 1000 + b * 100 + c * 10 + d;
        int redondeoN;
        if (c >= 5) {
            redondeoN = a * 1000 + ++b * 100;
        } else {
            redondeoN = a * 1000 + b * 100;
        }

        System.out.println(enteroN + " se redondea a " + redondeoN);
    }

    private static void ejercicio8(Scanner boletin22) {
        System.out.println("""
                    Boletin 2 2 | Ejercicio 8
                Muestra cuántos días tiene un mes dado
                """);
        System.out.println("1\tEnero\n2\tFebrero\n3\tMarzo\n4\tAbril\n5\tMayo\n6\tJunio\n7\tJulio\n8\tAgosto\n9\tSeptiembre\n10\tOctubre\n11\tNoviembre\n12\tDiciembre\n\nIngresa el número del mes");
        int comprobarMes = boletin22.nextInt();
        switch (comprobarMes) {
            case 2: //Febrero
                System.out.println("28 días");
                break;
            case 1, 3, 5, 7, 8, 10, 12: //Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
                System.out.println("31 días");
                break;
            default:
                //case 4, 6, 9, 11: //Abril, Junio, Septiembre, Noviembre
                System.out.println("30 días");
                break;
        }
    }

    private static void ejercicio9(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 9
        Dado un año muestra la fecha de Pascua
        """);
        System.out.println("Indica el año que quieres comprobar: ");
        int anhoPascua = boletin22.nextInt();
        int a9 = anhoPascua % 19;
        int b9 = anhoPascua % 4;
        int c9 = anhoPascua % 7;
        int d9 = (19 * a9 + 24) % 30;
        int e9 = (2 * b9 + 4 * c9 + 6 * d9 + 5) % 7;
        int f9 = 22 + d9 + e9;

        if (f9 <= 31) {
            System.out.println("En " + anhoPascua + " Pascua es el " + f9 + " de Marzo");
        } else {
            System.out.println("En " + anhoPascua + " Pascua es el " + (f9 - 31) + " de Abril");
        }
    }

    private static void ejercicio10(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 10
        Determina si un año es bisiesto
        """);

        System.out.println("Ingresa el año que quieres comprobar si es bisiesto:");
        int numeroBisiesto = boletin22.nextInt();
        if (numeroBisiesto % 4 == 0) {
            if (numeroBisiesto % 100 == 0) {
                if (numeroBisiesto % 400 == 0) {
                    System.out.println(numeroBisiesto + " es bisiesto");
                } else {
                    System.out.println(numeroBisiesto + " no es bisiesto;");
                }
            } else {
                System.out.println(numeroBisiesto + " es bisiesto");
            }
        } else {
            System.out.println(numeroBisiesto + " no es bisiesto");
        }
    }

    private static void ejercicio11(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 11
        Dados 3 enteros distintos muestra cuál es el mayor""");
        System.out.println("Inserta los enteros 'a', 'b' y 'c': \n");
        int a11 = boletin22.nextInt();
        int b11 = boletin22.nextInt();
        int c11 = boletin22.nextInt();

        if (a11 > b11) {
            if (a11 > c11) {
                System.out.println(a11 + " es el mayor");
            } else {
                System.out.println(c11 + " es el mayor");
            }
        } else if (b11 > c11) {
            System.out.println(b11 + " es el mayor");
        } else {
            System.out.println(c11 + " es el mayor");
        }
    }

    private static void ejercicio12(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 12
        Muestra la factura de un cliente dado el kilometraje que ha recorrido en su coche alquilado""");
        System.out.println("¿Cuántos kilómetros ha recorrido?");
        double factura;
        double kilometraje = boletin22.nextInt();
        if (kilometraje >= 300) {
            if (kilometraje <= 1000) {
                factura = 30 + (kilometraje - 300) * 0.2;
            } else {
                factura = 30 + 700 * 0.2 + (kilometraje - 1000) * 0.15;
            }
        } else {
            factura = 30;
        }
        System.out.println("Kilometraje =\t" + kilometraje + " km\nFactura =\t\t" + factura + " €");
    }

    private static void ejercicio13(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 13
        Inserta un número de serie y determina si tiene error o no
        """);
        System.out.println("Ingresa el número de serie: ");
        //Con error [14681,15681] + [70001,79999] + [88888,111111]
        int numeroSerie = boletin22.nextInt();
        if (numeroSerie <= 111111) {
            if (numeroSerie >= 88888) {
                System.out.println(numeroSerie + " es defectuoso");
            } else if (numeroSerie > 79999) {
                System.out.println(numeroSerie + " no es defectuoso");
            } else if (numeroSerie > 70000) {
                System.out.println(numeroSerie + " es defectuoso");
            } else if (numeroSerie > 15681) {
                System.out.println(numeroSerie + " no es defectuoso");
            } else if (numeroSerie > 14680) {
                System.out.println(numeroSerie + " es defectuoso");
            } else {
                System.out.println(numeroSerie + " no es defectuoso");
            }
        } else {
            System.out.println(numeroSerie + " no es defectuoso");
        }
    }

    private static void ejercicio14(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 14
        Dadas 4 notas entre 0 y 100 muestra la media aritmética y mostrar su nota
        """);
        System.out.println("Ingresa las 4 notas ( __ __ __ __ ): ");
        int a14 = boletin22.nextInt();
        int b14 = boletin22.nextInt();
        int c14 = boletin22.nextInt();
        int d14 = boletin22.nextInt();
        double notaMedia = ((double) (a14 + b14 + c14 + d14)) / 4;
        if (notaMedia < 90) {
            if (notaMedia >= 70) {
                if (notaMedia >= 80) {
                    System.out.println(notaMedia + " es B");
                } else {
                    System.out.println(notaMedia + " es C");
                }
            } else if (notaMedia >= 60) {
                System.out.println(notaMedia + " es D");
            } else {
                System.out.println(notaMedia + " es E");
            }
        } else {
            System.out.println(notaMedia + " es A");
        }
    }

    private static void ejercicio15(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 15
        Resuelve la ecuación de segundo grado dados los términos independientes a, b y c
        """);

        System.out.println("Ingresa los valores de 'a', 'b' y 'c': ");
        double parteImaginaria;
        double a15 = boletin22.nextInt();
        double b15 = boletin22.nextInt();
        double c15 = boletin22.nextInt();
        double discriminante = b15 * b15 - 4 * a15 * c15;
        double parteReal = -1 * b15 / (2 * a15);
        //System.out.println(parteReal + ", "+discriminante+", "+parteImaginaria);

        if (a15 == 0) {
            System.out.println("Una Solución:\n\tx1 = " + (-1 * c15 / b15));
        } else if (discriminante > 0) {
            parteImaginaria = Math.sqrt(discriminante) / (2 * a15);
            System.out.println("Dos Soluciones reales:\n\tx1 = " + parteReal + " + " + parteImaginaria + " = " + (parteReal + parteImaginaria) + "\n\tx2 = " + parteReal + " - " + parteImaginaria + " = " + (parteReal - parteImaginaria));
        } else {
            parteImaginaria = Math.sqrt(discriminante * -1) / (2 * a15);
            System.out.println("Dos Soluciones con parte imaginaria:\n\tx1 = " + parteReal + " + " + parteImaginaria + "i\n\tx2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }

    private static void ejercicio16(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 16
        Dada una fecha en año, mes y día mostrar en qué día de la semana coincide
        """);

        System.out.println("Ingresa la fecha en formato de día / mes / año");

        int dia = boletin22.nextInt();
        int mes = boletin22.nextInt();
        int anho = boletin22.nextInt();

        int a16 = (12 - mes) / 10;
        int b16 = anho - a16;
        int c16 = mes + (12 * a16);
        int d16 = b16 / 100;
        int e16 = d16 / 4;
        int f16 = 2 - d16 + e16;
        int g16 = (int) Math.floor(365.25 * b16);
        int h16 = (int) Math.floor(30.6001 * (c16 + 1));
        int i16 = f16 + g16 + h16 + dia + 5;
        int diaSemana = i16 % 7;


        switch (diaSemana) {
            case 0:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Sábado");
                break;
            case 1:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Domingo");
                break;
            case 2:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Lunes");
                break;
            case 3:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Martes");
                break;
            case 4:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Miércoles");
                break;
            case 5:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Jueves");
                break;
            default:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Viernes");
                break;
        }
    }

    private static void ejercicio17(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 17
        Dados 'x' y 'n' resuelve el siguiente cálculo
        """);

        System.out.println("Ingresa los valores de 'x' y 'n': ");

        int x = boletin22.nextInt();
        int n17 = boletin22.nextInt();
        double calculo;
        if (x >= 0) {
            if (n17 <= 0) {
                System.out.println("ERROR | División entre 0");
            } else {
                calculo = x + Math.pow(x, n17) / n17 - Math.pow(x, n17 + 2.0) / (n17 + 2);
                System.out.println(calculo);
            }
        } else if (n17 <= 1) {
            System.out.println("ERROR | División entre 0");
        } else {
            calculo = Math.pow(x, n17 + 1.0) / (n17 + 1) - Math.pow(x, n17 - 1.0) / (n17 - 1);
            System.out.println(calculo);
        }
    }

    private static void ejercicio18(Scanner boletin22) {
        System.out.println("""
            Boletin 2 2 | Ejercicio 18
        Ingresa 'n' para calcular su factorial con la fórmula de Stirling:
        """);
        final double PI = 3.1416;
        final double EULER = 2.7183;
        double calculoStirling;
        int n18 = boletin22.nextInt();

        if (n18 >= 1) {
            if (n18 == 1) {
                System.out.println("El resultado es 1");
            } else {
                calculoStirling = Math.sqrt(2 * PI * n18) * Math.pow((n18 / EULER), n18);
                System.out.println("Factorial con la fórmula de Stirling = " + calculoStirling);
            }
        }
        // Comparativa
        long factorialReal = 1;
        for (int i = 1; i <= n18; i++) {
            factorialReal *= i;
        }
        System.out.println("Factorial Real = " + factorialReal);
    }

    private static void ejercicio19(Scanner boletin22) {
        System.out.println("""
                        Boletin 2 2 | Ejercicio 19
                    Calcula si un péndulo se detendrá antes en la Tierra que en Marte""");

        System.out.println("Ingresa la Longitud del péndulo (L): ");

        final double PI = 3.1416;
        final double GRAVEDAD = 6.673e-8; //centímetros^3/(gramos / segundo^2)
        double masaTierra = 5.98e27; //gramos
        double masaMarte = masaTierra * 0.11; //gramos
        double radioTierra = 637800000; //centímetros
        double radioMarte = 339400000; //centímetros

        double longitudPendulo = boletin22.nextInt(); //centímetros

        double aceleracionGravedadTierra = GRAVEDAD * masaTierra / (radioTierra * radioTierra); // centímetros/(segundos)^2
        double tiempoTierra = PI * Math.sqrt(longitudPendulo / aceleracionGravedadTierra); //segundos

        double aceleracionGravedadMarte = GRAVEDAD * masaMarte / (radioMarte * radioMarte); // centímetros/(segundos)^2
        double tiempoMarte = PI * Math.sqrt(longitudPendulo / aceleracionGravedadMarte); //segundos

        System.out.println(tiempoTierra + ", " + tiempoMarte);
        if (tiempoTierra > tiempoMarte) {
            System.out.println("El péndulo se detendrá antes en Marte");
        } else {
            System.out.println("El péndulo se detendrá antes en La Tierra");
        }
    }
}
