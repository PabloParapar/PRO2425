package src.ud5;

/**
 * @author lopparpab
 */
public class Perro extends Animal{
    @Override
    public void mueve(){
        System.out.println("Perro corriendo");
    }

    public void salta(){
        System.out.println("Perro saltando");
    }
}
