package ch.samt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CalculatorTest {
    @Test
    public void testCalculatorAdd(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(1,2);
        assertEquals(3,sum);
    }

    @Test
    public void testCalculatorDivision(){
        Calculator calculator = new Calculator();
        float div = calculator.division(25,5);
        assertEquals(5,div);
    }

}
