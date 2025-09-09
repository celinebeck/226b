package main;

import java.util.Objects;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int numeroposti;

    public int getNumeroposti() {
        return numeroposti;
    }

    public void setNumeroposti(int numeroposti) {
        this.numeroposti = numeroposti;
    }

    public String getModello() {
        return modello;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veicolo veicolo = (Veicolo) o;
        return numeroposti == veicolo.numeroposti && Objects.equals(targa, veicolo.targa) && Objects.equals(marca, veicolo.marca) && Objects.equals(modello, veicolo.modello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targa, marca, modello, numeroposti);
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", numeroposti=" + numeroposti +
                '}';
    }
}
