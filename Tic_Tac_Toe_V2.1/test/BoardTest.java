//import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.*;


public class BoardTest {

//    private Board currentBoard;
//
//    @Before
//    public void setUp(){
//
//    }

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

}