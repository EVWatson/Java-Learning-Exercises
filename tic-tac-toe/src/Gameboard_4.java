import java.util.Scanner;

public class Gameboard_4 {

    public static String getPlayerChoice() {
        Scanner chooseField = new Scanner(System.in);
        String rawPlayerInput = chooseField.nextLine();
        return rawPlayerInput;
    }

    public static int[] turnStringIntoCoordinates(String rawPlayerInput) {
        String[] splitPlayerInput = rawPlayerInput.split(",");
        int index1 = Integer.parseInt(splitPlayerInput[0]);
        int index2 = Integer.parseInt(splitPlayerInput[1]);
        int[] coordinates = new int[2];
        coordinates[0] = index1;
        coordinates[1] = index2;
        return coordinates;
    }

    public static boolean checkSquare(String[][] gameBoard, int[] boardCoordinates) {
        int index1 = boardCoordinates[0];
        int index2 = boardCoordinates[1];
        String boardField = gameBoard[index1-1][index2-1];
        if (boardField.equals("*")) {
            return true;
//            return boardField.equals("*");
        }
        return false;
    }

    public static void writeSquare(String[][] gameBoard, int[] boardCoordinates, String token) {
        int index1 = boardCoordinates[0];
        int index2 = boardCoordinates[1];
        gameBoard[index1 - 1][index2 - 1] = token;
        // printBoard(gameBoard);
    }

    public static void confirmMoveIsAccepted() {
        System.out.println("\nMove accepted, here's the current board:\n");
    }

    public static void printGameBoard(String[][] gameBoard) {
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.print(gameBoard[x][y] + "      ");
            }
            System.out.println("\n");
        }
    }

    public static String[][] setUpGameBoard() {
        String[][] newBoard = new String[3][3];
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                    newBoard[x][y] = "*";
            }
        }
        return newBoard;
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

    private static boolean isPlayer1Turn(int gameRound)
    {
        if ((gameRound % 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean gameInPlay(int turnsTaken) {
        if (turnsTaken <= 9) {
            return true;
        }
        return false;
    }

    public static void gameIsADraw() {
        System.out.println("GAME OVER! There are no more spaces available! So who won? The Game? Both players? You decide...");
    }

    public static void playerChoosesQuit(String playerChoice, String player) {
            System.out.println("GAME OVER! " + player + ", you forfeit the game!");
    }

    public static boolean checkRows(String playerToken, String[][] gameBoard) {

        if ((gameBoard[0][0].equals(playerToken)) && ((gameBoard[0][1].equals(playerToken))) && (gameBoard[0][2].equals(playerToken))) {
            return true;
       }
        else if ((gameBoard[1][0].equals(playerToken)) && ((gameBoard[1][1].equals(playerToken))) && (gameBoard[1][2].equals(playerToken))) {
            return true;
        }
        else if ((gameBoard[2][0].equals(playerToken)) && ((gameBoard[2][1].equals(playerToken))) && (gameBoard[2][2].equals(playerToken))) {
            return true;
        }
       return false;
    }

    public static boolean checkColumns(String playerToken, String[][] gameBoard) {

        if ((gameBoard[0][0].equals(playerToken)) && ((gameBoard[1][0].equals(playerToken))) && (gameBoard[2][0].equals(playerToken))) {
            return true;
        }
        else if ((gameBoard[0][1].equals(playerToken)) && ((gameBoard[1][1].equals(playerToken))) && (gameBoard[2][1].equals(playerToken))) {
            return true;
        }
        else if ((gameBoard[0][2].equals(playerToken)) && ((gameBoard[1][2].equals(playerToken))) && (gameBoard[2][2].equals(playerToken))) {
            return true;
        }
        return false;
    }

    public static boolean checkDiagonal(String playerToken, String[][] gameBoard) {

        if ((gameBoard[0][0].equals(playerToken)) && ((gameBoard[1][1].equals(playerToken))) && (gameBoard[2][2].equals(playerToken))) {
            return true;
        }
        else if ((gameBoard[0][2].equals(playerToken)) && ((gameBoard[1][1].equals(playerToken))) && (gameBoard[2][0].equals(playerToken))) {
            return true;
        }
        return false;
    }

    public static boolean checkIfPlayerHasWon(String playerToken, String[][] gameBoard) {
        if (checkRows(playerToken, gameBoard)) {
                return true;
        }
        else if (checkColumns(playerToken, gameBoard)) {
            return true;
        }
        else if (checkDiagonal(playerToken, gameBoard)) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void printWinnerMessage(String player) {
        System.out.println("\nCongratulations " + player + ", you win!\n");

    }

    public static void main (String[]args) {

            printGameBeginning();

            String[][] gameBoard = setUpGameBoard();

            printGameBoard(gameBoard);

            int playerTurn = 1;

            while (gameInPlay(playerTurn)) {

                String player;
                String token;

                if (isPlayer1Turn(playerTurn)) {
                    player = "Player 1";
                    token = "X";
                } else {
                    player = "Player 2";
                    token = "O";
                }
                    promptPlayerToMakeMove(player, token);
                    String playerChoice = getPlayerChoice();
                    if (playerChoice.equals("q")) {
                        playerChoosesQuit(playerChoice, player);
                        break;
                    }

                    int[] coordinates = turnStringIntoCoordinates(playerChoice);

                    boolean freeSpace = checkSquare(gameBoard, coordinates);

                    if (freeSpace) {
                        writeSquare(gameBoard, coordinates, token);
                        if (checkIfPlayerHasWon(token, gameBoard)) {
                            printWinnerMessage(player);
                            printGameBoard(gameBoard);
                            break;
                        }
                        else {
                            playerTurn++;
                            confirmMoveIsAccepted();
                            printGameBoard(gameBoard);
                        }
                    }
                    else {
                        gameFieldUnavailable();
                    }
                    if (playerTurn > 9) {
                        gameIsADraw();
                    }

            }
            

        }
    }


        /*
                 1. prompt player 1 for coordinates
                 2. check if coordinates are available
                 3. if available, print
                    if not available, prompt again (1)
                 4. print board
                 5. prompt player 2 for coordinates
                 6. check if coordinates is available
                 7. if available, print
                    if not available, prompt again (5)
                 8. if  final (9th) attempt, then quit (game is a draw)
                 */

