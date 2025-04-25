package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.LinkedList;

public class Ejercicio45 {
    public static void main(String[] args) {
        Ejercicio45Generico<String> genericoString = new Ejercicio45Generico<>("");
        Ejercicio45Generico<Integer> genericoInteger = new Ejercicio45Generico<>(0);
        System.out.println("\nListas de String e Integer Creadas\n");
        genericoString.imprimirTodo();
        genericoInteger.imprimirTodo();
        System.out.println("\nAñadimos Strings\n");
        genericoString.agregar("texto1");
        genericoString.agregar("texto2");
        genericoString.agregar("texto3");
        genericoString.agregar("texto4");
        genericoString.imprimirTodo();
        System.out.println("\nAñadimos Integers\n");
        genericoInteger.agregar(0);
        genericoInteger.agregar(1);
        genericoInteger.agregar(2);
        genericoInteger.agregar(3);
        genericoInteger.imprimirTodo();
        System.out.println("\nProbamos peek()\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s ",genericoString.peekLista());
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ",genericoInteger.peekLista());
        }
        System.out.println();

        System.out.println("\nTamaño de la Lista");
        System.out.println("\nLa lista de Strings mide "+genericoString.tamanno());
        System.out.println("\nLa lista de Integers mide "+genericoInteger.tamanno());
        System.out.println("\nProbamos poll()\n");
        System.out.println("poll() en String");
        while (!genericoString.estaVacia()){
            genericoString.pollLista();
        }
        while (!genericoInteger.estaVacia()){
            genericoInteger.pollLista();
        }
        System.out.println("\nTamaño de la Lista");
        System.out.println("\nLa lista de Strings mide "+genericoString.tamanno());
        System.out.println("\nLa lista de Integers mide "+genericoInteger.tamanno());

        genericoString.imprimirTodo();
        genericoInteger.imprimirTodo();
    }


}