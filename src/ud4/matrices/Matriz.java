package src.ud4.matrices;

import java.util.Vector;

public class Matriz {
    public static void main(String[] args) {

    int [] [] enteros = new int [4][4];

    enteros[0] = new int[2];
    enteros[1] = new int[3];
    enteros[2] = new int[4];
    enteros[3] = new int[5];
    /*
    enteros[0][0] = 1;
    enteros[0][1] = 1;
    enteros[0][2] = 1;
    enteros[0][3] = 1;*/



        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                System.out.print(enteros[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int [] enterosos : enteros){
            for (int entero : enterosos){
                System.out.print(entero+" ");
            }
            System.out.println();
        }

        double [][] cuadrados = new double[8][8];

        for(int i = 0; i < cuadrados.length; i++){
            for (int j = 0; j < cuadrados[i].length; j++){
                cuadrados[i][j] = Math.round(Math.sqrt(i*i+j*j));
                System.out.print(cuadrados[i][j] +" ");
            }
            System.out.println();
        }

        //System.out.println(Arrays.toString(enteros));
    }
}
