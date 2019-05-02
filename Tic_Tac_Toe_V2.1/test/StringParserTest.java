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

    @Test
    public void methodGetBoardStateAsString_whenGivenCurrentBoardObject_returnsAStringWithCorrectFormatting() {

        Board currentBoard = new Board(3, 3);

        String expectedResult = "* * *\n* * *\n* * *";

        String actualResult = currentBoard.getBoardStateAsString();

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetBoardStateAsString_whenGivenCurrentBoardObjectOfAnySize_returnsAStringWithCorrectFormatting() {
        Board currentBoard = new Board(3, 2);
        String expectedResult = "* *\n* *\n* *";

        String actualResult = currentBoard.getBoardStateAsString();

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }
}