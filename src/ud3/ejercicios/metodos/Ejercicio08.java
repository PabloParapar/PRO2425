package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio08 extends Ejercicio {
    private Ejercicio08() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
                    Boletin 3 | Ejercicio 8
                Escribir una aplicación que localice los primeros n números que sean reversibles. El valor de n lo puede establecer el alumno con el valor que desee:""");

        int casos = ingresarEntero(entrada);
        int cantidadReversibles = 0;
        for (int i = 10; cantidadReversibles < casos; i++) {
        int numeroTemporal = i;
        int numeroEspejo = 0;
            while (numeroTemporal != 0) {
                numeroEspejo = numeroEspejo * 10 + numeroTemporal % 10;
                numeroTemporal /= 10;
            }
            if (validarReversible(i,numeroEspejo)){
                System.out.println(i+" + "+numeroEspejo+" = "+(i+numeroEspejo));
                cantidadReversibles++;
            }
        //System.out.println(i+"\t"+numeroEspejo+"\t"+i+numeroEspejo);
        }

    }
    public static boolean validarReversible(int numeroOriginal,int espejo){
        boolean longitud = Integer.toString(numeroOriginal).length() == Integer.toString(espejo).length();
        int numeroTemporal = numeroOriginal + espejo;
        boolean impares = true;
        //boolean orden = numeroOriginal > espejo;
        while(numeroTemporal != 0) {
            impares &= (numeroTemporal % 10) % 2 != 0;
            numeroTemporal /= 10;
        }
        return longitud && impares;
    }


}