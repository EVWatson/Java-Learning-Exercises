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

    public static void main (String[]args){

            String[][] gameBoard = setUpGameBoard();

            printGameBoard(gameBoard);


            int gameRound = 1;

//            replace <= 9 with a method

            while (gameRound <= 9) {

                String player;
                String token;

                if (isPlayer1Turn(gameRound)) {
                    player = "Player 1";
                    token = "X";
                } else {
                    player = "Player 2";
                    token = "O";
                }

                    System.out.print(player + " enter co-ordinates: ");
                    int[] coordinates = chooseCoordinates();
                    boolean freeSpace = checkSquare(gameBoard, coordinates);

                    if (freeSpace == true) {
                        writeSquare(gameBoard, coordinates, token);
                        gameRound++;
                    } else {
                        System.out.println("Space already taken, please choose other coordinates:");
                    }
                    printGameBoard(gameBoard);



                /*
                 1. prompt player 1 for coordinates
                 2. check if coordinates is available
                 3. if available, print
                    if not available, prompt again (1)
                 4. print board
                 5. prompt player 2 for coordinates
                 6. check if coordinates is available
                 7. if available, print
                    if not available, prompt again (5)
                 8. if  final (9th) attempt, then quit
                 */

//                add player 2
            }


        }
    }

