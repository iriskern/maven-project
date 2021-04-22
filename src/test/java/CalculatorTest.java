import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    public void shouldReturnMessageTooManyPeople(){

        int peopleInShop = 1;
        String alarmLevel = "red";

        String alarmMessage = Calculator.alarmMessage(peopleInShop, alarmLevel);

        assertEquals("Zu viele Personen", alarmMessage);
    }

    @Test
    public void shouldReturnMessagePeopleAmountOk(){

        int peopleInShop = 60;
        String alarmLevel = "green";

        String alarmMessage = Calculator.alarmMessage(peopleInShop, alarmLevel);

        assertEquals("Maximale Personenzahl nicht überschritten", alarmMessage);
    }

    @ParameterizedTest(name = "{0} faculty is {1}")
    @CsvSource({"0, 1", "1, 1", "2, 2", "3, 6"})
    public void shouldReturnFaculty(int numberToCalculate, int expectedValue){
        int facultyResult = Calculator.calculateFaculty(numberToCalculate);
        assertEquals(expectedValue, facultyResult);
    }

}
