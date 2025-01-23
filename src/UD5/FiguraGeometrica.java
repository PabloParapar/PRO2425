package src.UD5;

public abstract class FiguraGeometrica {
    private final String nombre;
    abstract public double getArea();

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

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
