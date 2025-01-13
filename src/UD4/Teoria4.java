package src.UD4;

public class Teoria4 {
    public static void main(String[] args) {
        System.out.println(Semaforo.AMBAR);
        System.out.println(Semaforo.AMBAR.ordinal());
        System.out.println(Semaforo.AMBAR.ordinal()+1);

        Semaforo color = Semaforo.ROJO;
        System.out.println("El color del Semáforo es "+color);
        switch (color){
            case ROJO:
                color = Semaforo.VERDE;
                break;
            case AMBAR:
                color = Semaforo.ROJO;
            case VERDE:
                color = Semaforo.AMBAR;

        }
        System.out.println("El Semáforo ha pasado a "+color);

        Numero n = Numero.DOS;
        System.out.println(n.getValue());

        Comida comida = Comida.PlatoPrincipal.BACALAO;
        comida = Comida.Postre.HELADO;
    }
}
