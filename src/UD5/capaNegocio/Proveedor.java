package src.UD5.capaNegocio;

public class Proveedor {
    private String nombre;
    private String nif;
    private String direccion;
    private int telefono;
    Articulo articulo; //sería una lista

    public Proveedor() {
    }

    public Proveedor(String nombre, String nif, String direccion, int telefono) {
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
        if (articulo.getProveedor() != this) {
            articulo.setProveedor(this);
        }
    }

    public Articulo getArticulo() {
        return articulo;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                //", articulo=" + articulo +
                '}';
    }
}
