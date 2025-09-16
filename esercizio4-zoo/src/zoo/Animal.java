package zoo;

import java.util.Objects;

public abstract class Animal {
    //attributi
    private String name;
    private int age;
    //costruttore
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getter e setter
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
   public abstract String makeSound();
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
