package org.example;

import java.util.ArrayList;
import java.util.List;

public class EcosystemManager {
    //attributi
    private List<CratureBase> listCreature;
    //costruttore

    public EcosystemManager() {
        this.listCreature =new ArrayList<CratureBase>() ;
    }
    //metodi
    public void addCrature(CratureBase crature) {
        listCreature.add(crature);
    }

    public void filterByEnergy(int energy){
        System.out.println("**** 1. Creature con energia > "+energy+":");
        listCreature.stream()
                .filter(c -> c.getEnergy() > energy)
                .forEach((c -> System.out.println("-"+c.getName()+ "("+c.getEnergy()+")")));
    }

    public void getAdultCreaturesNames(int age){
        System.out.println("**** 2. Creature con eta > "+age+":");
        listCreature.stream()
                .filter(c -> c.getAge() >= age)
                .forEach((c) -> System.out.println("-"+c.getName()));
    }

    public void findMostDangereusPredators(int energy, int ferocy){
        System.out.println("**** 3. Predatori più pericolosi:");
        listCreature.stream()
                    .filter(p -> p instanceof Predator)
                .map(p -> (Predator)p)
                .filter(p -> p.getEnergy() >= energy)
                .filter(p -> p.getFerocity() >= ferocy)
                .forEach((p) -> System.out.println("-"+p.getName()));
    }

    public void callAllPredatorsPolimorphicMethods(Predator p){
        System.out.println("**** 4. Invoca tutti i metodi polimorfici di un predatore:");
        p.makeSound();

    }

    public void callAllPredatorsInheritedMethods(Predator p){
        System.out.println("**** 5. Invoca tutti i metodi ereditati di un predatore:");
        p.eat();
        p.hunt();
    }
    public void huntUntillEat(Predator p){
        System.out.println();
        System.out.println("**** 8. Fai cacciare uno squalo finché non riesce a mangiare:");
        while(!p.hunt()){
            p.hunt();
        }
    }
}
