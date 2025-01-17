package src.UD4;

import src.UD5.Persona;

import java.util.Date;

public class Visibilidad {
    public static void main(String[] args) {
        Persona gerardo = new Persona();
        //gerardo.nombre = "Gerardo";
        //gerardo.apellido = "Peña";                                //Como son public se puede acceder desde cualquier paquete
        //gerardo.edad = 54;                                        //Como son public se puede acceder desde cualquier paquete
        //gerardo.dni = "12345678V";                                Desde otro paquete no se puede acceder a los atributos protected
        //gerardo.fechaNacimiento = new Date(1, 12, 25);            Desde otro paquete no se puede acceder a los atributos protected
        //gerardo.direccionPostal = "C/ Calle Falsa 123 27002";     Desde otro paquete no se puede acceder a los atributos protected
        //gerardo.email = "gerardopeña@gmail.com";                  Desde otro paquete no se puede acceder a los atributos default
        //gerardo.telefono = 982232323;                             Desde otro paquete no se puede acceder a los atributos default
        //gerardo.grupoSanguineo = "AB";                            Al ser private solo se puede acceder desde el interior de la clase
        //gerardo.sexo = Sexo.HOMBRE;                               Al ser private solo se puede acceder desde el interior de la clase
    }
}
