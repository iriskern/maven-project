import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayTest {

    @Test
    public void shouldReturnTheRightArray(){
        String[] expectedArray = {"Student 1", "Student 2", "Student 3"};
        String[] methodArray = Array.students(3);

        assertArrayEquals(expectedArray, methodArray);
    }

    @Test
    public void shouldReturnEmptyArray(){
        String[] expectedArray = {};
        String[] methodArray = Array.students(0);

        assertArrayEquals(expectedArray, methodArray);
    }
}
