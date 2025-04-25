package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.*;

public class Ejercicio56 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {1};
        System.out.println(elementosMasFrecuentes(nums1, 2));
        System.out.println(elementosMasFrecuentes(nums2, 1));
    }
    public static List<Integer> elementosMasFrecuentes(int[] nums, int k){
        HashMap<Integer, Integer> listaRepetidos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numero = nums[i];
            listaRepetidos.put(numero, listaRepetidos.getOrDefault(numero, 1) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : listaRepetidos.entrySet()){
            heap.offer(entry);
            if (heap.size() > k){
                heap.poll();
            }
        }

        ArrayList<Integer> resultado = new ArrayList<>();
        while(!heap.isEmpty()){
            resultado.add(heap.poll().getKey());
        }

        Collections.reverse(resultado);

        return resultado;
    }
}
