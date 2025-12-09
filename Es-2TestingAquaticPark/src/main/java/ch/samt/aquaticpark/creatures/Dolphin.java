package ch.samt.aquaticpark.creatures;

import java.util.Objects;

/**
 * Classe per delfini - predatori intelligenti
 */
public class Dolphin extends Predator {
    private int intelligence; // Livello di intelligenza (0-100)

    public Dolphin(String name, int age, double energy, double speed, double ferocity, int intelligence) {
        super(name, age, energy, speed, ferocity);
        this.intelligence = intelligence;
    }

    @Override
    public boolean hunt() {
        double randomNumb = Math.random(); // 0 ≤ n ≤ 1
        boolean huntSuccess = randomNumb * this.energy * this.ferocity * this.speed * this.ferocity * this.intelligence / 100000 > 80;
        if (huntSuccess) {
            System.out.println("Preda catturata");
            eat();
            return true;
        }
        System.out.println("Caccia fallita, la preda è sfuggita, nuovo livello di energia: " + energy);
        this.energy -=3;
        return false;
    }

    @Override
    public String makeSound() {
        return "Eee-eee-eee (click di delfino)";
    }


    public void play() {
        // Comportamento unico dei delfini - giocare
        if (energy > 15) {
            this.energy -= 5;
            System.out.println(name + " gioca e fa acrobazie!");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dolphin dolphin)) return false;
        if (!super.equals(o)) return false;

        return intelligence == dolphin.intelligence;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + intelligence;
        return result;
    }
}
