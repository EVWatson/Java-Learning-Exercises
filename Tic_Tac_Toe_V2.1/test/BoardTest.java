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
    public void methodGetCurrentBoard_whenGivenTotalRowsAndColumns_returnsAnArrayOfStringsToThoseDimensions(){
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
    public void methodGetCurrentBoard_whenGivenAnyNumberOfRowsAndColumns_returnsAnArrayOfStringsToThoseDimensions(){
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
    public void methodGetCurrentBoard_whenGivenALargerNumberOfRowsThanColumns_returnsAnArrayOfStringsToThoseDimensions(){
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
    public void methodWhatIsCurrentBoard_whenGivenCurrentBoardObject_returnsAStringWithCorrectFormatting() {

    Board currentBoard = new Board(3, 3);

    String expectedResult = "* * *\n* * *\n* * *";

    String actualResult = currentBoard.whatIsTheCurrentBoard();

    System.out.println(actualResult);

    assertEquals(expectedResult, actualResult);
}

@Test
    public void methodWhatIsCurrentBoard_whenGivenCurrentBoardObjectOfAnySize_returnsAStringWithCorrectFormatting(){
    Board currentBoard = new Board(3, 2);
    String expectedResult =  "* *\n* *\n* *";

    String actualResult = currentBoard.whatIsTheCurrentBoard();

    System.out.println(actualResult);

    assertEquals(expectedResult, actualResult);
}




}