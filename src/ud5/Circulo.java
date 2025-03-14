package src.ud5;

public class Circulo extends FiguraGeometrica{
    private final double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
