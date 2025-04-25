package src.ud4.Boletin4.EstructurasDeDatosDeTipoColeccion.Clases47;

public class Pais implements Comparable<Pais> {
    private String nombrePais;
    private int oro;
    private int plata;
    private int bronce;

    public Pais() {

    }

    public Pais(String nombrePais, int oro, int plata, int bronce) {
        this.nombrePais = nombrePais;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    @Override
    public int compareTo(Pais o) {
        if (this.oro != o.oro) {
            return Integer.compare(o.oro, this.oro);
        } else if (this.plata != o.plata) {
            return Integer.compare(o.plata, this.plata);
        } else if (this.bronce != o.bronce) {
            return Integer.compare(o.bronce, this.bronce);
        } else {
            return this.nombrePais.compareToIgnoreCase(o.nombrePais);
        }
    }
}
