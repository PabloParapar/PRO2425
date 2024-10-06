package UD1.Angulos.grados;

public class Grados {
    public static void main(String[] args) {
        /* CÓDIGO INICIAL
        int radianes = 86.7;
        int suma;
        final double PI = 3.1416;
        final byte grados = 360;
        System.out.println(“Grados: +“ grados);
        Grados = 180;
        System.in.println(radianes);
        suma++;
         */
        float radianes = 86.7F; // Para definir un real en coma flotante no se usa "int", se usan "float" o "double"
        int suma = 1;
        final double PI = 3.1416;
        short grados = 360; // byte es demasiado pequeño para almacenar el valor 360, puede utilizarse "short" o "int". Se está declarando como una variable pero más adelante se le quiere reasignar el valor, por lo que lo declararemos como una variable.
        System.out.println("Grados: "+ grados); //La doble comilla no debe contiener al signo + que concatena el "string" con el valor de la variable "grados"
        grados = 180; // Se declaró grados en minúsculas y se está utilizando con la primera en mayúsculas.
        System.out.println("Radianes: "+ radianes); //Replicaremos la estructura para devolver en la consola el valor de "grados"
        suma++; //Se pretende incrementar en 1 el valor de la variable "suma" pero no se le ha asignado un valor inicial.

    }
}
