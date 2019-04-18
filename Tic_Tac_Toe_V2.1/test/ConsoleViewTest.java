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

    @Test
    public void printMessage_whenGivenConstantAndCalledFromConstructor_printsCorrectMessage(){
        ConsoleView cv = new ConsoleView();

        String expectedResult = "Welcome to Tic Tac Toe!";

        String actualResult = ConsoleView.WELCOME_MESSAGE;

        assertEquals(expectedResult, actualResult);

        cv.printMessage(ConsoleView.PROMPT_PLAYER_MESSAGE);
    }

}