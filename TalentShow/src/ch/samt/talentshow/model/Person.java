package ch.samt.talentshow.model;
import ch.samt.talentshow.enumerator.Category;
import ch.samt.talentshow.enumerator.Level;

import java.util.Objects;

public class Person {
    //attributi
    private String name;
    private int age;
    private Category category;
    private Level level;
    private String showName;
    //costruttore

    public Person(String name, int age, Category category, Level level, String showName) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.level = level;
        this.showName = showName;

    }
    //getter e setter

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
//metodi
    //metodi base

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && category == person.category && level == person.level && Objects.equals(showName, person.showName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, category, level, showName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", category=" + category +
                ", level=" + level +
                ", showName='" + showName + '\'' +
                '}';
    }
}
