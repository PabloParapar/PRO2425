package src.ud4.Boletin4.Vectores;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        String[][] baraja = {
                {"1♠", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "J♠", "Q♠", "K♠"},
                {"1♣", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "J♣", "Q♣", "K♣"},
                {"1♥", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "J♥", "Q♥", "K♥"},
                {"1♦", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "J♦", "Q♦", "K♦"}
        };
        int numeroPruebas = 1_000_000;
        int contadorFull = 0;
        int contadorPoker = 0;
        Random indicePalo = new Random();
        Random indiceNumero = new Random();
        for (int i = 0; i < numeroPruebas; i++) {
            HashSet<String> mano = new HashSet<>();
            while (mano.size() < 5) {
                int palo = indicePalo.nextInt(4);
                int num = indiceNumero.nextInt(10);
                String carta = baraja[palo][num];

                mano.add(carta);
            }
            int[] contador = new int[10];
            for (String carta : mano) {
                String numeroCarta = carta.substring(0,1);
                int numero = 0;
                switch (numeroCarta){
                    case "K":
                        numero = 10;
                        break;
                    case "Q":
                        numero = 9;
                        break;
                    case "J":
                        numero = 8;
                        break;
                    case "7","6","5","4","3","2","1":
                        numero = Integer.parseInt(numeroCarta);
                }
                contador[numero-1] += 1;
            }
            Arrays.sort(contador);
            if (contador[9] + contador[8] == 5) {
                if (contador[9] == 4) {
                    contadorPoker++;
                } else if (contador[9] == 3 && contador[8] == 2) {
                    contadorFull++;
                }
            }


        }
        System.out.println("Cantidad Poker en "+numeroPruebas+" manos = "+contadorPoker);
        System.out.println("Cantidad Full  en "+numeroPruebas+" manos = "+contadorFull);
        if (contadorPoker > contadorFull){
            System.out.println("Es más difícil conseguir un Full");
        } else {
            System.out.println("Es más difícil conseguir un Poker");
        }
    }
}

