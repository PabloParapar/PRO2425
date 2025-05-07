package Ejercicio1;

public class Pila {
    Libro [] lista;

    public Pila() {
        this.lista = new Libro[0];
    }

    public Boolean empty(){
        if (size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public void push(Libro libro){
        Libro [] listaNueva = new Libro[lista.length+1];
        listaNueva[0] = libro;
        for (int i = 0; i < lista.length; i++) {
            listaNueva[i+1] = lista[i];
        }
        this.lista = listaNueva;
    }

    public Libro peek(){
        return lista[0];
    }

    public Libro pop(){
        Libro libro = peek();
        Libro [] listaNueva = new Libro[lista.length-1];
        for (int i = 0; i < lista.length-1; i++) {
            listaNueva[i] = lista[i+1];
        }
        lista = listaNueva;
        return libro;
    }

    public Integer size(){
        return lista.length;
    }

    public void mostrarContenido(){
        if (!this.empty()) {
            for (Libro libro : lista) {
                System.out.println(libro);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
}


