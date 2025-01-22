package src.UD5;

import java.util.Calendar;
import java.util.Date;

public class Teoria5 {
    public static void main(String[] args) {
        /*
        Este fragmento explica como modificar los atributos de Persona, ahora son privados por lo que no funciona

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
        */
        //15 de Enero de 2025

        Alumno maria;              //Contenido: null
        maria = new Alumno();      //Contenido: intancia de Persona guardada en la variable maria

        Alumno manuel;             //Contenido: null
        manuel = maria;             //Contenido: la misma instancia de Persona guardada en maria

        Persona mario = new Alumno();
        Persona manuela = mario;

        mario.setEdad(30);
        System.out.println(mario.getEdad());
        System.out.println(manuela.getEdad()); //Muestran el mismo valor por consultarlo en el mismo espacio de memoria

        //Modificadores de Visibilidad

        Profesor gerardo = new Profesor();
        /*
        Este fragmento de código sirve para explicar la accesibilidad de los atributos
        gerardo.nombre = "Gerardo";
        gerardo.apellido = "Peña";
        gerardo.edad = 54;
        gerardo.dni = "12345678V";
        gerardo.fechaNacimiento = new Date(1, 12, 25);
        gerardo.direccionPostal = "C/ Calle Falsa 123 27002";
        gerardo.email = "gerardopeña@gmail.com";
        gerardo.telefono = 982232323;
        //gerardo.grupoSanguineo = "AB";    Al ser private solo se puede acceder desde el interior de la clase
        //gerardo.sexo = Sexo.HOMBRE;       Al ser private solo se puede acceder desde el interior de la clase
        */

        //GETTERS y SETTERS
        /*
        * Ahora que los atributos de Persona son private hemos implementado getters y setters
        * para trabajar con ellos desde fuera de la clase
        *
        * Los Getters son métodos de lectura, nos devuelven el valor del atributo del Objeto
        * gerardo.nombre == gerardo.getNombre()
        *
        * Los Setters son métodos de escritura, nos ayudan a aplicar un valor a los atributos del objeto
        * gerardo.nombre = "gerardo" == gerardo.setNombre("gerardo")
        * */
        gerardo.setNombre("Gerardo");
        gerardo.setApellido("Peña");
        gerardo.setEdad(54);
        gerardo.setDni(12345678);
        gerardo.setFechaNacimiento(new Date(1, 12, 25));
        gerardo.setDireccionPostal("C/ Calle Falsa 123 27002");
        gerardo.setEmail("gerardopeña@gmail.com");
        gerardo.setTelefono(982232323);
        gerardo.setGrupoSanguineo("AB");
        gerardo.setSexo(Sexo.HOMBRE);

        //Constructores

        Profesor aurelia = new Profesor("Aurelia", "Ramírez");

        Profesor aurelia2 = new Profesor();
        aurelia2.setNombre("Aurelia");
        aurelia2.setApellido("Ramírez");
        //Ambas Aurelias son equivalentes, pero la primera es más óptima

        Alumno marisa = new Alumno();
        Alumno marisa2 = new Alumno();
        marisa2.setNombre("Marisa");
        marisa2.setApellido("Señora");
        marisa2.setEdad(65);
        marisa2.setDni(12345678);
        marisa2.setFechaNacimiento(new Date(1900, 12, 25));
        marisa2.setDireccionPostal("27002");
        marisa2.setEmail("marisasenhora@hotmail.com");
        marisa2.setTelefono(982982982);
        marisa2.setGrupoSanguineo("0");
        marisa2.setSexo(Sexo.MUJER);

        //17 de Enero de 2025

        //HERENCIA

        Alumno hector = new Alumno();
        hector.setNombre("Héctor");

        Profesor victor = new Profesor();
        victor.setNombre("Víctor");
        //Todos los atributos y métodos de Persona están en Profesor por el extends

        Alumno pablo = new Alumno();
        pablo.setNombre("Pablo");

        //20 de Enero de 2025

        //Sobreescritura de métodos

        Profesor paco = new Profesor();
        paco.trabajar();

        Alumno aitor = new Alumno();
        aitor.trabajar();

        Profesor elProfesor = new Profesor();
        elProfesor.trabajar();

        //Jerarquía de Clases

        elProfesor.setNombre("Aniceto");
        elProfesor.setApellido("Ramírez");
        System.out.println(elProfesor.toString());
        System.out.println(aitor.toString());
        System.out.println(paco.toString());

        //Casting de objetos con relación de herencia

        Animal a = new Animal();
        Animal b = new Perro();
        //Perro c = (Perro) new Animal();

        a.mueve();
        b.mueve();
        ((Perro)b).salta();

        //22 de Enero de 2025

        //Clases y Métodos Abstractos


    }
}
