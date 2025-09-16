package zoo;

import java.util.Objects;

public class Mammal extends Animal {
    //attributi
    private boolean hasFur;
    //costruttore

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
    // getter e setter
    public String getName() {
        return super.getName();
    }
    public int getAge() {
        return super.getAge();
    }
    //metodi
    public String makeSound(){
        return "rrr";
    }
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return hasFur == mammal.hasFur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasFur);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "hasFur=" + hasFur +
                '}';
    }
}
