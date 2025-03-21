package src.ud5;

/**
 * @author lopparpab
 */
public class Circulo extends FiguraGeometrica{
    private final double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    /**
     *
     * @return Calcula el área de una instancia Círculo según su atributo radio
     */
    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
