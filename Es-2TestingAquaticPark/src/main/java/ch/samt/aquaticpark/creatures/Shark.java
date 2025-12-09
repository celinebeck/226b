package ch.samt.aquaticpark.creatures;

/**
 * Classe per squali - predatori aggressivi
 */
public class Shark extends Predator {

    public Shark(String name, int age, double energy, double speed, double ferocity) {
        super(name, age, energy, speed, ferocity);
    }

    @Override
    public boolean hunt() {
        double randomNumb = 1 + (Math.random() * 4); // 1 ≤ n ≤ 3
        double v = randomNumb * this.energy * this.speed * this.ferocity / 10000;
        boolean huntSuccess = v > 70;
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
        return "Dun-dun... dun-dun... (musica di squalo)";
    }


}
