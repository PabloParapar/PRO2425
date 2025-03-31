package src.ud3;

import java.util.Scanner;

import src.ud3.ejercicios.clasemath.*;
import src.ud3.ejercicios.clasestring.*;
import src.ud3.ejercicios.clasesenvoltorio.*;
import src.ud3.ejercicios.manejodefechas.*;
import src.ud3.ejercicios.metodos.*;
import src.ud3.ejercicios.metodosrecursivos.*;
import src.ud3.ejercicios.objetos.*;

import static src.ud3.metodos.Utilidades.*;

/**
 * @author lopparpab
 */
public class Boletin3 {

    public static void main(String[] args) {

        menuSeleccion();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el número del ejercicio que quieres ver (0 para salir):\n");
        int ejercicio = entrada.nextInt();

        while (ejercicio != 0) {
            switch (ejercicio) {
                case 1:
                    Ejercicio01.resolverEjercicio(entrada);
                    break;

                case 2:
                    Ejercicio02.resolverEjercicio(entrada);
                    break;

                case 3:
                    Ejercicio03.resolverEjercicio(entrada);
                    break;

                case 4:
                    Ejercicio04.resolverEjercicio(entrada);
                    break;

                case 5:
                    Ejercicio05.resolverEjercicio(entrada);
                    break;

                case 6:
                    Ejercicio06.resolverEjercicio(entrada);
                    break;

                case 7:
                    Ejercicio07.resolverEjercicio(entrada);
                    break;

                case 8:
                    Ejercicio08.resolverEjercicio(entrada);
                    break;

                case 9:
                    Ejercicio09.resolverEjercicio(entrada);
                    break;

                case 10:
                    Ejercicio10.resolverEjercicio(entrada);
                    break;

                case 11:
                    Ejercicio11.resolverEjercicio(entrada);
                    break;

                case 12:
                    Ejercicio12.resolverEjercicio(entrada);
                    break;

                case 13:
                    Ejercicio13.resolverEjercicio(entrada);
                    break;

                case 14:
                    Ejercicio14.resolverEjercicio(entrada);
                    break;

                case 15:
                    Ejercicio15.resolverEjercicio(entrada);
                    break;

                case 16:
                    Ejercicio16.resolverEjercicio(entrada);
                    break;

                case 17:
                    Ejercicio17.resolverEjercicio(entrada);
                    break;

                case 18:
                    Ejercicio18.resolverEjercicio(entrada);
                    break;

                case 19:
                    Ejercicio19.resolverEjercicio(entrada);
                    break;

                case 20:
                    Ejercicio20.resolverEjercicio(entrada);
                    break;

                case 21:
                    Ejercicio21.resolverEjercicio(entrada);
                    break;

                case 22:
                    Ejercicio22.resolverEjercicio(entrada);
                    break;

                case 23:
                    Ejercicio23.resolverEjercicio();
                    break;

                case 24:
                    Ejercicio24.resolverEjercicio();
                    break;

                case 25:
                    Ejercicio25.resolverEjercicio(entrada);
                    break;

                case 26:
                    Ejercicio26.resolverEjercicio(entrada);
                    break;

                case 27:
                    Ejercicio27.resolverEjercicio();
                    break;

                case 28:
                    Ejercicio28.resolverEjercicio(entrada);
                    break;

                case 29:
                    Ejercicio29.resolverEjercicio();
                    break;

                case 30:
                    Ejercicio30.resolverEjercicio(entrada);
                    break;

                case 31:
                    Ejercicio31.resolverEjercicio(entrada);
                    break;

                case 32:
                    Ejercicio32.resolverEjercicio();
                    break;

                case 33:
                    Ejercicio33.resolverEjercicio();
                    break;

                case 34:
                    Ejercicio34.resolverEjercicio(entrada);
                    break;

                case 35:
                    Ejercicio35.resolverEjercicio(entrada);
                    break;

                case 36:
                    Ejercicio36.resolverEjercicio(entrada);
                    break;

                case 37:
                    Ejercicio37.resolverEjercicio(entrada);
                    break;

                case 38:
                    Ejercicio38.resolverEjercicio(entrada);
                    break;

                case 39:
                    Ejercicio39.resolverEjercicio(entrada);
                    break;

                case 40:
                    Ejercicio40.resolverEjercicio(entrada);
                    break;

                case 41:
                    entrada.nextLine();
                    Ejercicio41.resolverEjercicio(entrada);
                    break;

                case 42:
                    Ejercicio42.resolverEjercicio(entrada);
                    break;

                case 43:
                    Ejercicio43.resolverEjercicio(entrada);
                    break;

                case 44:
                    Ejercicio44.resolverEjercicio(entrada);
                    break;

                case 45:
                    Ejercicio45.resolverEjercicio(entrada);
                    break;

                case 46:
                    Ejercicio46.resolverEjercicio(entrada);
                    break;

                case 47:
                    Ejercicio47.resolverEjercicio(entrada);
                    break;

                case 48:
                    Ejercicio48.resolverEjercicio(entrada);
                    break;

                case 49:
                    Ejercicio49.resolverEjercicio(entrada);
                    break;

                case 50:
                    Ejercicio50.resolverEjercicio(entrada);
                    break;

                default:
                    menuSeleccion();
                    System.out.println("Eso ni siquiera era un ejercicio");
            }
            menuSeleccion();
            System.out.println("Ingresa el número del siguiente ejercicio que quieres ver (0 para salir):\n");
            ejercicio = entrada.nextInt();
        }
    }
}

