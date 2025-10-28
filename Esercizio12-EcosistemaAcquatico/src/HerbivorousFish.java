public class HerbivorousFish extends AquaticCreature{
    public HerbivorousFish(int food, int energy, int speed, String name, int age) {
        super(food, energy, speed, name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("eeeeeeee");
    }
}
