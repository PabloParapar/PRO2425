package src.ud4.Boletin4.Vectores;

import src.ud4.Boletin4.Alumno;
import src.ud4.Boletin4.Grupo;

import java.util.Scanner;

/**
 * @author lopparpab
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                Ejercicio 5
                
                Se desea gestionar los datos de los alumnos de un instituto utilizando
                las clases Alumno y Grupo
                """);
        System.out.println("""
                Crear un grupo llamado DAM y mostrar un menú que permita matricular alumnos,
                eliminarlos y listar los matriculados
                """);
        Grupo dam = new Grupo("SQLito");
        menuGrupoDAM();
        int opcion = ingresarOpcion(entrada);
        while (opcion != 0) {
            int identificador;
            String nombre;
            switch (opcion) {
                case 1:
                    System.out.println("\33[33mMatricular nuevo Alumno:\u001b[0m");
                    System.out.println("Ingresa el Identificador del Alumno:");
                    identificador = ingresarOpcion(entrada);
                    System.out.println("Ingresa el nombre del Alumno:");
                    nombre = ingresarTexto(entrada);
                    dam.matricular(new Alumno(identificador, nombre));
                    System.out.println("Nuevo Alumno en el Grupo con éxito");
                    break;
                case 2:
                    System.out.println("\33[33mEliminar Alumno del Grupo DAM:\u001b[0m");
                    System.out.println("Ingresa el identificador del Alumno:");
                    identificador = ingresarOpcion(entrada);
                    if (dam.eliminar(identificador)) {
                        System.out.println("Alumno eliminado del Grupo con éxito");
                    } else {
                        System.out.println("Ese alumno no está en el Grupo DAM");
                    }
                    break;
                case 3:
                    System.out.println("Lista de Alumnos Matriculados:");
                    dam.imprimir();
                    break;
                default:
                    System.out.println("Opción fuera de rango:");
                    break;
            }
            menuGrupoDAM();
            opcion = ingresarOpcion(entrada);
        }
    }

    public static void menuGrupoDAM() {
        System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃        \033[36mGestionar Grupo DAM\u001b[0m        ┃
                ┠─────┬─────────────────────────────┨
                ┃  \33[33m1\u001b[0m  │  \33[33mMatricular Alumno\u001b[0m          ┃
                ┠─────┼─────────────────────────────┨
                ┃  \33[33m2\u001b[0m  │  \33[33mEliminar Alumno\u001b[0m            ┃
                ┠─────┼─────────────────────────────┨
                ┃  \33[33m3\u001b[0m  │  \33[33mListar Matriculados\u001b[0m        ┃
                ┠─────┼─────────────────────────────┨
                ┃  \033[31m0\u001b[0m  │  \033[31mSalir\u001b[0m                      ┃
                ┗━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
    }

    public static int ingresarOpcion(Scanner escaner) {
        int opcion;
        try{
            opcion = escaner.nextInt();
            return opcion;
        } catch (Exception e) {
            System.out.println("Opción no válida");
            escaner.nextLine();
            return ingresarOpcion(escaner);
        } finally{
            escaner.nextLine();
        }
    }
    public static String ingresarTexto(Scanner escaner){
        String texto = escaner.nextLine().trim();
        if (texto.isEmpty()){
            System.out.println("Error: Cadena Vacía");
            return ingresarTexto(escaner);
        } else{
            return texto;
        }
    }
}
