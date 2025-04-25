package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.LinkedList;
import java.util.Random;

public class Ejercicio54 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();
        int medio = 20;
        lista.add(medio);
        for (int i = 0; i < medio*3; i++) {
            lista.add(random.nextInt(medio*2));
        }
        System.out.println("Lista original");
        for (Integer integer : lista){
            System.out.printf("%02d ", integer);
        }
        LinkedList<Integer> lista2 = new LinkedList<>();

        for (Integer integer: lista){
            if (integer < medio){
                lista2.add(lista2.indexOf(medio), integer);
            } else {
                lista2.add(lista2.size(), integer);
            }
        }
        System.out.println("\nLista ordenada");
        for (Integer integer: lista2){
            System.out.printf("%02d ", integer);
        }
    }
}
