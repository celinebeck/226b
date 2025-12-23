package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//CON RACECONDITION
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] nomi = {"Anna", "Giulia", "Marco", "Sofia", "Matteo", "Martina", "Alessandro", "Francesca", "Andrea", "Elena"};
        String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli", "Siciliani", "Fabbri", "Romano", "Ferrari", "Conti"};


        List<Student> studenti = createStudents(cognomi, nomi);

        GradeRegister reg = new GradeRegister();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for ( Student student : studenti ) {
            executor.submit(() -> student.addNewGrade(reg));
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println(reg.getCountGrades());
        System.out.println(reg.getAverageGrade());
        System.out.println(reg.getSumAnna());
        System.out.println(reg.getSumRossi());
    }

    private static List<Student> createStudents(String[] cognomi, String[] nomi) {
        List<Student> studenti = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            int  surnRand = rand.nextInt(cognomi.length);
            int nomRand = rand.nextInt(nomi.length);
            int gradeRand = rand.nextInt(6 - 2 + 1) + 2;
            studenti.add(new Student(nomi[surnRand], cognomi[nomRand], gradeRand));
        }
        return studenti;
    }
}