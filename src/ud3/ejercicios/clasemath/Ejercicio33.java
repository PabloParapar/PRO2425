package src.ud3.ejercicios.clasemath;

import src.ud3.ejercicios.Ejercicio;

public class Ejercicio33 extends Ejercicio {
    public static void resolverEjercicio() {

        System.out.println("\n\tBoletin 3 | Ejercicio 33\n" + "Escribe una aplicación que simule una partida de cara o cruz con precio por cada tirada y premio cada ronda que el número de caras supere al de cruces:");
        jugarCaraOCruz();
    }

    public static void jugarCaraOCruz() {
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

    public static boolean lanzarCaraOCruz() {
        if (Math.round(Math.random()) == 1) {
            return true;
        } else {
            return false;
        }
    }
}