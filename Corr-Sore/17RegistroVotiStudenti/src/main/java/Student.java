import java.util.Random;

public class Student {

    private String name;
    private String surname;
    private double grade;


    public Student(String name, String surname, double grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    public void addNewGrade(GradeRegister register) {
        register.registerGrade(name, surname,grade);
    }

}