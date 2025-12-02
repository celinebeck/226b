package org.example;

public class HerbivorousFish extends AquaticCreature{
    public HerbivorousFish(int food, int energy, int speed, String name, int age) {
        super(food, energy, speed, name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("eeeeeeee");
    }
    @Override
    public void complimente(){
        System.out.println(this.getName() + " gioca!");
    }
}
