import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimulatorMain {

    public static void main(String[] args) throws InterruptedException {
        List<Student> students = createStudents();

        GradeRegister register = new GradeRegister();
        ExecutorService service = Executors.newFixedThreadPool(4);

        students.forEach(student -> {
            service.submit(() -> student.addNewGrade(register));
        });

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Numero voti inseriti: " + String.format("%.2f", register.getTotalGrades()));
        System.out.println("Media voti: " + String.format("%.2f", register.getAverageGrade()));
        System.out.println("Allievi con nome Anna: " + register.getCountAnna());
        System.out.println("Allievi con cognome Rossi: " + register.getCountRossi());
    }

    protected static List<Student> createStudents() {
        Random random = new Random();
        String[] names = {"Mario", "Giorgio", "Anna", "Pio", "Lea", "Bea", "Gianni", "John", "Ada", "Wilma"};
        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Doe", "Rezzonico", "Bernasconi", "Rosso", "Bianco", "Verde", "Verdone"};
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(new Student(names[random.nextInt(10)], surnames[random.nextInt(10)], random.nextInt(2, 7)));
        }
        return students;
    }

}
