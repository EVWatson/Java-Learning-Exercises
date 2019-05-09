import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp(){
        this.game = new Game();
    }

//    @Test
//    public void gameClass_whenInstanciated_numberOfMovesIsZero() {
//        Integer actual = game.getNumberOfMoves();
//        Integer expected = 0;
//        assertEquals(expected, actual);
//    }

    @Test
    public void gameClass_whenInstanciated_nextTurnIsAPlayer() {
        Game game = new Game();
        Player expected = new Player("player", "x");
        Player actual = game.getNextPlayer() ;
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void gameClass_whenInstanciated_isCompletedIsFalse() {
        boolean actual = game.isGameComplete();
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
        assertArrayEquals(expectedBoard.getCurrentBoard(), actualBoard.getCurrentBoard());
    }

    @Test
    public void isGameCompleteReturnsTrueWhenNoMoreMovesArePossible(){

        game.applyMove(1,1);
        game.applyMove(1,2);
        game.applyMove(1,3);
        game.applyMove(2,1);
        game.applyMove(2,2);
        game.applyMove(2,3);
        game.applyMove(3,1);
        game.applyMove(3,2);
        game.applyMove(3,3);

        Boolean actualResult = game.isGameComplete();

        assertTrue(actualResult);

    }



}