package src.ud5;

/**
 * @author lopparpab
 */
public class Rectangulo extends FiguraGeometrica{
    private final double base, altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @return Calcula el área de una instancia Rectángulo en función de sus atributos base y altura
     */
    @Override
    public double getArea() {
        return base * altura;
    }
}
