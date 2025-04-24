package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.LinkedList;

public class Ejercicio44 {
    public static void main(String[] args) {
        LinkedList<String> listaCadenas = new LinkedList<>();
        System.out.println("\nLista de String Creada\n");
        estaVacia(listaCadenas);
        System.out.println("\nAñadimos Strings\n");
        listaCadenas.add("texto1");
        listaCadenas.add("texto2");
        listaCadenas.add("texto3");
        listaCadenas.add("texto4");
        estaVacia(listaCadenas);
        System.out.println("\nProbamos peek()\n");
        for (int i = 0; i < 5; i++) {

            System.out.printf("%s ",listaCadenas.peek());
        }
        System.out.println();
        System.out.println("\nTamaño de la Lista");
        System.out.println(listaCadenas.size());
        System.out.println("\nProbamos poll\n");
        while (!listaCadenas.isEmpty()){
            System.out.println(listaCadenas.poll());
        }
        System.out.println("\nTamaño de la Lista");
        System.out.println(listaCadenas.size());

        imprimirLista(listaCadenas);

    }
    public static void estaVacia(LinkedList<String> lista){
        if(lista.isEmpty()){
            System.out.println("La lista está Vacía");
        } else {
            System.out.println("La lista no está Vacía");
            imprimirLista(lista);
        }
    }

    public static void imprimirLista(LinkedList<String> lista) {
        if (!lista.isEmpty()) {
            System.out.println("---------------");
            for (String texto : lista) {
                System.out.println(texto);
            }
            System.out.println("-----------------");
        } else {
            System.out.println("La lista está Vacía");
        }
    }
}
