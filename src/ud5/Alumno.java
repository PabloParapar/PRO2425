package src.ud5;

/**
 * @author lopparpab
 */
public class Alumno extends Persona{
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void trabajar(){
        System.out.println("Soy un estudiante, mi trabajo es estudiar");
    }

    public Alumno() {

    }

    public Alumno(String curso) {
        this.curso = curso;
    }
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
        //this.curso = curso;
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                //", curso='" + curso + '\'' +
                '}';
    }



    @Override
    public void respirar() {
        super.respirar();
    }

    @Override
    public void comer() {
        super.comer();
    }


    /**
     *
     * @param o el objeto a comparar.
     * @return  el primer objeto ordenado según el atributo apellido
     */
    @Override
    public int compareTo(Persona o) {
        return this.apellido.compareTo(o.apellido);
    }
}
