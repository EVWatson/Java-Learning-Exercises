import org.junit.Test;

import static org.junit.Assert.*;

public class FizzTest {

    @Test
    public void getIsNumberMultipleOf3() {
        int input = 9;
        boolean actualResult = Fizz.getIsNumberMultipleOf3(input);
        assertTrue(actualResult);
    }

//    @Test
//    public void getPrintFizz() {
//    }
}