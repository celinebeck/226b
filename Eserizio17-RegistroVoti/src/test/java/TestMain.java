import org.example.GradeRegister;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestMain {
    private List<Student> studenti = new ArrayList<>();
    private GradeRegister reg = new GradeRegister();

    @BeforeEach
    public void setUp()   {
        for (int i = 0; i < 100; i++) {
            studenti.add(new Student("Anna", "Rossi", 2));
        }

    }

    @Test
    public void testRegisterMain() throws InterruptedException {
        // when
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (Student student : studenti) {
            executor.submit(() -> student.addNewGrade(reg));
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        // then
        Assertions.assertEquals(100, reg.getCountGrades());
        Assertions.assertEquals(2, reg.getAverageGrade());
        Assertions.assertEquals(100, reg.getSumAnna());
        Assertions.assertEquals(100, reg.getSumRossi());
    }


}
