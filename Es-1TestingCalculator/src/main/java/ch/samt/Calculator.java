package ch.samt;

public class Calculator {
    //metodi
    public int add(int a, int b) {
        return a + b;
    }
    public float division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero non consentita.");
            return 0;
        }
    }
}
