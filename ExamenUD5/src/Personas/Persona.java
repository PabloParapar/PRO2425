package Personas;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String nif;
    protected int annoNacimiento;
    protected int annoDefuncion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String nif, int annoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.annoNacimiento = annoNacimiento;
    }

    public Persona(String nombre, String apellido, String nif, int annoNacimiento, int annoDefuncion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.annoNacimiento = annoNacimiento;
        this.annoDefuncion = annoDefuncion;
    }

    public String getNombre() {
        if (this == null){
        return "null";
        } else {
            return nombre;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void setAnnoNacimiento(int annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public int getAnnoDefuncion() {
        return annoDefuncion;
    }

    public void setAnnoDefuncion(int annoDefuncion) {
        this.annoDefuncion = annoDefuncion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", annoNacimiento=" + annoNacimiento +
                ", annoDefuncion=" + annoDefuncion +
                '}';
    }
}
