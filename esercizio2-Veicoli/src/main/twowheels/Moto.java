package main.twowheels;
import main.Veicolo;
import main.interfaces.Assicurabile;
import java.util.Objects;

public final class Moto extends Veicolo implements Assicurabile {
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
