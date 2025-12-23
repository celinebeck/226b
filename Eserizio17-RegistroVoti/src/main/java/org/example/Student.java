package org.example;

public class Student {
    private String name;
    private String surname;
    private int grade;

    public Student(String name, String surname, int grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void addNewGrade(GradeRegister register) {
            register.addGrade(this);
    }
}
