package Ejercicio2;

import static Ejercicio2.Utilidades.formatearNombre;

public class Estudiante extends Persona{
    private Madurez madurez;
    private Persona tutorLegal;
    private CentroEducativo centroEducativo;
    private String curso;
    private Casa casa;
    public Estudiante() {

    }


    public Estudiante(String nombre, String apellido1, String apellido2, Madurez madurez, Persona tutorLegal, CentroEducativo centroEducativo, String curso, Casa casa) {
        super(formatearNombre(nombre), formatearNombre(apellido1), formatearNombre(apellido2));
        this.madurez = madurez;
        this.tutorLegal = tutorLegal;
        this.centroEducativo = centroEducativo;
        this.curso = curso;
        this.casa = casa;
    }
}
