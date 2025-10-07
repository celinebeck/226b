package ch.samt.talentshow;

import ch.samt.talentshow.enumerator.Level;
import ch.samt.talentshow.model.Dancer;
import ch.samt.talentshow.model.Magician;
import ch.samt.talentshow.model.Singer;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singer s = new Singer("Anna", 22, Level.PROFESSIONAL, "O mia bela Madunina");
        Dancer d = new Dancer("Leo", 19, Level.INTERMEDIATE, "Schiaccianoci");
        Magician m = new Magician("Charlie", 25, Level.BEGINNER, "sparire il coniglio nel cilindro");
        Singer s2 = new Singer("Diana", 30, Level.INTERMEDIATE, "O mia bela Madunina");
        Dancer d2 = new Dancer("Marco", 21, Level.PROFESSIONAL, "Schiaccianoci");
        HashSet<Show> show = new HashSet<>();
        show.add(s);
        show.add(d);
        show.add(m);
        show.add(s2);
        show.add(d2);

        //polimorfismo dei metodi descriptionShow e di finalVote
        for(Show shows : show){
            shows.descriptionShow();
        }
        //le classi Dancer, Singer e Magician ereditano da Person
    }
}