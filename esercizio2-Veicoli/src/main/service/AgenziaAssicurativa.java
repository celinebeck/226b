package main.service;
import main.interfaces.Assicurabile;
import java.util.HashSet;
import java.util.Set;

public class AgenziaAssicurativa {
    private Set<Assicurabile> veicoliAssicurati = new HashSet<>();

    public void aggiungiVeicolo(Assicurabile veicolo){
        veicoliAssicurati.add(veicolo);
    }

    public double calcolaIncassoTotale(){
        int totVeicoli=  veicoliAssicurati.size();
        return totVeicoli*250;
    }
}
