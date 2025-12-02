package org.example;

public abstract class Predator extends AquaticCreature {
    //attributi
    private int ferocity;


    //costruttore

    public Predator(int food, int energy, int speed, String name, int age, int ferocity) {
        super(food, energy, speed, name, age);
        this.ferocity = ferocity;
    }


    //getter e setter


    public int getFerocity() {
        return ferocity;
    }

    public void setFerocity(int ferocity) {
        this.ferocity = ferocity;
    }

    //metodi

    public boolean hunt(){
        int randomNum = (int)(Math.random() * 4);
        if(randomNum < 1){
            System.out.println("Preda catturata");
            eat();
            return true;
        }
        else{
            setEnergy(getEnergy() - 10);
            System.out.println("Caccia fallita, la preda e sfuggita, nuovo livello di energia: "+ getEnergy());
            return false;
        }
    }
    //metodi base

}
