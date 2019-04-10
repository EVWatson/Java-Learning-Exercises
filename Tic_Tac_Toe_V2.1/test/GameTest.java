import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void gameClass_whenInstanciated_numberOfMovesIsZero() {
        Game game = new Game();
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
        Game game = new Game();
        boolean actual = game.getIsCompleted();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void gameClass_whenInstanciated_winnerShouldBeNull() {
        Game game = new Game();
        Player actual = game.getWinner();
        Player expected = null;
        assertEquals(expected, actual);
    }




}