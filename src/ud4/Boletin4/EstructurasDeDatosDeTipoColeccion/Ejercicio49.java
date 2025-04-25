package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion;

import java.util.LinkedList;

public class Ejercicio49 {
    public static void main(String[] args) {
        String cadena1 = "(x + y * (m / (m - p))) + (x / y)";
        String cadena2 = "(x * (y/2)";
        comprobarParentesis(cadena1);
        comprobarParentesis(cadena2);
        comprobarParentesis("((((()))))()()(())");
    }
    public static void comprobarParentesis(String cadenaOrigen){
        String cadena = cadenaOrigen;
        LinkedList<String> lista= new LinkedList<>();
        for (int i = 0; i < cadena.length(); i++) {
            String signo = cadena.substring(i,i+1);
            lista.add(signo);
        }
        int contador = 0;
        for (String letra : lista){
            if (letra.equals("(")){
                contador++;
            } else if (letra.equals(")")){
                contador--;
            }
        }
        System.out.print("La expresión con paréntesis "+cadenaOrigen);
        if (contador == 0){
            System.out.print(" está compensada\n");
        } else{
            System.out.print(" no está compensada\n");
        }
    }
}
