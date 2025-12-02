package ch.samt;

public class CalculatorService {

    //attributi
    private Calculator calculator;

    //costruttore
    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    //metodi
    public int addAndMultiplyByTwo(int a, int b) {
        return calculator.add(a,b) *2;
    }
}
