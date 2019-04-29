import org.junit.Test;

import static org.junit.Assert.*;

public class StringParserTest {

    @Test
    public void parseStringCoordsToInt_givenCoordsAsString_ReturnsCoordsAsInts() {

        StringParser string = new StringParser();

        String givenCoords = "1,1";

        int[] expectedResult = {1,1};

        int[] actualResult = string.parseStringCoordsToInt(givenCoords);

        assertArrayEquals(expectedResult, actualResult);
    }
}