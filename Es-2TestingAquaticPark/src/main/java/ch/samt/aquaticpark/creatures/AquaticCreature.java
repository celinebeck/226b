package ch.samt.aquaticpark.creatures;

public abstract class AquaticCreature implements MarineCreature {
    protected String name;
    protected int age;
    protected double energy;
    protected double speed;
    protected boolean isHungry;

    public AquaticCreature(String name, int age, double energy, double speed) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.speed = speed;
        this.isHungry = true;
    }

    // Implementazioni dell'interfaccia
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getEnergy() {
        return energy;
    }


    // Metodo concreto per movimento
    public void move() {
        if (energy > 0) {
            this.energy -= 2;
            System.out.println(name + " si muove nell'acqua");
        }
        if (energy <= 0) {
            System.out.println(name + " è morto");
        }
    }

    @Override
    public void eat() {
        energy +=25;
        System.out.println(name + " si è appena nutrito. Nuovo livello di energia: " + energy);
    }

    @Override
    public String toString() {
        return String.format("%s [Età: %d, Energia: %.1f, Velocità: %.1f]",
                name, age, energy, speed);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AquaticCreature that)) return false;

        return age == that.age && Double.compare(energy, that.energy) == 0 && Double.compare(speed, that.speed) == 0 && isHungry == that.isHungry && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + Double.hashCode(energy);
        result = 31 * result + Double.hashCode(speed);
        result = 31 * result + Boolean.hashCode(isHungry);
        return result;
    }
}