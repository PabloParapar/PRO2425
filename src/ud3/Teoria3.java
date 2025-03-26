package src.ud3;

import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Random;

import static java.lang.Math.PI;

/**
 * @author lopparpab
 */
public class Teoria3 {
    //Viernes 15/11/2024

    /**
     *
     * @param valor
     * Imprime en pantalla la tabla de multiplicar del valor especificado
     */
    private static void imprimeTablaMultiplicar(int valor) {
        System.out.println("Tabla de multiplicar del " + valor);
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + valor * i);
        }
        /*
         * Código que teníamos en el main
         *
         * for (int valor = 1; valor <= 2; valor++) {
         *    imprimeTablaMultiplicar(valor);
         * }
         */
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return Devueve la suma de los dos enteros ingresados
     */
    private static int sumar(int numero1, int numero2) {
        //int resultado = numero1 + numero2;
        return numero1 + numero2;    //Siempre que el método no sea void debe tener return
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return Devuelve la media de los dos valores ingresados
     */
    private static double hacerMedia(int numero1, int numero2) {
        return (double) (numero1 + numero2) / 2;
    }

    /**
     * Imprime en pantalla el nombre, edad y lugar de nacimiento del autor
     */
    private static void hacerPresentacion() {
        System.out.println("Pablo, edad 27, Vegadeo");
    }

    /**
     *
     * @param nombre
     * @param lugarNacimiento
     * @param edad
     * Imprime en pantalla el valor de los parámetros ingresados
     */
    private static void imprimirPresentacion(String nombre, String lugarNacimiento, int edad) {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(lugarNacimiento);
    }

    public static void main(String[] args) {
        //Cualquier código que queramos utilizar debemos llamarlo desde el método main
        System.out.println(sumar(10, 10));
        System.out.println(hacerMedia(9, 8));
        hacerPresentacion();
        imprimirPresentacion("Pablo", "Vegadeo", 27);

        System.out.println(factorial(5));
        objetos();
        System.out.println("\n\n4 de Diciembre de 2024");
        claseMath();
        claseRandom();
        claseString();
        claseEnvoltorio();

        System.out.println("\n11 de Diciembre de 2024\n");
        clasesManejoDeFechas();
    }

    //25 de Noviembre de 2024

    private static double sumar2(int a, int b) {
        return 2.0D;
    }

    private static void presentar(int edad, String nombre) {
        System.out.println(nombre + "tiene" + edad + "años");
    }

    private static void metodo() {
        int b = 10;
        for (int i = 0; i <= b; i++) {
            System.out.println(i * b);
        }
    }

    //28 de noviembre de 2024

    /**
     *
     * @param n
     * @return Devuelve el factorial del número n. factorial(n) = n * (n-1) * (n-2) * ... * 2 * 1
     */
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }

        //return factorial(n);   //Si solo hubiera esta llamada habría un error llamado StackOveflowError
    }

    //2 de Diciembre de 2024
    public static void objetos(){
        int valor = Math.abs(10);
        System.out.println(valor);

        Point puntoOrigen = new Point(5, 10);
        System.out.println(puntoOrigen.x);
        int ejeX = puntoOrigen.x;
    }

    //4 de Diciembre de 2024
    //La Clase Math

    public static void claseMath(){
        double r= 2;
        double longitudCircunferencia = 2*PI*r;
        System.out.println("\nClase Math\n"+longitudCircunferencia);
    }

    //La Clase Random
    public static void claseRandom(){
        System.out.println("\nClase Random");
        Random aleatorio = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(aleatorio.nextInt());
        }
        System.out.println("\nDos constructores Random distintos generan el mismo número si tienen la misma semilla");
        Random aleatorio1 = new Random(123);
        Random aleatorio2 = new Random(123);

        for (int i = 0; i < 5; i++){
            System.out.println(aleatorio1.nextInt() +"\t"+aleatorio2.nextInt());
        }

        String texto = "data";
        System.out.println(texto.charAt(texto.length()-1));
    }

    //05 de Diciembre de 2024
    //La Clase String
    public static void claseString(){
        System.out.println();
        String cadena = "String de Ejemplo";
        System.out.println(cadena);

        String cadena1 = "programación";
        String cadena2 = "programación";

        if (cadena1 == cadena2){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }


        String cadena3 = new String("programación");
        String cadena4 = new String("ProgramacióN");
        System.out.println("Al comparar dos Strings creados mediante 'new' aun teniendo el mismo contenido serán distintos a nivel de espacio de memoria");
        if (cadena3 == cadena4){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        System.out.println("\nPara comparar dos Strings utilizaríamos el método .equals()");
        if(cadena3.equals(cadena4)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
        System.out.println("\n Para compararlos ignorando la altura de caja de la letra utilizaremos el método .equalsIgnoreCase()");

        if(cadena3.equalsIgnoreCase(cadena4)){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        String cadena5 = "        hola " + "profe       ";
        String cadena6 = "        hola ";
        String cadena7 = "profe       ";

        System.out.println("\nCon el método .trim() eliminaremos los espacios en blanco al inicio y al final de la cadena");
        System.out.println(cadena5);
        System.out.println(cadena5.trim());
        System.out.println(cadena6.trim()+cadena7.trim());
        System.out.println((cadena6+cadena7).trim());

        //Concatenar Strings

        //String Buffer
    }

    private static void claseEnvoltorio(){
        //Clases envoltorio

        //deprecated quiere decir que está obsoleto y puede que en nuevas versiones se eliminen
        //Integer i = new Integer(5); Esta forma está deprecada

        Integer i = 5;
        int x = 5;

        int aa = Integer.parseInt("5");
        String.valueOf(i);
        //ignoraremos de momento la diapositiva 159

        Boolean b = new Boolean(false);
        System.out.println("b = "+b);
        Boolean b2 = false;
        System.out.println("b2 = "+b2);
        Boolean c = new Boolean("TrUe");
        System.out.println("c = "+c);
        //Boolean c2 = "TrUe";

        Boolean d = new Boolean("No");
        System.out.println("d = "+d);

        String s = "5";
        System.out.println("s = "+s);
        int i2 = Integer.parseInt(s);
        System.out.println("i2 = "+i);

        Integer j = new Integer(5);
        System.out.println("j = "+j);
        s = j.toString();
        System.out.println("s = "+s);

        float f = j.floatValue();
        System.out.println("f = "+f);

        //Procuraremos utilizar la versión no deprecada

        //valueOf es un modo de construir una clase envoltorio.
        //El segundo parámetro es opcional e indica la base.
        Integer binario = Integer.valueOf("1010", 2);

        //Las clases envoltorio nos permiten coger tipos primitivos, tratarlos como objetos y añadirles nuevas funcionalidades
        //En las clases envoltorio tendremos la opción NULL
        //En la clase Boolean tenemos 3 posibilidades: True, False o NULL


    }
    // 11 de Diciembre de 2024
    private static void clasesManejoDeFechas(){

        //Método now()
        System.out.println("Fecha actual " + LocalDate.now());
        System.out.println("Hora actual " + LocalTime.now());
        System.out.println("Fecha y Hora actual " + LocalDateTime.now());   //Utiliza la hora y fecha del dispositivo
        System.out.println("El instante actual es: " + Instant.now());      //Almacenado en formato de UNIX
        System.out.println("En zona horaria son: " + ZonedDateTime.now());  //Fecha + Hora + Meridiano

        //Método of()
        System.out.println("Fecha Cumple " + LocalDate.of(1970, 1, 1));
        System.out.println("Fecha Cumple " + LocalDate.of(1970, Month.JANUARY, 1));

        LocalDate fecha = LocalDate.now();
        Month mes = fecha.getMonth();
        System.out.println(fecha.getMonth());
        System.out.println(fecha.getDayOfMonth());
        String nombreMes = mes.getDisplayName(TextStyle.NARROW,
                            Locale.forLanguageTag("es-ES"));
        String nombreMes2 = mes.getDisplayName(TextStyle.FULL,
                            Locale.forLanguageTag("es-ES"));
        System.out.println(nombreMes);
        System.out.println(nombreMes2);

        //12 de Diciembre de 2024

        System.out.println("\n12 de Diciembre de 2024\n");

        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        System.out.println(hoy.plusDays(10) + "\tSumamos un positivo con plusDays");
        System.out.println(hoy.minusDays(10) + "\tRestamos un positivo con minusDays");
        System.out.println(hoy.plusDays(-10) + "\t\"Sumamos\" un negativo con plusDays");

        LocalDate futuro = hoy.plusDays(10);

        System.out.println("\nClase TemporalAdjusters\n");

        System.out.println(hoy.with(TemporalAdjusters.firstDayOfMonth())+ "\tVer el primer día del mes en el que estamos hoy");
        System.out.println(hoy.with(TemporalAdjusters.lastDayOfMonth())+ "\tVer el último día del mes en el que estamos hoy");
        System.out.println(hoy.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek()+ "\t\tVer el día de la semana del primer día del mes en el que estamos hoy");
        System.out.println(hoy.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek()+ "\t\tVer el día de la semana del último día del mes en el que estamos hoy");

        System.out.println(ChronoUnit.DAYS.between(hoy, futuro) + "\t\t\tVemos la cantidad de días entre el día de hoy y dentro de 10 días");

        LocalDate fechaNac = LocalDate.of(1997, 6, 14);
        System.out.println(ChronoUnit.YEARS.between(fechaNac, hoy)+"\t\t\tVemos los años que hay entre la fecha de nacimiento y la fecha de hoy");
        System.out.println("\nClase Period\n");
        LocalDate finAno = hoy.with(TemporalAdjusters.lastDayOfYear());
        Period hastaFinAno = hoy.until(finAno);
        System.out.println(hastaFinAno+"\t\t\tPeriod muestra el Periodo entre dos fechas");

        System.out.println("Meses : " + hastaFinAno.getMonths() + "\t\tCon .getMonths() muestra los meses en el periodo");
        System.out.println("Dias : " + hastaFinAno.getDays() + "\t\tCon .getDays() muestra los días en el periodo");

        LocalDateTime hoyConHora = LocalDateTime.now();
        LocalDateTime finAnoConHora = LocalDateTime.of(2024, 12, 31, 23, 59);
        Duration diferencia = Duration.between(hoyConHora, finAnoConHora);
        System.out.println(diferencia);
        System.out.println(diferencia.toDays());

        //13 de Diciembre de 2024

        System.out.println("\n13 de Diciembre de 2024\n");

        System.out.println("Parseo de Fechas con .parse()");

        LocalDate fechaParseada = LocalDate.parse("2021-07-06");
        System.out.println(fechaParseada); //Aplica a una cadena de texto las modificaciones necesarias para poder ser interpretado como una fecha
        LocalDate seisNov = LocalDate.parse("6/11/2020",
                DateTimeFormatter.ofPattern("d/M/yyyy"));
        System.out.println(seisNov);

        System.out.println("\nFormateo de Fechas con DateTimeFormatter\n");
        LocalDateTime fechaConHora = LocalDateTime.now();
        System.out.println("Formato por defecto\t\t" + fechaConHora);
        System.out.println("Formato estandar ISO\t" + fechaConHora.format(DateTimeFormatter.ISO_DATE_TIME));
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss");
        //System.out.println("Formato Español\t\t"+ esDateFormat);
        System.out.println("Formato Español\t\t\t"+ fechaConHora.format(esDateFormat));
        System.out.println(fechaConHora.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE, d 'de' MMMM 'de 'YYYY ")));
        /*
        * El .ofPattern() deberá ir entero entre comillas dobles como una cadena de texto
        * Esta cadena tendrá cadenas y símbolos, las cadenas irán entre comillas simples*/
        System.out.println(fechaConHora.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE, d 'de' MMMM 'de 'YYYY ").withLocale(new Locale("en", "US"))));   //Foramteo de fecha con el idioma especificado
        String idiomaLocal = System.getProperty("user.language");
        String paisLocal = System.getProperty("user.country");
        System.out.println(fechaConHora.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .withLocale(new Locale(idiomaLocal, paisLocal))
        ));


    }
}

