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
//        System.out.println(position);
//        System.out.println(checkSquare(position));
//        gameBoard[index1 - 1][index2 - 1] = token;
//        return position;
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

    public static void printBoard(String[][] gameBoard) {
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.print(gameBoard[x][y] + "      ");
            }
            System.out.println("\n");
        }
    }

    public static String[][] initialiseBoard() {
        String[][] newBoard = new String[3][3];
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                    newBoard[x][y] = "*";
            }
        }
        return newBoard;
    }

    public static void main (String[]args){
//            String[][] gameBoard = new String[3][3];
//            for (int x = 0; x <= 2; x++) {
//                for (int y = 0; y <= 2; y++) {
//                    gameBoard[x][y] = "*";
//                }
//            }
            String[][] gameBoard = initialiseBoard();

            printBoard(gameBoard);

            System.out.println();

            int turns = 0;
            while (turns < 9) {
                System.out.print("\nPlayer 1 enter co-ordinates: ");
                int[] coordinates = chooseCoordinates();
                boolean freeSpace = checkSquare(gameBoard, coordinates);

                if (freeSpace == true) {
                    writeSquare(gameBoard, coordinates, "X");
                    turns++;
                }
                else {
                    System.out.println("Space already taken");
                }
                printBoard(gameBoard);


//                System.out.print("\nPlayer 2 enter co-ordinates: ");
//                chooseCoordinates(gameBoard, "O");
//                checkSquare(boardField, gameBoard);

//                turns++;
            }


        }
    }

