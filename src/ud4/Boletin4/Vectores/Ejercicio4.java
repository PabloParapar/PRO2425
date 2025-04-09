package src.ud4.Boletin4.Vectores;

import src.ud4.Boletin4.Persona;

import java.util.Scanner;

/**
 * @author lopparpab
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("""
                    Ejercicio 4
                
                Codificar una aplicación que cree un vector con espacio suficiente
                para almacenar 100 instancias de la clase Persona
                """);
        Scanner entrada = new Scanner(System.in);
        Persona[] vectorPersona = new Persona[100];
        Persona prueba = new Persona("Señor", "De Prueba", "12345678C");
        System.out.println("""
                a)  Cada persona tendrá los atributos nombre, apellidos y dni con
                    sus métodos get y set mas una sobrecarga del método toString()
                """);
        System.out.println(prueba + "\n");
        System.out.println("""
                b)  Pedir datos de un número indeterminado de personas y almacenarlas
                    en el vector. Finalizar la entrada cuando se cumpla una condición
                    que determine el alumno. Al acabar la entrada de datos, mostrar
                    los datos de todas las personas registradas en el vector.
                """);
        for (int i = 0; i < vectorPersona.length; i++) {
            System.out.println("Ingresa un nombre (o 0 para parar):");
            String nombre = entrada.nextLine();
            System.out.println("Ingresa un apellido (o 0 para parar):");
            String apellidos = entrada.nextLine();
            System.out.println("Ingresa un dni (o 0 para parar):");
            String dni = entrada.nextLine();
            if (dni.equals("0") || nombre.equals("0") || apellidos.equals("0")) {
                break;
            }
            vectorPersona[i] = new Persona(nombre, apellidos, dni);
        }
        for (Persona persona : vectorPersona) {
            try{
                System.out.println(persona.getNombre() + " " + persona.getApellido() + " con dni " + persona.getDni());
            } catch (NullPointerException e){
                break;
            }
        }
    }
}