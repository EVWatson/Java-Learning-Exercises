import java.util.Scanner;

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

//    print welcome message
//    initialise new game
//    print starting board

    private Game newGame;
    private String message;

    public ConsoleView() {
        this.newGame = new Game();
        this.message = message;
    }

//    asks game 'are we there yet?'
//    ask for player input
//    parse player input into coordinates

    private String promptPlayer() {
        Scanner inputScanner = new Scanner(System.in);
        String playerResponse = inputScanner.nextLine();
        return playerResponse;
    }

    public static int[] parseStringCoordsToInt(String playerInput) {
        String[] splitInput = playerInput.split(",");
        int x = Integer.parseInt(splitInput[0]);
        int y = Integer.parseInt(splitInput[1]);
        int[] intCoords = {x, y};
        return intCoords;
    }
//    submit coords to game
//    (Game will check coordinates pertain to a legal move)
    // print output
}
