package src.UD5;

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

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
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
}
