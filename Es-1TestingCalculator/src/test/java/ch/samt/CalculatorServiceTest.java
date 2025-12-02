package ch.samt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class CalculatorServiceTest {
    @Test
    public void testCalculatorServiceAddMock(){
        Calculator calcMock = mock(Calculator.class);

        when(calcMock.add(3, 5)).thenReturn(8);

        CalculatorService cs = new CalculatorService(calcMock);
        int sum = cs.addAndMultiplyByTwo(3, 5);
        assertEquals(16,sum);
    }

    @Test
    public void testCalculatorServiceAdd(){
        CalculatorService cs = new CalculatorService(new Calculator());
        int sum = cs.addAndMultiplyByTwo(3, 5);
        assertEquals(16,sum);
    }

}
