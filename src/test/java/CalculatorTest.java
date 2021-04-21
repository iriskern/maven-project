import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    public void addShouldReturnSumOfValues(){
        // GIVEN
        int value1 = 3;
        int value2 = 5;

        // WHEN
        int sum = Calculator.add(value1, value2);

        // TEST
        assertEquals(8, sum);
    }

    @Test
    public void shouldProofIfValueIsBiggerThan100(){

        int value = 101;

        boolean result = Calculator.moreThan100(value);

        assertTrue(result);

    }
}
