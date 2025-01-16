package src.UD5;

import java.util.Date;

public class Coche {
    //Atributios Básicos
    private String marca;
    private String modelo;
    private Integer anno;
    private Double precio;
    private String color;
    private String matricula;
    private Integer numeroDePuertas;
    //Atributos Técnicos
    private String tipoDeMotor;
    private Double cilindrada;
    private Integer potencia;
    private Double consumo;
    private String transmision;
    private String traccion;
    private Double capacidadDeposito;
    private Integer autonomia;
    //Dimensiones y Peso
    private Double longitud;
    private Double anchura;
    private Double altura;
    private Integer peso;
    private Integer capacidadMaletero;
    //Características Adicionales
    private Integer airbags;
    private String climatizacion;
    private String sistemaDeSonido;
    private Boolean pantallaTactil;
    private Boolean navegadorGPS;
    private Boolean camaraTrasera;
    private Boolean asistenciaDeAparcamiento;
    private Boolean sensoresDeProximidad;
    private Boolean farosLED;
    private Boolean techoSolar;
    private Boolean controlDeCrucero;
    private Boolean asientosCalefactables;
    //Atributos Relacionados con la Seguridad
    private Boolean sistemaAntibloqueo;
    private Boolean controlDeEstabilidad;
    private Boolean detectorDeColision;
    private Boolean asistenciaDeCarril;
    private Boolean frenadoAutonomo;
    //Atributos Relacionados con el Mantenimiento
    private Integer kilometraje;
    private Date ultimaRevision;
    private Double nivelAceite;
    private String estadoDeNeumaticos;
    private Integer numeroDeDuennosAnteriores;
    //Atributos Relacionados con la Personalización
    private String tipoDeLlanta;
    private Boolean pegatinas;
    private Boolean alarmaPersonalizada;
    private String modificaciones;
    //Atributos Relacionados con Coches Eléctricos
    private Integer capacidadBateria;
    private Double tiempoDeCarga;
    private String tipoDeConector;
    private Boolean modoEcologico;

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

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(Integer numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
    //Getters Setters Atributos Tecnicos

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(Double capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }
    //Getters y Setters Dimensiones y Peso

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getAnchura() {
        return anchura;
    }

    public void setAnchura(Double anchura) {
        this.anchura = anchura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(Integer capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    //Getters y Setters Caracteristicas adicionales

    public Integer getAirbags() {
        return airbags;
    }

    public void setAirbags(Integer airbags) {
        this.airbags = airbags;
    }

    public String getClimatizacion() {
        return climatizacion;
    }

    public void setClimatizacion(String climatizacion) {
        this.climatizacion = climatizacion;
    }

    public String getSistemaDeSonido() {
        return sistemaDeSonido;
    }

    public void setSistemaDeSonido(String sistemaDeSonido) {
        this.sistemaDeSonido = sistemaDeSonido;
    }

    public Boolean getPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(Boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    public Boolean getNavegadorGPS() {
        return navegadorGPS;
    }

    public void setNavegadorGPS(Boolean navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Boolean getCamaraTrasera() {
        return camaraTrasera;
    }

    public void setCamaraTrasera(Boolean camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }

    public Boolean getAsistenciaDeAparcamiento() {
        return asistenciaDeAparcamiento;
    }

    public void setAsistenciaDeAparcamiento(Boolean asistenciaDeAparcamiento) {
        this.asistenciaDeAparcamiento = asistenciaDeAparcamiento;
    }

    public Boolean getSensoresDeProximidad() {
        return sensoresDeProximidad;
    }

    public void setSensoresDeProximidad(Boolean sensoresDeProximidad) {
        this.sensoresDeProximidad = sensoresDeProximidad;
    }

    public Boolean getFarosLED() {
        return farosLED;
    }

    public void setFarosLED(Boolean farosLED) {
        this.farosLED = farosLED;
    }

    public Boolean getTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(Boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public Boolean getControlDeCrucero() {
        return controlDeCrucero;
    }

    public void setControlDeCrucero(Boolean controlDeCrucero) {
        this.controlDeCrucero = controlDeCrucero;
    }

    public Boolean getAsientosCalefactables() {
        return asientosCalefactables;
    }

    public void setAsientosCalefactables(Boolean asientosCalefactables) {
        this.asientosCalefactables = asientosCalefactables;
    }
    //Getters y Setters Seguridad

    public Boolean getSistemaAntibloqueo() {
        return sistemaAntibloqueo;
    }

    public void setSistemaAntibloqueo(Boolean sistemaAntibloqueo) {
        this.sistemaAntibloqueo = sistemaAntibloqueo;
    }

    public Boolean getControlDeEstabilidad() {
        return controlDeEstabilidad;
    }

    public void setControlDeEstabilidad(Boolean controlDeEstabilidad) {
        this.controlDeEstabilidad = controlDeEstabilidad;
    }

    public Boolean getDetectorDeColision() {
        return detectorDeColision;
    }

    public void setDetectorDeColision(Boolean detectorDeColision) {
        this.detectorDeColision = detectorDeColision;
    }

    public Boolean getAsistenciaDeCarril() {
        return asistenciaDeCarril;
    }

    public void setAsistenciaDeCarril(Boolean asistenciaDeCarril) {
        this.asistenciaDeCarril = asistenciaDeCarril;
    }

    public Boolean getFrenadoAutonomo() {
        return frenadoAutonomo;
    }

    public void setFrenadoAutonomo(Boolean frenadoAutonomo) {
        this.frenadoAutonomo = frenadoAutonomo;
    }
    //Getters y Setters Mantenimiento

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Date getUltimaRevision() {
        return ultimaRevision;
    }

    public void setUltimaRevision(Date ultimaRevision) {
        this.ultimaRevision = ultimaRevision;
    }

    public Double getNivelAceite() {
        return nivelAceite;
    }

    public void setNivelAceite(Double nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public String getEstadoDeNeumaticos() {
        return estadoDeNeumaticos;
    }

    public void setEstadoDeNeumaticos(String estadoDeNeumaticos) {
        this.estadoDeNeumaticos = estadoDeNeumaticos;
    }

    public Integer getNumeroDeDuennosAnteriores() {
        return numeroDeDuennosAnteriores;
    }

    public void setNumeroDeDuennosAnteriores(Integer numeroDeDuennosAnteriores) {
        this.numeroDeDuennosAnteriores = numeroDeDuennosAnteriores;
    }
    //Getters y Setters Personalizacion

    public String getTipoDeLlanta() {
        return tipoDeLlanta;
    }

    public void setTipoDeLlanta(String tipoDeLlanta) {
        this.tipoDeLlanta = tipoDeLlanta;
    }

    public Boolean getPegatinas() {
        return pegatinas;
    }

    public void setPegatinas(Boolean pegatinas) {
        this.pegatinas = pegatinas;
    }

    public Boolean getAlarmaPersonalizada() {
        return alarmaPersonalizada;
    }

    public void setAlarmaPersonalizada(Boolean alarmaPersonalizada) {
        this.alarmaPersonalizada = alarmaPersonalizada;
    }

    public String getModificaciones() {
        return modificaciones;
    }

    public void setModificaciones(String modificaciones) {
        this.modificaciones = modificaciones;
    }
    //Getters y Setters Coche Electrico

    public Integer getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(Integer capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public Double getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(Double tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    public String getTipoDeConector() {
        return tipoDeConector;
    }

    public void setTipoDeConector(String tipoDeConector) {
        this.tipoDeConector = tipoDeConector;
    }

    public Boolean getModoEcologico() {
        return modoEcologico;
    }

    public void setModoEcologico(Boolean modoEcologico) {
        this.modoEcologico = modoEcologico;
    }

    //Constructores
    public Coche (){

    }
    public Coche (String marca, String modelo, Integer anno, Double precio, String color, String matricula, Integer numeroDePuertas){
        this.marca = marca;
        this.modelo= modelo;
        this.anno=anno;
        this.precio=precio;
        this.color=color;
        this.matricula=matricula;
        this.numeroDePuertas=numeroDePuertas;
    }
    //Llegué hasta aquí

    public Coche(String tipoDeMotor, Double cilindrada, Integer potencia, Double consumo, String transmision, String traccion, Double capacidadDeposito, Integer autonomia) {
        this.tipoDeMotor = tipoDeMotor;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.consumo = consumo;
        this.transmision = transmision;
        this.traccion = traccion;
        this.capacidadDeposito = capacidadDeposito;
        this.autonomia = autonomia;
    }

    public Coche(Double longitud, Double anchura, Double altura, Integer peso, Integer capacidadMaletero) {
        this.longitud = longitud;
        this.anchura = anchura;
        this.altura = altura;
        this.peso = peso;
        this.capacidadMaletero = capacidadMaletero;
    }

    public Coche(Boolean asientosCalefactables, Boolean controlDeCrucero, Boolean techoSolar, Boolean farosLED, Boolean sensoresDeProximidad, Boolean asistenciaDeAparcamiento, Boolean camaraTrasera, Boolean navegadorGPS, Boolean pantallaTactil, String sistemaDeSonido, String climatizacion, Integer airbags) {
        this.asientosCalefactables = asientosCalefactables;
        this.controlDeCrucero = controlDeCrucero;
        this.techoSolar = techoSolar;
        this.farosLED = farosLED;
        this.sensoresDeProximidad = sensoresDeProximidad;
        this.asistenciaDeAparcamiento = asistenciaDeAparcamiento;
        this.camaraTrasera = camaraTrasera;
        this.navegadorGPS = navegadorGPS;
        this.pantallaTactil = pantallaTactil;
        this.sistemaDeSonido = sistemaDeSonido;
        this.climatizacion = climatizacion;
        this.airbags = airbags;
    }

    public Coche(Boolean sistemaAntibloqueo, Boolean controlDeEstabilidad, Boolean detectorDeColision, Boolean asistenciaDeCarril, Boolean frenadoAutonomo) {
        this.sistemaAntibloqueo = sistemaAntibloqueo;
        this.controlDeEstabilidad = controlDeEstabilidad;
        this.detectorDeColision = detectorDeColision;
        this.asistenciaDeCarril = asistenciaDeCarril;
        this.frenadoAutonomo = frenadoAutonomo;
    }

    public Coche(Integer kilometraje, Date ultimaRevision, Double nivelAceite, String estadoDeNeumaticos, Integer numeroDeDuennosAnteriores) {
        this.kilometraje = kilometraje;
        this.ultimaRevision = ultimaRevision;
        this.nivelAceite = nivelAceite;
        this.estadoDeNeumaticos = estadoDeNeumaticos;
        this.numeroDeDuennosAnteriores = numeroDeDuennosAnteriores;
    }

    public Coche(String tipoDeLlanta, Boolean pegatinas, Boolean alarmaPersonalizada, String modificaciones) {
        this.tipoDeLlanta = tipoDeLlanta;
        this.pegatinas = pegatinas;
        this.alarmaPersonalizada = alarmaPersonalizada;
        this.modificaciones = modificaciones;
    }

    public Coche(Integer capacidadBateria, Double tiempoDeCarga, String tipoDeConector, Boolean modoEcologico) {
        this.capacidadBateria = capacidadBateria;
        this.tiempoDeCarga = tiempoDeCarga;
        this.tipoDeConector = tipoDeConector;
        this.modoEcologico = modoEcologico;
    }
}
