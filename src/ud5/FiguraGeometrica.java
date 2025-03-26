package src.ud5;

/**
 * @author lopparpab
 */
public abstract class FiguraGeometrica {
    private final String nombre;
    abstract public double getArea();

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param figura
     * @return Devuelve un booleano conforme si el área de la primera figura es mayor que la segunda figura
     */
    public boolean mayorQue(FiguraGeometrica figura) {
        return this.getArea() > figura.getArea();
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
