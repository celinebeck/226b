package ch.samt.aquaticpark.ecosystem;

import ch.samt.aquaticpark.creatures.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe per gestire l'ecosistema marino usando lambda expressions e stream
 */
public class EcosystemManager {
    private List<MarineCreature> creatures;

    public EcosystemManager() {
        this.creatures = new ArrayList<>();
    }

    public void addCreature(MarineCreature creature) {
        creatures.add(creature);
    }

    public List<MarineCreature> getCreatures() {
        return new ArrayList<>(creatures);
    }

    // Filtra le creature per livello di energia usando Lambda
    public List<MarineCreature> filterByEnergy(double threshold) {
        return creatures.stream()
                .filter(creature -> creature.getEnergy() >= threshold) // Lambda expression
                .collect(Collectors.toList());
    }


    // Ottieni i nomi delle creature più adulte di una data soglia
    public List<String> getAdultCreaturesNames(int adultAge) {
        return creatures.stream()
                .filter(creature -> creature.getAge() >= adultAge)
                .map(MarineCreature::getName) // Method reference
                .collect(Collectors.toList());
    }


    // Trova i predatori più pericolosi (alta energia e ferocia)
    public List<String> findMostDangerousPredators() {
        return creatures.stream()
                .filter(creature -> creature instanceof Predator)
                .map(creature -> (Predator) creature)
                .filter(predator -> predator.getEnergy() > 50 && predator.getFerocity() > 70)
                .sorted((p1, p2) -> Double.compare(p2.getFerocity(), p1.getFerocity())) // Lambda per comparazione
                .map(Predator::getName)
                .collect(Collectors.toList());
    }


    // Chiama tutti i metodi polimorfici di un predatore
    public void callAllPredatorsPolimorphicMethods(Predator predator) {
        System.out.println(predator.makeSound());
        System.out.println(predator.hunt());
        System.out.println();
    }

    // Chiama tutti i metodi ereditati di un predatore
    public void callAllPredatorsInheritedMethods(Predator predator) {
        predator.eat();
        System.out.println(predator.getName());
        System.out.println(predator.getAge());
        System.out.println(predator.getEnergy());
        System.out.println(predator.isAlive());
        System.out.println();
    }

}
