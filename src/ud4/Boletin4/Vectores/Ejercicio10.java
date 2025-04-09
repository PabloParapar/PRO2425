package src.ud4.Boletin4.Vectores;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("""
                Ejercicio 10
                
                Simular el lanzamiento de un dado 1000000 de veces e indicar
                el porcentaje de aparición de cada número
                """);
        Random random = new Random();
        int [] lanzamientos = new int[6];
        for (int i = 0; i < 1000000; i++) {
            lanzamientos[random.nextInt(0,6)] += 1;
        }
        for (int i = 0; i < lanzamientos.length; i++) {
            System.out.println("Tiradas en "+(i+1)+" = "+lanzamientos[i]+"\t"+"Porcentaje de Aparición = "+(((double) lanzamientos[i]/10000))+" %");
        }
    }
}
