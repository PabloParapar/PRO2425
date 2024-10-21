package src.UD2.EXPLogicas;

import java.math.*;
import java.util.Scanner;

public class Boletin22 {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("\n\tBoletin 2 2 | Ejercicio 1\n");
        System.out.println("Introduzca la nota del alumno: ");
        Scanner ejercicio1 = new Scanner(System.in);
        int nota = ejercicio1.nextInt();

        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }
        ejercicio1.close();

        //EJERCICIO 2
        System.out.println("\n\tBoletin 2 2 | Ejercicio 2\n");
        System.out.println("Introduzca la nota del alumno: ");
        Scanner ejercicio2 = new Scanner(System.in);
        int nota2 = ejercicio2.nextInt();

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
        ejercicio2.close();

        //EJERCICIO 3
        System.out.println("\n\tBoletin 2 2 | Ejercicio 3\n");
        System.out.println("Introduzca un número entero: ");
        Scanner ejercicio3 = new Scanner(System.in);
        int numeroEntero = ejercicio3.nextInt();

        if (numeroEntero != 0) {
            if (numeroEntero % 2 == 0) {
                System.out.println("El número " + numeroEntero + " es par");
            } else {
                System.out.println("El número " + numeroEntero + " es impar");
            }
        } else {
            System.out.println("Su número es cero");
        } ejercicio3.close();

        //EJERCICIO 4
        System.out.println("\n\tBoletin 2 2 | Ejercicio 4\n");

        double precioUnidad = 100;
        int cantidadCompra = 102;
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

        //EJERCICIO 5
        System.out.println("\n\tBoletin 2 2 | Ejercicio 5\n");

        int numeroHijos = 5;
        double salarioBruto = 1800, salarioNeto;

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

        //EJERCICIO 6
        System.out.println("\n\tBoletin 2 2 | Ejercicio 6\n");

        int insertarHora, insertarMinuto;
        insertarHora = 15;
        insertarMinuto = 20;
        if (insertarHora > 12) {
            System.out.println((insertarHora - 12) + ":" + insertarMinuto + " PM");
        } else {
            System.out.println(insertarHora + ":" + insertarMinuto + " AM");
        }
        insertarHora = 5;
        if (insertarHora > 12) {
            System.out.println((insertarHora - 12) + ":" + insertarMinuto + " PM");
        } else {
            System.out.println(insertarHora + ":" + insertarMinuto + " AM");
        }

        //EJERCICIO 7
        System.out.println("\n\tBoletin 2 2 | Ejercicio 7\n");

        int a, b, c, d;
        a = 1;
        b = 2;
        c = 6;
        d = 4;
        int enteroN = a * 1000 + b * 100 + c * 10 + d;
        int redondeoN;
        if (c >= 5) {
            redondeoN = a * 1000 + ++b * 100;
        } else {
            redondeoN = a * 1000 + b * 100;
        }

        System.out.println(enteroN + " se redondea a " + redondeoN);

        //EJERCICIO 8
        System.out.println("\n\tBoletin 2 2 | Ejercicio 8\n");

        int mes = 3;
        switch (mes) {
            case 2: //Febrero
                System.out.println("28 días");
                break;
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: //Octubre
            case 12: //Diciembre
                System.out.println("31 días");
                break;
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                System.out.println("30 días");
                break;
        }

        //EJERCICIO 9
        System.out.println("\n\tBoletin 2 2 | Ejercicio 9\n");

        int anho = 1929;
        int a9 = anho % 19;
        int b9 = anho % 4;
        int c9 = anho % 7;
        int d9 = (19 * a9 + 24) % 30;
        int e9 = (2 * b9 + 4 * c9 + 6 * d9 + 5) % 7;
        int f9 = 22 + d9 + e9;

        if (f9 <= 31) {
            System.out.println(f9 + " de Marzo");
        } else {
            System.out.println(f9 - 31 + " de Abril");
        }

        //EJERCICIO 10
        System.out.println("\n\tBoletin 2 2 | Ejercicio 10\n");

        int numeroBisiesto = 1800;
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


        //EJERCICIO 11
        System.out.println("\n\tBoletin 2 2 | Ejercicio 11\n");

        int a11, b11, c11;
        a11 = 5;
        b11 = 4;
        c11 = 3;

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

        //EJERCICIO 12
        System.out.println("\n\tBoletin 2 2 | Ejercicio 12\n");

        double factura, kilometraje;
        kilometraje = 2000;
        if (kilometraje >= 300) {
            if (kilometraje <= 1000) {
                factura = 30 + (kilometraje - 300) * 0.2;
            } else {
                factura = 30 + 700 * 0.2 + (kilometraje - 1000) * 0.15;
            }
        } else {
            factura = 30;
        }

        System.out.println("Kilometraje =\t" + kilometraje + " km\nfactura =\t\t" + factura + " €");

        //EJERCICIO 13
        System.out.println("\n\tBoletin 2 2 | Ejercicio 13\n");

        //Con error [14681,15681] + [70001,79999] + [88888,111111]
        int numeroSerie = 2000;
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

        //EJERCICIO 14
        System.out.println("\n\tBoletin 2 2 | Ejercicio 14\n");

        int a14 = 100, b14 = 10, c14 = 60, d14 = 80;
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

        //EJERCICIO 15
        System.out.println("\n\tBoletin 2 2 | Ejercicio 15\n");

        double a15, b15, c15, discriminante, parteReal, parteImaginaria;
        a15 = 4;
        b15 = 40;
        c15 = 7;
        discriminante = b15 * b15 - 4 * a15 * c15;
        parteReal = -1 * b15 / (2 * a15);
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

        //EJERCICIO 16
        System.out.println("\n\tBoletin 2 2 | Ejercicio 16\n");

        int a16, b16, c16, d16, e16, f16, g16, h16, i16, diaSemana;
        int dia = 20;
        mes = 10;
        anho = 2024;

        a16 = (12 - mes) / 10;
        b16 = anho - a16;
        c16 = mes + (12 * a16);
        d16 = b16 / 100;
        e16 = d16 / 4;
        f16 = 2 - d16 + e16;
        g16 = (int) Math.floor(365.25 * b16);
        h16 = (int) Math.floor(30.6001 * (c16 + 1));
        i16 = f16 + g16 + h16 + dia + 5;
        diaSemana = i16 % 7;

        //System.out.println("."+a16+", "+b16+", "+c16+", "+d16+", "+e16+", "+f16+", "+g16+", "+h16+", "+i16+", "+diaSemana);
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
            case 6:
                System.out.println("El " + dia + "/" + mes + "/" + anho + " es Viernes");
                break;
        }

        //EJERCICIO 17
        System.out.println("\n\tBoletin 2 2 | Ejercicio 17\n");

        int x = -1, n = 2;
        double calculo;
        if (x >= 0) {
            if (n <= 0) {
                System.out.println("ERROR | División entre 0");
            } else {
                calculo = x + Math.pow(x, n) / n - Math.pow(x, n + 2) / (n + 2);
                System.out.println(calculo);
            }
        } else if (n <= 1) {
            System.out.println("ERROR | División entre 0");
        } else {
            calculo = Math.pow(x, n + 1) / (n + 1) - Math.pow(x, n - 1) / (n - 1);
            System.out.println(calculo);
        }

        //EJERCICIO 18
        System.out.println("\n\tBoletin 2 2 | Ejercicio 18\n");

        final double PI = 3.1416;
        final double EULER = 2.7183;
        double calculoStirling;
        n = 9;

        if (n >= 1) {
            if (n == 1) {
                System.out.println("El resultado es 1");
            } else {
                calculoStirling = Math.sqrt(2 * PI * n) * Math.pow((n / EULER), n);
                System.out.println(calculoStirling);
            }
        }

        //EJERCICIO 19
        System.out.println("\n\tBoletin 2 2 | Ejercicio 19\n");

        double tiempoTierra, tiempoMarte, longitudPendulo, aceleracionGravedadTierra, aceleracionGravedadMarte;
        final double GRAVEDAD = 6.673e-8; //centímetros^3/(gramos / segundo^2)
        double masaTierra = 5.98e27; //gramos
        double masaMarte = masaTierra * 0.11; //gramos
        double radioTierra = 637800000; //centímetros
        double radioMarte = 339400000; //centímetros

        longitudPendulo = 100; //centímetros

        aceleracionGravedadTierra = GRAVEDAD * masaTierra / (radioTierra * radioTierra); // centímetros/(segundos)^2
        tiempoTierra = PI * Math.sqrt(longitudPendulo / aceleracionGravedadTierra); //segundos

        aceleracionGravedadMarte = GRAVEDAD * masaMarte / (radioMarte * radioMarte); // centímetros/(segundos)^2
        tiempoMarte = PI * Math.sqrt(longitudPendulo / aceleracionGravedadMarte); //segundos

        System.out.println(tiempoTierra + ", " + tiempoMarte);
        if (tiempoTierra > tiempoMarte) {
            System.out.println("El péndulo se detendrá antes en Marte");
        } else {
            System.out.println("El péndulo se detendrá antes en La Tierra");
        }
    }
}
