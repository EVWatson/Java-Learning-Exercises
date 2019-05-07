import java.util.Scanner;

/*
- gets player input (strings) by printing a prompt and taking in data
- sends data to ComputerResponse formatter
- prints ComputerResponse from computer to console

 */

public class ConsoleView {

    final static String WELCOME_MESSAGE = "Welcome to Tic Tac Toe!";
    final static String BOARD_STATE_MESSAGE = "Here is the current board: ";

    //    edit to specify player and their token:
    final static String PROMPT_PLAYER_MESSAGE = "Please enter coordinates 'x,y' to place your token, or 'q' to give up: ";

    final static String MOVE_ACCEPTED_MESSAGE = "Move accepted, here is the current board: ";
    final static String INVALID_MOVE_MESSAGE = "That space is already taken! Please try again: ";

    //    edit to specify player
    final static String WINNER_WINNER_CHICKEN_DINNER_MESSAGE = "Congratulations! You won!";
    final static String GAME_IS_A_DRAW_MESSAGE = "No moves left; Game is a draw!";
    final static String GAME_FORFETIED_MESSAGE = "Quitters never win.";


    private String requestPlayerInput;
    private String ComputerResponse;

//does computerResponse need to be in the constructor?

    private String message;

    private Game theGame;
    private StringParser translate;

    public ConsoleView() {
        printMessage(WELCOME_MESSAGE);
        this.requestPlayerInput = promptPlayer();
        this.theGame = new Game();
        this.translate = new StringParser();
        /// Something else should do this logic and return a string for consoleView to print without any specific game logic
        Board theBoard = this.theGame.getGameBoard();
        String stringBoard = this.translate.formatBoardAsString(theBoard.getCurrentBoard());
        System.out.println(stringBoard);
        ///
    }


    private String promptPlayer() {
        printMessage(PROMPT_PLAYER_MESSAGE);
        Scanner inputScanner = new Scanner(System.in);
        String playerResponse = inputScanner.nextLine();
        return playerResponse;
    }


    public void printMessage(String message) {

        System.out.println(message);
    }

    public void printCurrentBoard(String currentBoard){
        System.out.println(currentBoard);
    }



    public String getRequestPlayerInput() {
        return requestPlayerInput;
    }

    public String getComputerResponse() {
        return ComputerResponse;
    }

    public Game getTheGame() {
        return theGame;
    }
}

    /*
    - asks game 'are we there yet?'

     -ask for player input

    - parse player input into coordinates

   - submit coords to game
  - (Game will check coordinates pertain to a legal move)
   - print output
     */


