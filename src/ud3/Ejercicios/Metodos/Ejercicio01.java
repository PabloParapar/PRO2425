package src.ud3.Ejercicios.Metodos;

import java.util.Scanner;

public class Ejercicio01{

    public static void resolverEjercicio(Scanner intro) {
        System.out.println("\n\tBoletin 3 | Ejercicio 1\n" + "Ingresa un mes y un año para mostrar en pantalla cuántos días tiene ese mes:");

        System.out.println("Ingresa un mes [1-12]:");
        int mes = intro.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Mes no válido, vuelve a intentarlo:");
        }
        System.out.println("Ingresa un año:");
        int anho = intro.nextInt();
        System.out.println("\nIngresa el año:");
        System.out.println("Tiene " + calcularDiasDelMes(mes, anho) + " días");
    }

    public static boolean calcularBisiesto(int anho) {
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

    public static int calcularDiasDelMes(int mes, int anho) {
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
                if (calcularBisiesto(anho)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        }
        return dias;
    }
}