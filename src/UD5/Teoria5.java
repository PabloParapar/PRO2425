package src.UD5;

import java.util.Calendar;
import java.util.Date;

public class Teoria5 {
    public static void main(String[] args) {
        Persona diego = new Persona();  //Instancia de la clase persona
        diego.edad=22;
        diego.apellido="lalala";

        System.out.println(diego.edad);
        System.out.println(diego.apellido);
        System.out.println(diego.dni);

        Persona pablo = new Persona();
        pablo.edad=27;
        pablo.apellido="Parapar";
        pablo.dni="12345678G";
        pablo.nombre="Pablo";
        pablo.fechaNacimiento= new Date(1997, Calendar.JUNE, 14);
        System.out.println(pablo.nombre);
        System.out.println(pablo.apellido);
        System.out.println(pablo.edad);
        System.out.println(pablo.dni);
        System.out.println(pablo.fechaNacimiento);
    }
}
