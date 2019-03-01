import java.util.Scanner;

public class Gameboard_4 {

    public static void p1ChooseCoordinates(String [][] gameBoard) {
        String playerOneToken = "X";

        Scanner chooseField = new Scanner(System.in);
        System.out.print("\nPlayer 1 enter co-ordinates: ");
        int index1 = chooseField.nextInt();
        int index2 = chooseField.nextInt();

        String position = gameBoard[index1-1][index2-1];
        System.out.println(position);
        System.out.println(checkSquare(position));


        gameBoard[index1 - 1][index2 - 1] = playerOneToken;
    }

    public static void p2ChooseCoordinates(String [][] gameBoard) {
        String playerTwoToken = "O";

                Scanner chooseField = new Scanner(System.in);
                System.out.print("\nPlayer 2 enter co-ordinates: ");
                int index1 = chooseField.nextInt();
                int index2 = chooseField.nextInt();

                    gameBoard[index1 - 1][index2 - 1] = playerTwoToken;
        }

        public static boolean checkSquare(String boardField) {
            if (boardField.equals("*")) {
                return true;
            }
            return false;
//            return boardField.equals("*");
        }


    public static void updateBoard(String[][] gameBoard) {
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.print(gameBoard[x][y] + "      ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {


        String[][] gameBoard = new String[3][3];
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                gameBoard[x][y] = "*";
                System.out.print(gameBoard[x][y] + "     ");
            }
            System.out.println(" \n");
        }



        System.out.println();

        int turns = 0;
        while (turns < 9) {
                p1ChooseCoordinates(gameBoard);
                updateBoard(gameBoard);
                turns ++;

                p2ChooseCoordinates(gameBoard);
                updateBoard(gameBoard);

                turns ++;
        }


    }
}
