package src.UD5.capaNegocio;

public abstract class Articulo {
    private String descripcion;
    private double precio;
    private Integer iva;
    Proveedor proveedor;

    public Articulo(String descripcion, double precio, Integer iva) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }
    public double getPrecioIva() {
        return precio * iva / 100;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                //", proveedor=" + proveedor +
                '}';
    }

    public void imprimir(){

    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
        if(proveedor.getArticulo() != this) {
            proveedor.setArticulo(this);
        }
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}
