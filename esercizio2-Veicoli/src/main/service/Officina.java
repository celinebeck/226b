package main.service;
import main.Veicolo;
import main.interfaces.Riparabile;
import java.util.ArrayList;
import java.util.List;

public class Officina {
    private List<Riparabile> veicoliInRiparazione = new ArrayList<>();
    public void accettaVeicolo(Riparabile veicolo){
        veicoliInRiparazione.add(veicolo);
    }
    public void stampaSchedarioRiparazioni(){
        for (Riparabile veicolo : veicoliInRiparazione) {
            System.out.println(veicolo);
        }
    }
}
