import org.junit.Test;

import static org.junit.Assert.*;

public class BuzzTest {

    @Test
    public void getIsNumberMultipleOf5() {
        int input = 10;
        boolean actualResult = Buzz.getIsNumberMultipleOf5(input);
        assertTrue(actualResult);

        int otherInput = 9;
        boolean otherResult = Buzz.getIsNumberMultipleOf5(otherInput);
        assertFalse(otherResult);
    }



//    @Test
//    public void getPrintBuzz() {
//
//    }
}