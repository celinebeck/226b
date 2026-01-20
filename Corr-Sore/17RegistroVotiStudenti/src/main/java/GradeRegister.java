import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class GradeRegister {

    private AtomicReference<Double> gradeSum = new AtomicReference<>(0.0);
    private AtomicInteger totalGrades = new AtomicInteger(0);
    private AtomicInteger countAnna= new AtomicInteger(0);
    private AtomicInteger countRossi= new AtomicInteger(0);

    public void registerGrade(String name, String surname, double grade) {
        if (name.equalsIgnoreCase("Anna")) {
            countAnna.incrementAndGet();
        }
        if (surname.equalsIgnoreCase("Rossi")) {
            countRossi.incrementAndGet();
        }
        totalGrades.incrementAndGet();
        gradeSum.accumulateAndGet(grade, Double::sum);

    }

    public double getAverageGrade() {
        return gradeSum.get() / totalGrades.get();
    }

    public double getTotalGrades() {
        return totalGrades.get();
    }

    public int getCountAnna() {
        return countAnna.get();
    }

    public int getCountRossi() {
        return countRossi.get();
    }

    public  Double getGradeSum() {
        return gradeSum.get();
    }

}