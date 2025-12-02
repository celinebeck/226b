package org.example;

public abstract class AquaticCreature implements CratureBase {
    private int food;
    private int energy;
    private int speed;
    private String name;
    private int age;

    public AquaticCreature(int food, int energy, int speed, String name, int age) {
        this.food = food;
        this.energy = energy;
        this.speed = speed;
        this.name = name;
        this.age = age;
    }

    public AquaticCreature(int food, int energy, int speed, String name) {
        this.food = food;
        this.energy = energy;
        this.speed = speed;
        this.name = name;
    }

    //costruttore
    public AquaticCreature(int food, int energy, int speed) {
        this.food = food;
        this.energy = energy;
        this.speed = speed;
    }
    //getter e setter

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        if (energy < 0) {
            System.out.println(name + "e morto");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //metodi
    public void makeSound() {
        System.out.println("cra cra");
    }

    @Override
    public void move() {
        if (energy > 0) {
            energy = energy - 2;
            System.out.println(name + " si muove nell'acqua");
        } else {
            System.out.println(name + " e morto.");
        }
    }

    @Override
    public void eat() {
        if (energy > 0 && food < 100) {
            food = food + 10;
            energy += 20;
            System.out.println(name + " si e appena nutrito. Nuovo livello di energia:  " + energy);
        } else if (food > 100) {
            System.out.println(name + " e pieno.");
        } else if (energy < 0) {
            System.out.println(name + " e morto.");
        }
    }

     public abstract void complimente();

}
