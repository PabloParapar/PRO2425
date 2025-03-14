package src.ud3.Ejercicios.ManejoDeFechas;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio49 {
    public static void ejercicio49(Scanner entrada) {

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
}