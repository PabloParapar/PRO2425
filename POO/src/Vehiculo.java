public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private Double precio;
    private Motor motor;
    private Propietario propietario;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, String matricula, double precio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String mostrarInformacion() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", precio=" + precio +
                ", motor=" + motor.toString() +
                '}';
    }
}
