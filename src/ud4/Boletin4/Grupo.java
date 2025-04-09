package src.ud4.Boletin4;

import java.util.ArrayList;

/**
 * @author lopparpab
 */
public class Grupo {
    private String identificador;
    private ArrayList<Alumno> listaMatriculados;

    public Grupo() {
    }

    public Grupo(String identificador) {
        this.identificador = identificador;
        listaMatriculados = new ArrayList<>();
    }

    public boolean estaMatriculado(int id) {
        for (Alumno alumno : this.listaMatriculados) {
            if (alumno.getIdentificador() == id) {
                return true;
            }
        }
        return false;
    }

    public void matricular(Alumno alumno) {
        this.listaMatriculados.add(alumno);
    }

    public boolean eliminar(int id) {
        if (estaMatriculado(id)) {
            for (Alumno alumno : this.listaMatriculados) {
                if (alumno.getIdentificador() == id) {
                    this.listaMatriculados.remove(alumno);
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimir() {
        if (!this.listaMatriculados.isEmpty()) {
            for (Alumno alumno : this.listaMatriculados) {
                System.out.println(alumno.getIdentificador() + " | " + alumno.getNombre());
            }
        } else {
            System.out.println("No hay Alumnos en el Grupo");
        }
    }
}
