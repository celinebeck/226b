import main.fourwheels.Auto;
import main.fourwheels.Camion;
import main.interfaces.Assicurabile;
import main.interfaces.Riparabile;
import main.service.AgenziaAssicurativa;
import main.service.Officina;
import main.twowheels.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Camion camion = new Camion();
        Auto miaAuto = new Auto();
        Moto miaMoto = new Moto();
        Officina miaOfficina = new Officina();
        AgenziaAssicurativa miaAssicurativa = new AgenziaAssicurativa();
        Riparabile rip;
        Assicurabile ass;
        miaOfficina.accettaVeicolo(miaAuto);
        miaOfficina.accettaVeicolo(miaMoto);
        miaAssicurativa.aggiungiVeicolo(miaMoto);
        System.out.println(miaAuto.calcolaCostoRiparazione(2));
        System.out.println(miaMoto.getCostoAssicurazione());
        miaOfficina.stampaSchedarioRiparazioni();
        miaAssicurativa.calcolaIncassoTotale();
        moto.faiRumore();
        camion.faiRumore();
        }
    }
