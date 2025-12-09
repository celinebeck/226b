package ch.samt.aquaticpark.creatures;

public interface MarineCreature {
    String getName();
    int getAge();
    double getEnergy();
    void eat();
    String makeSound();
    void move();

    // default method per verificare se la creatura è viva
    default boolean isAlive() {
        return getEnergy() > 0;
    }
}
