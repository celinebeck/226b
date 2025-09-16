package main.twowheels;
import main.Veicolo;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import java.util.Objects;

public final class Moto extends Veicolo implements Assicurabile, Riparabile {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getCostoAssicurazione(){
        return 250;
    }

    public double calcolaCostoRiparazione(int oreLavoro){
        return (oreLavoro * 45.0) + 100;
    }

    @Override
    public void faiRumore(){
        System.out.println("stustustu");
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(tipo, moto.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
