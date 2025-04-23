package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        int[] vectorGanador = rellenarVector();

            System.out.println("Resultado Sorteo");
            for (int numero: vectorGanador){
                System.out.printf("%02d ", numero);
            }
        imprimirTablaAciertos(vectorGanador);
        System.out.println();
        System.out.println("Cuántos casos quieres comprobar?");
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        imprimirTablaAciertosC(casos, vectorGanador);
    }
    public static int[] rellenarVector(){
        Integer [] candidatos = new Integer [49];
        int [] resultado = new int[7];
        for (int i = 1; i <= candidatos.length; i++) {
            candidatos[i-1] = i;
        }
        Random random = new Random();
        for (int i = 0; i < resultado.length; i++) {
            int indice = random.nextInt(candidatos.length-i);
            resultado[i] = candidatos[indice];
            candidatos[indice] = 0;
            Arrays.sort(candidatos, Comparator.reverseOrder());
        }
        Arrays.sort(resultado);
        return resultado;
    }

    public static int comprobarVectorEnteros(int[] vector1, int[] vector2){
        int contador = 0;
        int numero1;
        int numero2;
        //Arrays.sort(vector1);
        //Arrays.sort(vector2);
        for (int i = 0; i < vector1.length; i++) {
            numero1 = vector1[i];
            for (int j = 0; j < vector2.length; j++) {
                numero2 = vector2[j];
                if (numero1 == numero2){
                    contador++;
                    break;
                } else if (numero1 < numero2){
                    break;
                }
            }
        }
        return contador;
    }

    public static void imprimirTablaAciertos(int[] resultadoSorteo){
        int contadorAciertos6 = 0;
        int contadorAciertos5C = 0;
        int contadorAciertos5 = 0;
        int contadorAciertos4 = 0;
        int contadorAciertos3 = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int [] participante = rellenarVector();
            int comparacion = comprobarVectorEnteros(resultadoSorteo, participante);
            switch (comparacion){
                case 6:
                    if (participante[6]==resultadoSorteo[6]){
                        contadorAciertos5C++;
                    } else{
                        contadorAciertos6++;
                    }
                    break;
                case 5:
                    contadorAciertos5++;
                    break;
                case 4:
                    contadorAciertos4++;
                    break;
                case 3:
                    contadorAciertos3++;
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        System.out.println(
                "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"\n"+
                "      \033[36mAciertos\u001b[0m      │     \033[36mGanadores\u001b[0m      "+"\n"+
                "────────────────────┼────────────────────"+"\n"+
                "       \33[33m   6   \u001b[0m      │      \33[33m   "+contadorAciertos6 +" \u001b[0m"+"\n"+
                "────────────────────┼────────────────────"+"\n"+
                "       \33[33m 5 + C \u001b[0m      │      \33[33m   "+contadorAciertos5C+" \u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   5   \u001b[0m      │      \33[33m   "+contadorAciertos5+"\u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   4   \u001b[0m      │      \33[33m   "+contadorAciertos4+"\u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   3   \u001b[0m      │      \33[33m   "+contadorAciertos3+" \u001b[0m"+"\n"+
                "━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━"
                );
    }
    public static void imprimirTablaAciertosC(int casos,int[] resultadoSorteo){
        int contadorAciertos6 = 0;
        int contadorAciertos5C = 0;
        int contadorAciertos5 = 0;
        int contadorAciertos4 = 0;
        int contadorAciertos3 = 0;
        int contadorSorteos = 0;
        while (casos > contadorAciertos6){
            int [] participante = rellenarVector();
            int comparacion = comprobarVectorEnteros(resultadoSorteo, participante);
            switch (comparacion){
                case 6:
                    if (participante[6]==resultadoSorteo[6]){
                        contadorAciertos5C++;
                    } else{
                        contadorAciertos6++;
                    }
                    break;
                case 5:
                    contadorAciertos5++;
                    break;
                case 4:
                    contadorAciertos4++;
                    break;
                case 3:
                    contadorAciertos3++;
                    break;
                default:
                    break;
            }
            contadorSorteos++;
        }
        System.out.println();
        System.out.println(
                "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"\n"+
                "      \033[36mAciertos\u001b[0m      │     \033[36mGanadores\u001b[0m      "+"\n"+
                "────────────────────┼────────────────────"+"\n"+
                "       \33[33m   6   \u001b[0m      │      \33[33m   "+contadorAciertos6 +" \u001b[0m"+"\n"+
                "────────────────────┼────────────────────"+"\n"+
                "       \33[33m 5 + C \u001b[0m      │      \33[33m   "+contadorAciertos5C+" \u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   5   \u001b[0m      │      \33[33m   "+contadorAciertos5+"\u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   4   \u001b[0m      │      \33[33m   "+contadorAciertos4+"\u001b[0m"+"\n"+
                "────────────────────┼─────────────────────"+"\n"+
                "       \33[33m   3   \u001b[0m      │      \33[33m   "+contadorAciertos3+" \u001b[0m"+"\n"+
                "━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━"
                );
        System.out.println("Han habido "+contadorSorteos+" participantes hasta llegar a "+casos+" ganadores");
    }
}
