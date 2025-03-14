package src.ud2;

import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Introduce nombre y apellido: ");
        String nombre = src.next();
        String apellido1 = src.next();
        String apellido2 = src.next();
        int edad = src.nextInt();

        System.out.println("Nombre : " + nombre + " - " + "Apellidos : " + apellido1 +" "+ apellido2+" - "+" Edad : "+edad);
        src.close(); // cierra el Scanner
    }
}
