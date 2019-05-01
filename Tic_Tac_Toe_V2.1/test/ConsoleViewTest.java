import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsoleViewTest {


    @Test
    public void printMessage_whenGivenConstantAndCalledFromConstructor_printsCorrectMessage(){
        ConsoleView cv = new ConsoleView();

        String expectedResult = "Welcome to Tic Tac Toe!";

        String actualResult = ConsoleView.WELCOME_MESSAGE;

        assertEquals(expectedResult, actualResult);

        cv.printMessage(ConsoleView.PROMPT_PLAYER_MESSAGE);
    }



}