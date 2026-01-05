import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestGradeRegister {

    @Test
    public void testStudentCreation() {
        // when
        List<Student> students = SimulatorMain.createStudents();
        // then
        Assertions.assertEquals(100, students.size());
    }

    @Test
    public void testGradeSumAndAvg() throws InterruptedException {

        // given
        List<Student> students = createStudents();
        GradeRegister register = new GradeRegister();
        ExecutorService service = Executors.newFixedThreadPool(4);

        // when
        students.forEach(student -> {
            service.submit(() -> student.addNewGrade(register));
        });

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        // then
        Assertions.assertEquals(100.0, register.getTotalGrades());
        Assertions.assertEquals(400.0, register.getGradeSum());
        Assertions.assertEquals(4.0, register.getAverageGrade());
        Assertions.assertEquals(100, register.getCountRossi());
        Assertions.assertEquals(0, register.getCountAnna());
    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(new Student("Mario", "Rossi", 4));
        }
        return students;
    }

}
