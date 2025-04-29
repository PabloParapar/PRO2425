package Ejercicio2;

import static Ejercicio2.Utilidades.formatearNombre;

public class EdificioPublico {
    private String id;
    private String nombre;
    private String direccion;
    private Integer annoFundacion;

    public EdificioPublico() {
    }

    public EdificioPublico(String id, String nombre, String direccion, Integer annoFundacion) {
        this.id = id;
        this.nombre = formatearNombre(nombre);
        this.direccion = direccion;
        this.annoFundacion = annoFundacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = formatearNombre(nombre);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getAnnoFundacion() {
        return annoFundacion;
    }

    public void setAnnoFundacion(Integer annoFundacion) {
        this.annoFundacion = annoFundacion;
    }
}
