package ch.samt.aquaticpark.creatures;

/**
 * Classe per pesci erbivori che si nutrono di alghe
 */
public class HerbivorousFish extends AquaticCreature {

    public HerbivorousFish(String name, int age, double energy, double speed) {
        super(name, age, energy, speed);
    }


    @Override
    public String makeSound() {
        return "Blub blub (pesce erbivoro)";
    }

}
