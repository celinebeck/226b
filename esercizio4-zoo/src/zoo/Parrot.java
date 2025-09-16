package zoo;

public class Parrot extends Mammal implements Feedable{
    //attributi
    //costruttori

    public Parrot(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    //metodi
    public void eat(String food){
        System.out.println("eats: " + food);
    }
    @Override
    public String makeSound(){
        return "aaaaa";
    }
    //metodi base

    @Override
    public String toString() {
        return super.getName()+" "+ super.getAge() ;
    }
}
