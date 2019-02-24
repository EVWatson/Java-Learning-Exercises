import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test

    public void canReverseAsString(){
        String input = "Friday";
        String expected = "yadirF";
        Main m = new Main();
        String actual = m.reverse(input);

        assertEquals(actual, expected);
    }
}
