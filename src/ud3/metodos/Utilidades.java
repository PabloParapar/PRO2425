package src.ud3.metodos;

/**
 * @author lopparpab
 */
public abstract class Utilidades {
    /**
     * Imprime en pantalla una tabla que clasifica los ejercicios del boletín 3 por temática.
     * Asigna un código de color en función del estado del ejercicio (completo, saltado, no empezado...)
     */
    public static void menuSeleccion() {
        String reset = "\u001b[0m";         // Reset
        String snooze = "\033[30m";         // Black
        String saltado = "\033[31m";        // Red
        String terminado = "\033[32m";      // Green
        String incubadora = "\033[35m";     // Magenta
        String enProceso = "\33[33m";       // Yellow
        String destacado = "\033[36m";      // Cyan
        //MENÚ EJERCICIOS
        System.out.println(
                "\n                           Unidad Didáctica 3 | Boletín 3\n\n" +
                        "        ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓\n" +
                        "        ┃                      Ejercicios de " + destacado + "métodos" + reset + "                      ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + " 1" + reset + "    │    " + terminado + " 2" + reset + "    │    " + terminado + " 3" + reset + "    │    " + terminado + " 4" + reset + "    │    " + terminado + " 5" + reset + "    │    " + terminado + " 6" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + terminado + " 7" + reset + "    │    " + terminado + " 8" + reset + "    │    " + terminado + " 9" + reset + "    │    " + terminado + "10" + reset + "    │    " + terminado + "11" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                 Ejercicios de " + destacado + "métodos recursivos" + reset + "                ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + "12" + reset + "    │    " + terminado + "13" + reset + "    │    " + terminado + "14" + reset + "    │    " + terminado + "15" + reset + "    │    " + terminado + "16" + reset + "    │    " + terminado + "17" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + terminado + "18" + reset + "    │    " + terminado + "19" + reset + "    │    " + terminado + "20" + reset + "    │    " + terminado + "21" + reset + "    │    " + terminado + "22" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃                      Uso básico de " + destacado + "objetos" + reset + "                      ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + terminado + "23" + reset + "               │               " + terminado + "24" + reset + "               ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                   Ejercicios de la clase " + destacado + "Math" + reset + "                   ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + "25" + reset + "    │    " + terminado + "26" + reset + "    │    " + terminado + "27" + reset + "    │    " + terminado + "28" + reset + "    │    " + terminado + "29" + reset + "    │    " + terminado + "30" + reset + "    ┃\n" +
                        "        ┠──────────┴──────────┼──────────┴──────────┼──────────┴──────────┨\n" +
                        "        ┃          " + terminado + "31" + reset + "         │          " + terminado + "32" + reset + "         │          " + terminado + "33" + reset + "         ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                  Ejercicios de la clase " + destacado + "String" + reset + "                  ┃\n" +
                        "        ┠──────────┬──────────┬──────────┬──────────┬──────────┬──────────┨\n" +
                        "        ┃    " + terminado + "34" + reset + "    │    " + terminado + "35" + reset + "    │    " + terminado + "36" + reset + "    │    " + terminado + "37" + reset + "    │    " + terminado + "38" + reset + "    │    " + terminado + "39" + reset + "    ┃\n" +
                        "        ┠──────────┼──────────┼──────────┼──────────┼──────────┼──────────┨\n" +
                        "        ┃    " + terminado + "40" + reset + "    │    " + terminado + "41" + reset + "    │    " + terminado + "42" + reset + "    │    " + terminado + "43" + reset + "    │    " + terminado + "44" + reset + "    │          ┃\n" +
                        "        ┣━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┷━━━━━━━━━━┫\n" +
                        "        ┃        Ejercicios de la clase " + destacado + "String" + reset + " y " + destacado + "clases envoltorio" + reset + "        ┃\n" +
                        "        ┠────────────────────────────────┬────────────────────────────────┨\n" +
                        "        ┃               " + terminado + "45" + reset + "               │               " + enProceso + "46" + reset + "               ┃\n" +
                        "        ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫\n" +
                        "        ┃                  Ejercicios de " + destacado + "manejo de fechas" + reset + "                 ┃\n" +
                        "        ┠────────────────┬───────────────┬───────────────┬────────────────┨\n" +
                        "        ┃       " + incubadora + "47" + reset + "       │       " + incubadora + "48" + reset + "      │       " + incubadora + "49" + reset + "      │       " + incubadora + "50" + reset + "       ┃\n" +
                        "        ┗━━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━┷━━━━━━━━━━━━━━━━┛\n");
    }
}
