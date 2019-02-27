import java.util.Scanner;

//public class Game_Board_2 {

//    moved to gameboard 3:

//    public static void updateBoard(String[][] theGameBoard) {
//        for (int x = 0; x <= 2; x++) {
//            for (int y = 0; y <= 2; y++) {
//                System.out.print(theGameBoard[x][y] + "      ");
//            }
//            System.out.println("\n");
//        }
//    }

//    public static void main(String[] args) {

//        board printing v1.

//        moved to gameboard 3

//        String[][] theGameBoard = new String[3][3];
////            theGameBoard[1][2] = "#";
//        for (int x = 0; x <= 2; x++) {
//            for (int y = 0; y <= 2; y++) {
//                theGameBoard[x][y] = "*";
//                System.out.print(theGameBoard[x][y] + "     ");
//            }
//            System.out.println(" \n");
//        }
//
//        System.out.println();

//        System.out.println(theGameBoard[1][1]);

//        theGameBoard[0][0] = "X";

//        for (int x = 0; x <= 2; x++) {
//            for (int y = 0; y <= 2; y++) {
//                System.out.print(theGameBoard[x][y] + "      ");
//            }
//            System.out.println("\n");
//        }

//            updateBoard(theGameBoard);

//        System.out.print(theGameBoard[0][0]);

//        System.out.println();
//
//        Scanner changeSymbol = new Scanner(System.in);
//        System.out.print("place token: ");
//        String z = changeSymbol.next();
//
//        System.out.println();
//
//        theGameBoard[1][1] = z;
//
//            updateBoard(theGameBoard);
//
//            System.out.println();
//
//            String playerOneToken = "X";
//            String playerTwoToken = "O";
//
//            Scanner chooseField = new Scanner(System.in);
//            System.out.print("choose co-ordinates: ");
//            int index = chooseField.nextInt();
//
//            theGameBoard[index - 1][index - 1] = playerOneToken;
//
//            updateBoard(theGameBoard);
//
//            System.out.println();

//            Scanner enterCoordinates = new Scanner(System.in);
//            System.out.print("Enter coord x,y: ");

//            int x1 = index;





//        now need to imput coordinates instead of symbol.
//        also method for updating board so no need to keep re-writing loop.
//    }
//}
