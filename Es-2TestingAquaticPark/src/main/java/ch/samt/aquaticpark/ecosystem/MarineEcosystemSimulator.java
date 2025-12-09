package ch.samt.aquaticpark.ecosystem;

import ch.samt.aquaticpark.creatures.Dolphin;
import ch.samt.aquaticpark.creatures.HerbivorousFish;
import ch.samt.aquaticpark.creatures.Jellyfish;
import ch.samt.aquaticpark.creatures.Shark;

/**
 * Classe principale per testare l'ecosistema marino
 */
public class MarineEcosystemSimulator {
    public static void main(String[] args) {
        EcosystemManager manager = new EcosystemManager();

        // Creazione delle creature marine
        HerbivorousFish nemo = new HerbivorousFish("Nemo", 2, 30.0, 25.0);
        Shark jaws = new Shark("Jaws", 8, 50.0, 60.0, 60.0);
        Dolphin flipper = new Dolphin("Flipper", 5, 75.0, 50.0, 60.0, 85);
        manager.addCreature(nemo);
        manager.addCreature(jaws);
        manager.addCreature(flipper);
        manager.addCreature(new HerbivorousFish("Dory", 3, 45.0, 20.0));
        manager.addCreature(new Shark("Finny", 6, 70.0, 35.0, 75.0));
        manager.addCreature(new Dolphin("Echo", 4, 65.0, 45.0, 55.0, 90));
        manager.addCreature(new Jellyfish("Lumina", 1, 35.0, 5.0,  true));
        manager.addCreature(new Jellyfish("Sting", 2, 25.0, 4.0, false));

        System.out.println("=== SIMULATORE ECOSISTEMA MARINO ===\n");

        // Test dei metodi con Lambda e Stream
        System.out.println("**** 1. Creature con energia > 50:");
        manager.filterByEnergy(50).forEach(creature ->
                System.out.println(" - " + creature.getName() + " (" + creature.getEnergy() + ")")
        );


        System.out.println("\n**** 2. Creature con età >= 3:");
        manager.getAdultCreaturesNames(3).forEach(name ->
                System.out.println(" - " + name)
        );

        System.out.println("\n**** 3. Predatori più pericolosi:");
        manager.findMostDangerousPredators().forEach(name ->
                System.out.println(" - " + name)
        );

        // Invoca tutti i metodi polimorfici di un predatore
        System.out.println("\n**** 4. Invoca tutti i metodi polimorfici di un predatore:");
        manager.callAllPredatorsPolimorphicMethods(flipper);

        // Invoca tutti i metodi ereditati di un predatore
        System.out.println("\n**** 5. Invoca tutti i metodi ereditati di un predatore:");
        manager.callAllPredatorsInheritedMethods(flipper);

        // Fai muovere una creatura finché muore
        System.out.println("\n**** 6. Fai muovere una creatura finché non muore:");
        while (nemo.isAlive()) {
            nemo.move();
        }

        // Operazioni specifiche per tipo
        System.out.println("\n**** 7. Comportamenti specifici:");
        manager.getCreatures().forEach(creature -> {
            if (creature instanceof Dolphin) {
                ((Dolphin) creature).play();
            } else if (creature instanceof Jellyfish) {
                ((Jellyfish) creature).glow();
            }
        });

        // Fai cacciare uno squalo finchè non riesce a mangiare
        System.out.println("\n**** 8. Fai cacciare uno squalo finché non riesce a mangiare:");
        boolean success;
        do {
            success = jaws.hunt();
        } while (!success && jaws.isAlive());
        if (!jaws.isAlive()) {
            System.out.println("jaws è deceduto");
        }
    }
}
