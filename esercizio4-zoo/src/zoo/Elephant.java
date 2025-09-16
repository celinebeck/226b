package zoo;

public class Elephant extends Mammal implements Feedable{
    //attributi
    //costruttore

    public Elephant(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    //metodi
    public void eat(String food){
        System.out.println("eats: " + food);
    }
    @Override
    public String makeSound(){
        return "bruuu";
    }
    //metodi base


    @Override
    public String toString() {
        return super.getName()+" "+ super.getAge() ;
    }
}
