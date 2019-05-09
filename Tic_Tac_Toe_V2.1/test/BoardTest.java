//import org.junit.Before;

import org.junit.Before;
import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.*;


public class BoardTest {

    private Game game;

    @Before
    public void setUp() {
        this.game = new Game();
    }

    @Test
    public void methodGetRows_whenGivenANumber_returnsThatNumberOfRows() {
        // Arrange
        Board currentBoard = new Board(3, 3);
        int expectedResult = 3;
        // Act
        int actualResult = currentBoard.getTotalRows();
        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetColumns_whenGivenANumber_returnsThatNumberOfColumns() {
//    Arrange
        Board currentBoard = new Board(3, 3);
        int expectedResult = 3;
//        Act
        int actualResult = currentBoard.getTotalColumns();
//        Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetCurrentBoard_whenGivenTotalRowsAndColumns_returnsAnArrayOfStringsToThoseDimensions() {
        Board currentBoard = new Board(3, 3);
        String[][] expectedResult = {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

        String[][] actualResult = currentBoard.getCurrentBoard();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetCurrentBoard_whenGivenAnyNumberOfRowsAndColumns_returnsAnArrayOfStringsToThoseDimensions() {
        Board currentBoard = new Board(5, 5);
        String[][] expectedResult = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        String[][] actualResult = currentBoard.getCurrentBoard();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void methodGetCurrentBoard_whenGivenALargerNumberOfRowsThanColumns_returnsAnArrayOfStringsToThoseDimensions() {
        Board currentBoard = new Board(5, 4);
        String[][] expectedResult = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"}
        };

        String[][] actualResult = currentBoard.getCurrentBoard();

        assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void methodUpdateBoardSpace_whenGivenXAndYCoordinatesAndAToken_overwritesTheSymbolAtThatArrayIndexPosition() {
        Board currentBoard = new Board(3, 3);
        currentBoard.updateBoardSpace(1, 1, "X");

        String[][] expectedResult = {
                {"X", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

        String[][] actualResult = currentBoard.getCurrentBoard();

        assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void methodUpdateBoardSpace_whenGivenDifferentXAndYCoordinatesAndTheOtherToken_overwritesTheSymbolAtThatArrayIndexPosition() {
        Board currentBoard = new Board(3, 3);
        currentBoard.updateBoardSpace(3, 1, "O");

        String[][] expectedResult = {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"O", "*", "*"}
        };

        String[][] actualResutl = currentBoard.getCurrentBoard();

        assertArrayEquals(expectedResult, actualResutl);

    }

    @Test
    public void getBoardSpaceContents_whenGivenCoordinates_returnsTheStringAtThatPosition() {
        Board currentBoard = new Board(3, 3);

        String expectedResult = "*";

        String actualResult = currentBoard.getBoardSpaceContents(1, 1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getBoardSpaceContents_whenGivenCoordinates_returnsTheTokenAtThatPosition() {
        Board currentBoard = new Board(3, 3);
        currentBoard.updateBoardSpace(1, 1, "X");

        String expectedResult = "X";

        String actualResult = currentBoard.getBoardSpaceContents(1, 1);


        assertEquals(expectedResult, actualResult);
    }

    //    TODO fix these tests:
    @Test
    public void isBoardSpaceFree_whenGivenCoordinates_returnsTrueWhenASpaceIsFree() {
        Board currentBoard = new Board(3, 3);

        boolean actualResult = currentBoard.isBoardSpaceFree(1, 1);

        assertTrue(actualResult);
    }

    @Test
    public void isBoardSpaceFree_whenGivenCoordinates_returnsFalseWhenASpaceIsOccupiedByAPlayerToken() {

        Board currentBoard = new Board(3, 3);

        currentBoard.updateBoardSpace(1, 1, "X");

        boolean actualResult = currentBoard.isBoardSpaceFree(1, 1);

        assertFalse(actualResult);
    }

    //    currently getting one row, needs to get all rows. perhaps needs nested array?
    @Test
    public void getRowContentsReturnsGameBoardRowAsAString() {
        Board currentBoard = new Board(3, 3);

        String expectedResult = "*********";

        String actualResult = currentBoard.getAllRows(currentBoard.getCurrentBoard());

        assertEquals(expectedResult, actualResult);

    }

}