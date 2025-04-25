package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.LinkedList;

public class Ejercicio45Generico<T> {
    private T objeto;
    private LinkedList<T> lista;

    Ejercicio45Generico(T o){
        objeto = o;
        lista = new LinkedList<>();
    }

    public void agregar(T elemento){
        lista.add(elemento);
    }

    public LinkedList<T> getLista(){
        return lista;
    }

    public T peekLista(){
        return lista.peek();
    }

    public T pollLista(){
        return lista.poll();
    }

    public T getObjeto(){
        return objeto;
    }

    public void mostrarTipo(){
        System.out.print("El tipo de T es: "+ objeto.getClass().getName());
    }

    public boolean estaVacia(){
        return lista.isEmpty();
    }

    public void imprimirTodo(){

        System.out.print("La lista de "+ objeto.getClass().getName());
        if (!estaVacia()){
            System.out.print(" tiene contenido:\n");
            for (T elemento : lista){
                System.out.println(elemento);
            }
        } else {
            System.out.print(" está vacía\n");
        }
    }

    public int tamanno(){
        return lista.size();
    }
}

