package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;

public class CentroEducativo extends EdificioPublico{
    private EtapaEducativa etapa;
    private HashMap<String, ArrayList<Estudiante>> curso;
    /*
    Habiendo N cursos únicos posibles la mejor opción es utilizar un HashMap con la clave con el nombre del curso y
    un ArrayList<Estudiante> donde añadir a los alumnos matriculados

     */

    public CentroEducativo() {
    }

    
}
