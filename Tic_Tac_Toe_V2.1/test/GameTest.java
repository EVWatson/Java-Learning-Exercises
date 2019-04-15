import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        this.game = new Game();
    }

    @Test
    public void gameClass_whenInstanciated_numberOfMovesIsZero() {
        Integer actual = game.getNumberOfMoves();
        Integer expected = 0;
        assertEquals(expected, actual);
    }

//    @Test
//    public void gameClass_whenInstanciated_nextTurnIsAPlayer() {
//        Game game = new Game();
//         expected = game.getNextTurn();
//         actual = ;
//        assertEquals(expected, actual);
//    }

    @Test
    public void gameClass_whenInstanciated_isCompletedIsFalse() {
        boolean actual = game.getIsCompleted();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void gameClass_whenInstanciated_winnerShouldBeNull() {
        Player actual = game.getWinner();
        Player expected = null;
        assertEquals(expected, actual);
    }


    @Test
    public void applyMove_whenGivenCoordinates_shouldUpdateGameBoardAtThatPositionWithTheNextPlayerToken() {
        // Arrange
//        Player nextPlayer = game.getNextPlayer();
        String nextPlayerToken = game.getNextPlayer().getToken();

        Board expectedBoard = new Board(3,3);
        expectedBoard.updateBoardSpace(1,1, nextPlayerToken);

        // Act
        game.applyMove(1, 1);

        // Assert
        Board actualBoard = game.getGameBoard();
        assertEquals(expectedBoard.getCurrentBoard(), actualBoard.getCurrentBoard());
    }

    @Test
    public void isBoardSpaceFree_whenGivenCoordinates_returnsTrueWhenASpaceIsFree(){

        boolean actualResult = game.isBoardSpaceFree(1,1);

        assertTrue(actualResult);
    }

    @Test
    public void isBoardSpaceFree_whenGivenCoordinates_returnsFalseWhenASpaceIsOccupiedByAPlayerToken(){

        game.getGameBoard().updateBoardSpace(1, 1, "X");

        boolean actualResult = game.isBoardSpaceFree(1,1);

        assertFalse(actualResult);
    }

}