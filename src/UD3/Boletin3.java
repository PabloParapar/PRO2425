package src.UD3;

import java.util.Scanner;

import src.UD3.Ejercicios.ClaseMath.*;
import src.UD3.Ejercicios.ClaseString.*;
import src.UD3.Ejercicios.ClasesEnvoltorio.Ejercicio45;
import src.UD3.Ejercicios.ClasesEnvoltorio.Ejercicio46;
import src.UD3.Ejercicios.ManejoDeFechas.Ejercicio47;
import src.UD3.Ejercicios.ManejoDeFechas.Ejercicio48;
import src.UD3.Ejercicios.ManejoDeFechas.Ejercicio49;
import src.UD3.Ejercicios.ManejoDeFechas.Ejercicio50;
import src.UD3.Ejercicios.Metodos.*;
import src.UD3.Ejercicios.MetodosRecursivos.*;
import src.UD3.Ejercicios.Objetos.Ejercicio23;
import src.UD3.Ejercicios.Objetos.Ejercicio24;

import static src.UD3.Metodos.Utilidades.*;

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
                    Ejercicio06.ejercicio6(entrada);
                    break;

                case 7:
                    Ejercicio07.ejercicio7(entrada);
                    break;

                case 8:
                    Ejercicio08.ejercicio8(entrada);
                    break;

                case 9:
                    Ejercicio09.ejercicio9(entrada);
                    break;

                case 10:
                    Ejercicio10.ejercicio10(entrada);
                    break;

                case 11:
                    Ejercicio11.ejercicio11(entrada);
                    break;

                case 12:
                    Ejercicio12.ejercicio12(entrada);
                    break;

                case 13:
                    Ejercicio13.ejercicio13(entrada);
                    break;

                case 14:
                    Ejercicio14.ejercicio14(entrada);
                    break;

                case 15:
                    Ejercicio15.ejercicio15(entrada);
                    break;

                case 16:
                    Ejercicio16.ejercicio16(entrada);
                    break;

                case 17:
                    Ejercicio17.ejercicio17(entrada);
                    break;

                case 18:
                    Ejercicio18.ejercicio18(entrada);
                    break;

                case 19:
                    Ejercicio19.ejercicio19(entrada);
                    break;

                case 20:
                    Ejercicio20.ejercicio20(entrada);
                    break;

                case 21:
                    Ejercicio21.ejercicio21(entrada);
                    break;

                case 22:
                    Ejercicio22.ejercicio22(entrada);
                    break;

                case 23:
                    Ejercicio23.ejercicio23();
                    break;

                case 24:
                    Ejercicio24.ejercicio24();
                    break;

                case 25:
                    Ejercicio25.ejercicio25(entrada);
                    break;

                case 26:
                    Ejercicio26.ejercicio26(entrada);
                    break;

                case 27:
                    Ejercicio27.ejercicio27(entrada);
                    break;

                case 28:
                    Ejercicio28.ejercicio28(entrada);
                    break;

                case 29:
                    Ejercicio29.ejercicio29();
                    break;

                case 30:
                    Ejercicio30.ejercicio30(entrada);
                    break;

                case 31:
                    Ejercicio31.ejercicio31(entrada);
                    break;

                case 32:
                    Ejercicio32.ejercicio32();
                    break;

                case 33:
                    Ejercicio33.ejercicio33();
                    break;

                case 34:
                    Ejercicio34.ejercicio34(entrada);
                    break;

                case 35:
                    Ejercicio35.ejercicio35(entrada);
                    break;

                case 36:
                    Ejercicio36.ejercicio36(entrada);
                    break;

                case 37:
                    Ejercicio37.ejercicio37(entrada);
                    break;

                case 38:
                    Ejercicio38.ejercicio38(entrada);
                    break;

                case 39:
                    Ejercicio39.ejercicio39(entrada);
                    break;

                case 40:
                    Ejercicio40.ejercicio40(entrada);
                    break;

                case 41:
                    entrada.nextLine();
                    Ejercicio41.ejercicio41(entrada);
                    break;

                case 42:
                    Ejercicio42.ejercicio42(entrada);
                    break;

                case 43:
                    Ejercicio43.ejercicio43(entrada);
                    break;

                case 44:
                    Ejercicio44.ejercicio44(entrada);
                    break;

                case 45:
                    Ejercicio45.ejercicio45(entrada);
                    break;

                case 46:
                    Ejercicio46.ejercicio46(entrada);
                    break;

                case 47:
                    Ejercicio47.ejercicio47(entrada);
                    break;

                case 48:
                    Ejercicio48.ejercicio48(entrada);
                    break;

                case 49:
                    Ejercicio49.ejercicio49(entrada);
                    break;

                case 50:
                    Ejercicio50.ejercicio50(entrada);
                    break;

                default:
                    menuSeleccion();
                    System.out.println("Eso ni siquiera era un ejercicio");
            }
            System.out.println("Ingresa el número del siguiente ejercicio que quieres ver (0 para salir):\n");
            ejercicio = entrada.nextInt();
        }
    }
}

