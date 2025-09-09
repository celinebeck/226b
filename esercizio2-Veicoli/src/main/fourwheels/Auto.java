package main.fourwheels;
import main.Veicolo;
import main.interfaces.Riparabile;

import java.util.Objects;

public class Auto extends Veicolo implements Riparabile {
    private int numeroPorte;

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    public double calcolaCostoRiparazione(int oreLavoro){
        return (oreLavoro * 45.0) + 100;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return numeroPorte == auto.numeroPorte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroPorte);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numeroPorte=" + numeroPorte +
                '}';
    }
}

