package org.example;

public class Shark extends Predator{
    //costruttore


    public Shark(int food, int energy, int speed, String name, int age, int ferocity) {
        super(food, energy, speed, name, age, ferocity);
    }

    @Override
    public void makeSound(){
        System.out.println("Argh");
    }
    @Override
    public void complimente(){
        System.out.println(this.getName() + " fa paurissima!");
    }
}
