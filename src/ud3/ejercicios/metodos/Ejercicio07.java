package src.ud3.ejercicios.metodos;

import src.ud3.ejercicios.Ejercicio;

import java.util.Scanner;

public class Ejercicio07 extends Ejercicio {
    private Ejercicio07() {
    }

    public static void resolverEjercicio(Scanner entrada) {

        System.out.println("""
            Boletin 3 | Ejercicio 7
        Codificar una aplicación que pida horas, minutos y segundos en formato “hh:mm:ss”. A partir de esta cadena, se extraerán las horas, minutos y segundos y se enviarán a un método que indicará si es correcta o no la hora.
        La ejecución finalizará cuando se teclee un cero:""");
        System.out.println("\nIngresa la hora a comprobar en formato \033[36mHH:MM:SS\u001b[0m\n");
        entrada.nextLine();
        String tiempo = ingresarCadena(entrada);

        while (!tiempo.equals("0")){
            formatearHora(tiempo);
            System.out.println("\nIngresa otra hora a comprobar en formato \033[36mHH:MM:SS\u001b[0m\n(o ingresa el 0 para cerrar)");
            tiempo = ingresarCadena(entrada);
            if (tiempo.equals("0")){
                break;
            }
        }
    }
    public static void formatearHora(String cadena){
        Integer limite1 = null;
        Integer limite2 = null;
        int horas;
        int minutos;
        int segundos;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ':'){
                if (limite1 == null){
                    limite1 = i;
                } else{
                    limite2 = i;
                    break;
                }
            }
        }
        if (limite1 == null || limite2 == null){
            System.out.println("Formato de hora incorrecto \033[36mHH:MM:SS\u001b[0m\n:");
        } else{
            horas = Integer.parseInt(cadena.substring(0, limite1));
            minutos = Integer.parseInt(cadena.substring(limite1+1, limite2));
            segundos = Integer.parseInt(cadena.substring(limite2+1));
                System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);
            if (validarHora(horas,minutos,segundos)){
                System.out.print(" es una hora válida");
            } else {
                System.out.print(" no es una hora válida");

            }/*
            System.out.println("Horas : "+horas);
            System.out.println("Minutos : "+minutos);
            System.out.println("Segundos : "+segundos);
            System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);*/
        }
    }
    public static boolean validarHora(int hora, int minuto, int segundo){
        boolean horaValida = hora >= 0 && hora < 24;
        boolean minutoValido =minuto >= 0 && minuto < 60;
        boolean segundoValido = segundo >= 0 && segundo < 60;
        return horaValida && minutoValido && segundoValido;
    }
}