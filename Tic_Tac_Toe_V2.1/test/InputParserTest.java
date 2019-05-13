import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputParserTest {


    private Game game;
    private InputParser string;
    private Board currentBoard;

    @Before
    public void setUp(){
        this.game = new Game();
        this.string = new InputParser();
        this.currentBoard = new Board(3, 3);
    }

    @Test
    public void parseStringCoordsToInt_givenCoordsAsString_ReturnsCoordsAsInts() {

        String givenCoords = "1,1";

        int[] expectedResult = {1,1};

        int[] actualResult = string.parseStringCoordsToInt(givenCoords);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetBoardStateAsString_whenGivenCurrentBoardObject_returnsAStringWithCorrectFormatting() {
        String[][] boardInPlay = currentBoard.getCurrentBoard();

        String expectedResult = "* * *\n* * *\n* * *";

        String actualResult = string.formatBoardAsString(boardInPlay);

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetBoardStateAsString_whenGivenCurrentBoardObjectOfAnySize_returnsAStringWithCorrectFormatting() {

        String[][] boardInPlay = currentBoard.getCurrentBoard();

        String expectedResult = "* * *\n* * *\n* * *";

        String actualResult = string.formatBoardAsString(boardInPlay);

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }
}