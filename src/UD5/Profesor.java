package src.UD5;

public class Profesor extends Persona{

    Integer antiguedad;

    public Profesor (){

    }

    //El Constructor de una clase heredada necesita el super para tomar los atributos de la superclase
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    //Al tener atributos propios tomará el constructor de la superclase deseado y los atributos que queramos de la clase actual
    public Profesor(String nombre, String apellido, Integer antiguedad) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
    }
}
