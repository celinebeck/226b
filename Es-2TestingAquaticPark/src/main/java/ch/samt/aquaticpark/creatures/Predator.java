package ch.samt.aquaticpark.creatures;

public abstract class Predator extends AquaticCreature {
    protected double ferocity; // Livello di ferocia (0-100)

    public Predator(String name, int age, double energy, double speed, double ferocity) {
        super(name, age, energy, speed);
        this.ferocity = ferocity;
    }

    public double getFerocity() { return ferocity; }
    public abstract boolean hunt();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Predator predator)) return false;
        if (!super.equals(o)) return false;

        return Double.compare(ferocity, predator.ferocity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(ferocity);
        return result;
    }
}
