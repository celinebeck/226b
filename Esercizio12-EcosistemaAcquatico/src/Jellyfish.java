public class Jellyfish extends AquaticCreature{
    public Jellyfish(int food, int energy, int speed, String name, int age) {
        super(food, energy, speed, name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Blub");
    }
}
