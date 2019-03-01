import java.util.Scanner;

public class Game_Board_3 {

//    public static void chooseCoordinates(String [][] gameBoard) {
//        String playerOneToken = "X";
//        String playerTwoToken = "O";
//
//        int i = 0;
//        while (i < 9) {
//            int j = 0;
//            while (j < 9) {
//                Scanner chooseField = new Scanner(System.in);
//                System.out.print("\nPlayer enter co-ordinates: ");
//                int index1 = chooseField.nextInt();
//                int index2 = chooseField.nextInt();
//
//                 if ((j + 1) % 2 == 0) {
//                    gameBoard[index1 - 1][index2 - 1] = playerTwoToken;
//                    updateBoard(gameBoard);
//                } else {
//                    gameBoard[index1 - 1][index2 - 1] = playerOneToken;
//                    updateBoard(gameBoard);
//                }
//
//                j++;
//                i++;
//            }
//        }
//    }
//
//    public static void updateBoard(String[][] gameBoard) {
//        for (int x = 0; x <= 2; x++) {
//            for (int y = 0; y <= 2; y++) {
//                System.out.print(gameBoard[x][y] + "      ");
//            }
//            System.out.println("\n");
//        }
//    }
//
//    public static void main(String[] args) {
//
////        String p1 = "Player 1 ";
////        String p2 = "Player 2 ";
//
//        String[][] gameBoard = new String[3][3];
//        for (int x = 0; x <= 2; x++) {
//            for (int y = 0; y <= 2; y++) {
//                gameBoard[x][y] = "*";
//                System.out.print(gameBoard[x][y] + "     ");
//            }
//            System.out.println(" \n");
//        }
//
//        System.out.println();
//
//        chooseCoordinates(gameBoard);
//
//
//    }
}
