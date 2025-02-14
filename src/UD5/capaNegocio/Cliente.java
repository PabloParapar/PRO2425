package src.UD5.capaNegocio;

public class Cliente {
    private String nombre;
    private Integer dni;
    private String nif;
    private Factura factura;    //Sería una lista

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNif() {
        String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
        return String.valueOf(dni)+ letras.charAt(dni%23);
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Cliente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
        nif = getNif();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", nif='" + nif + '\'' +
                ", factura=" + factura +
                '}';
    }


}
