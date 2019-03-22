public class GamePrompts {

    public static void confirmMoveIsAccepted() {
        System.out.println("\nMove accepted, here's the current board:\n");
    }

    public static void printGameBeginning () {
        System.out.println(
                "~~ Welcome to Tic Tac Toe! ~~ \n\n Here is your current game board. Let the game begin...\n "
        );
    }

    public static void promptPlayerToMakeMove(String player, String token) {
        System.out.print(player + " enter a co-ordinate x,y to place your " + token + " or enter 'q' to give up: ");

    }

    public static void gameFieldUnavailable() {
        System.out.println("\nThat space is already taken, please choose other coordinates:");
    }

    public static void gameIsADraw() {
        System.out.println("GAME OVER! There are no more spaces available! So who won? The Game? Both players? You decide...");
    }

    public static void playerChoosesQuit(String playerChoice, String player) {
        System.out.println("GAME OVER! " + player + ", you forfeit the game!");
    }

    public static void printWinnerMessage(String player) {
        System.out.println("\nCongratulations " + player + ", you win!\n");

    }
}
