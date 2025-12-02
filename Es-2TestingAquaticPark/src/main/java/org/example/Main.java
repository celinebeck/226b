package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shark s1 = new Shark(50, 80, 25, "Great White", 12, 90);
        Shark s2 = new Shark(30, 60, 20, "Hammerhead", 8, 75);

        Jellyfish j1 = new Jellyfish(5, 10, 10, "Moon org.example.Jellyfish", 1);
        Jellyfish j2 = new Jellyfish(8, 25, 12, "Box org.example.Jellyfish", 2);

        HerbivorousFish f1 = new HerbivorousFish(15, 50, 18, "Parrotfish", 4);
        HerbivorousFish f2 = new HerbivorousFish(12, 45, 15, "Surgeonfish", 3);

        Dolphin d1 = new Dolphin(25, 90, 35, "Bottlenose", 8, 40, 95);
        Dolphin d2 = new Dolphin(30, 100, 38, "Spinner", 6, 35, 98);
        EcosystemManager em = new EcosystemManager();
        em.addCrature(s1);
        em.addCrature(s2);
        em.addCrature(j1);
        em.addCrature(j2);
        em.addCrature(f1);
        em.addCrature(f2);
        em.addCrature(d1);
        em.addCrature(d2);
        em.filterByEnergy(50);
        System.out.println();
        em.getAdultCreaturesNames(8);
        System.out.println();
        em.findMostDangereusPredators(20,30);
        System.out.println();
        em.callAllPredatorsPolimorphicMethods(s1);
        System.out.println();
        em.callAllPredatorsInheritedMethods(s1);
        System.out.println();
        System.out.println("**** 6. Fai muovere una creatura finché non muore:");
        j1.move();
        j1.move();
        j1.move();
        j1.move();
        j1.move();
        j1.move();
        j1.move();
        j1.move();
        System.out.println();
        System.out.println("**** 7. Comportamenti specifici:");
        d1.complimente();
        s1.complimente();
        j1.complimente();
        f1.complimente();
        em.huntUntillEat(s2);
    }
}