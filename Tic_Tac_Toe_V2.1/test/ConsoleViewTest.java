import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleViewTest {

    @Test
    public void parseStringCoordsToInt_givenCoordsAsString_ReturnsCoordsAsInts() {

        String givenCoords = "1,1";

        int[] expectedResult = {1,1};

        int[] actualResult = ConsoleView.parseStringCoordsToInt(givenCoords);

        assertArrayEquals(expectedResult, actualResult);
    }
}