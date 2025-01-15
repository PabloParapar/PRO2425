package src.UD5;

import java.security.InvalidParameterException;
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private String nif;
    private Date fechaNacimiento;
    private String direccionPostal;
    private String email;
    private Integer telefono;
    private String grupoSanguineo;
    private Sexo sexo;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        nombre = nombre.trim();
        if (nombre.length() <= 10 && !nombre.isEmpty()){
            this.nombre=nombre; //this palabra reservada para referirnos al objeto en el que nos encontramos
        } else {
            throw new InvalidParameterException("El nombre no debe superar los 10 caracteres.");
        }
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getDni(){
        return dni;
    }
    public void setDni(Integer dni) {
        String letras = "TRWAGMYFPDXDNJZSQVHLCKE";
        this.dni = dni;
        nif = String.valueOf(dni)+letras.charAt(dni%23);
    }

    public String getNif() {
        return nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccionPostal(){
        return direccionPostal;
    }
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Persona (){
        //Método Constructor Vacío
    }

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona (String nombre, String apellido, Integer edad, Integer dni, Date fechaNacimiento, String direccionPostal, String email, Integer telefono, String grupoSanguineo, Sexo sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionPostal = direccionPostal;
        this.email = email;
        this.telefono = telefono;
        this.grupoSanguineo = grupoSanguineo;
        this.sexo = sexo;
    }
}
