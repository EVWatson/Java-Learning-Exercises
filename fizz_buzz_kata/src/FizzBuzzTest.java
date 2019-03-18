import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void getIsNumberMultipleOf3and5() {
        int input = 15;
        boolean actualResult = FizzBuzz.getIsNumberMultipleOf3and5(input);
        assertTrue(actualResult);
    }

//    @Test
//    public void getPrintFizzBuzz() {
//    }
}