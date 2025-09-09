package main.fourwheels;

import main.Veicolo;

import java.util.Objects;

public class Camion extends Veicolo {
    private int capacitacarico;

    public int getCapacitacarico() {
        return capacitacarico;
    }

    public void setCapacitacarico(int capacitacarico) {
        this.capacitacarico = capacitacarico;
    }
    public void faiRumore(){

    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return capacitacarico == camion.capacitacarico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacitacarico);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacitacarico=" + capacitacarico +
                '}';
    }
}
