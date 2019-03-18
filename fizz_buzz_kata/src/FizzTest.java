import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


class FizzTest {

    @Test
    void getIsNumberMultipleOf3() {
//        arrange: 9
        int input = 9;

//        act: check if this number is amutiple of 3
       boolean actualResult = Fizz.getIsNumberMultipleOf3(input);

//       assert: i expect to get true

        assertTrue(actualResult);
    }
}