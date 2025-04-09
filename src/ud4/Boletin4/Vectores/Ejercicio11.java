package src.ud4.Boletin4.Vectores;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {
        int [] enterosTest = new int[9];
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            enterosTest[random.nextInt(1,10)-1] += 1;
        }
        for (int i = 0; i < enterosTest.length; i++) {
            System.out.println("Apariciones de "+(i+1)+" = "+enterosTest[i]+"\t"+"Porcentaje de Aparición = "+(((double) enterosTest[i]/100000))+" %");
        }

    }
}
