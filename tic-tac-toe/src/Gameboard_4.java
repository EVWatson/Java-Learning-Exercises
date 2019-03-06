import java.util.Scanner;

public class Gameboard_4 {

    public static int[] chooseCoordinates() {
        Scanner chooseField = new Scanner(System.in);
        int index1 = chooseField.nextInt();
        int index2 = chooseField.nextInt();
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
        System.out.println("GAME OVER! There are no more spaces available! So who won? The Game? Both players? You Decide...");
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
        else if ((gameBoard[1][0].equals(playerToken)) && ((gameBoard[1][1].equals(playerToken))) && (gameBoard[2][1].equals(playerToken))) {
            return true;
        }
        else if ((gameBoard[0][2].equals(playerToken)) && ((gameBoard[1][2].equals(playerToken))) && (gameBoard[2][2].equals(playerToken))) {
            return true;
        }
        return false;
    }

    public static boolean checkRowsAndColumns(String playerToken, String[][] gameBoard) {
        if (checkRows(playerToken, gameBoard)) {
                return true;
        }
        else if (checkColumns(playerToken, gameBoard)) {
                return true;
        }
        else {
            return false;
        }

    }

    public static void main (String[]args) {

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

                    System.out.print(player + " enter co-ordinates: ");
                    int[] coordinates = chooseCoordinates();
                    boolean freeSpace = checkSquare(gameBoard, coordinates);

                    if (freeSpace) {
                        writeSquare(gameBoard, coordinates, token);
                        checkRowsAndColumns(token, gameBoard);
                        System.out.println(checkRowsAndColumns(token, gameBoard));
                        playerTurn++;
                    } else {
                        System.out.println("Space already taken, please choose other coordinates:");
                    }
                    printGameBoard(gameBoard);



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

//                add player 2

                /*
                1. prompt p1 for coords
                2. check if selected coords are available
                3.

                 */
            }

            gameIsADraw();

        }
    }

