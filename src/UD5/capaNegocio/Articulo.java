package src.UD5.capaNegocio;

public class Articulo {
    private String descripcion;
    private Double precio;
    private Integer iva;

    public Articulo(String descripcion, Double precio, Integer iva) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }
    public Double getPrecioIva() {
        return precio * iva / 100;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                '}';
    }
}
