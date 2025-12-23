package org.example;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class GradeRegister {
    private AtomicInteger sumGrades = new AtomicInteger(0);
    private AtomicInteger countGrades = new AtomicInteger(0);
    private AtomicInteger sumAnna = new AtomicInteger(0);
    private AtomicInteger sumRossi = new AtomicInteger(0);

    public void addGrade(Student student){
        countGrades.incrementAndGet();
        sumGrades.accumulateAndGet(student.getGrade(),Integer::sum);
        if(student.getSurname().equals("Rossi")){
            sumRossi.incrementAndGet();
        }
        if(student.getName().equals("Anna")){
            sumAnna.incrementAndGet();
        }
    }
    public float getAverageGrade(){
        return (float)sumGrades.get()/countGrades.get();
    }

    public int getCountGrades() {
        return countGrades.get();
    }
    public int getSumGrades() {
        return sumGrades.get();
    }
    public int getSumAnna() {
        return sumAnna.get();
    }
    public int getSumRossi() {
        return sumRossi.get();
    }
}
