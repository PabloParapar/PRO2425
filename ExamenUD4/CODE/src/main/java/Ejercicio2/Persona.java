package Ejercicio2;

import java.time.LocalDate;

import static Ejercicio2.Utilidades.formatearNombre;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private LocalDate fechaNacimiento;

    public Persona(){

    }

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = formatearNombre(nombre);
        this.apellido1 = formatearNombre(apellido1);
        this.apellido2 = formatearNombre(apellido2);
    }

    public Integer calcularEdad(){
        LocalDate fechaNacimiento = this.fechaNacimiento;
        LocalDate hoy = LocalDate.now();
        int annos;
        if (hoy.getDayOfYear() < fechaNacimiento.getDayOfYear()){
            annos = (hoy.getYear() - fechaNacimiento.getYear()) -1;
        } else{
            annos = hoy.getYear() - fechaNacimiento.getYear();
        }

        return annos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = formatearNombre(nombre);
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = formatearNombre(apellido1);
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = formatearNombre(apellido2);
    }

    public Integer getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
