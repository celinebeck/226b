package org.example;

public class Dolphin extends Predator{
    //attributi
    private int intelligence;
    //costruttore


    public Dolphin(int food, int energy, int speed, String name, int age, int ferocity, int intelligence) {
        super(food, energy, speed, name, age, ferocity);
        this.intelligence = intelligence;
    }


    @Override
    public void makeSound(){
        System.out.println("hiiihiii");
    }
    @Override
    public void complimente(){
        System.out.println(this.getName() + " gioca e fa le acrobazie!");
    }
}
