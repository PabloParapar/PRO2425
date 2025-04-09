package src.ud4.Boletin4.Vectores;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("""
                Ayudar a un jugador de dados a decidir cuál de los dos hechos siguientes es más probable:
                
                a)  Lanzar cinco veces seguidas un dado y que salgan los 5 números iguales.
                b)  Lanzar dos dados simultáneamente y que salgan dos cuatros.
                """);
        Random random = new Random();
        calcularTiradasSeguidas(random);
        calcularParDeTiradasIguales(random);
    }
    public static void calcularTiradasSeguidas(Random random){
        int [] testTiradas = new int[5];
        int cincoSeguidos = 0;
        for (int i = 0; i < 10000000; i++){
            testTiradas[i%5] = random.nextInt(1, 6);
            for (int j = 0; j < testTiradas.length; j++) {
                if (testTiradas[0] == testTiradas[1] &&
                    testTiradas[1] == testTiradas[2] &&
                    testTiradas[2] == testTiradas[3] &&
                    testTiradas[3] == testTiradas[4]){
                    cincoSeguidos++;
                }
            }
        }
        System.out.println("Porcentaje de 5 tiradas seguidas iguales = "+((double) cincoSeguidos / 100000) + " %");
    }

    public static void calcularParDeTiradasIguales(Random random){
        int [] tiradas = new int[2];
        int parCuatros = 0;
        for (int i = 0; i < 10000000; i++) {
            tiradas[0] = random.nextInt(1,6);
            tiradas[1] = random.nextInt(1,6);
            if (tiradas[0]==tiradas[1]&&tiradas[0] == 4){
                parCuatros++;
            }
        }
        System.out.println("Porcentaje de 2 tiradas simultáneas iguales a 4 = "+((double) parCuatros / 100000) + " %");
    }
}
