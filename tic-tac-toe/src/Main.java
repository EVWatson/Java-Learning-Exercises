import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String gameBoard = "\n *   *   * " + "\n *   *   * " + "\n *   *   * ";

        String[][] gameBoard = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

//        String[] row = new String[]{
//                 "*", "*", "*"
//        };

        for (int index = 0; index <= 2; index = index + 1) {
            String[] row = gameBoard[index];
            System.out.println(row[0] + "  " + row[1] + "  " + row[2]);
        }

        System.out.println();

        int[][] gameBoard2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        for(int index = 0; index <= 2; index = index + 1) {
//            int[] row = gameBoard2[index];
//            System.out.println((row[0]+ 1) + "  " + (row[1] + 1) + "  " + (row[2] + 1));
//        }

        for (int index = 0; index <= 2; index = index + 1) {
            int[] row = gameBoard2[index];
            System.out.println((row[0] + 1) + "  " + (row[1] + 1) + "  " + (row[2] + 1));
        }

        System.out.println();

        String gameBoard3[][] = {{"*", "*", "*"}, {"*", "*", "*"}, {"*", "*", "*"}};

        for (int index = 0; index <= 2; index = index + 1) {
            for (int i = 0; i <= 2; i = i + 1)
                System.out.print(gameBoard3[index][i] + "  ");
            System.out.println();
        }

        System.out.println();

        int gameBoard4[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int gameBoard5[][] = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

//        for(int index = 0; index <= 2; index = index + 1) {
//            for (int i=0; i <=2; i = i + 1)
//                System.out.print(gameBoard4[index][i] + "  ");
//            System.out.println();
//        }

        System.out.println();

        int randomArray[] = {1, 2, 3};

        addArrayTogether(randomArray);

        sumOfArrayValues(gameBoard4);

        totalArrayValues(gameBoard5);

    }

    public static void addArrayTogether(int[] randomArray) {
        int i = 0;
        int addArrayTogether = 0;
        while (i <= 2) {
            addArrayTogether += randomArray[i];
            i = i + 1;
        }
//        for (int i = 0; i <= 2; i = i + 1)
//            addArrayTogether += randomArray[i];
        System.out.println("sum of all array values: " + addArrayTogether);

    }


    public static void sumOfArrayValues(int[][] gameBoard4) {
        int sumOfArrayValues = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                sumOfArrayValues += gameBoard4[i][j];
            }
        }
        System.out.println("sum of all array values: " + sumOfArrayValues);
    }

    public static void totalArrayValues(int [][] gameBoard5) {
        int totalArrayValues = 0;
        int i = 0;
        while (i <= 2) {
            int j = 0;
            while (j <= 2) {
                totalArrayValues += gameBoard5[i][j];
                j = j + 1;
            }
            i = i + 1;
        }
        System.out.println("sum of all array values: " + totalArrayValues);
    }

//    int gameBoard5[][] = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };








//        Scanner getInput = new Scanner(System.in);
//        System.out.println("\n choose a coordinate");
//        int chooseCoordinates = getInput.() + getInput.nextInt();
//
//        System.out.println("You chose " + chooseCoordinates);


//


//        System.out.println(gameBoard[0][0]);
//        ["*", "*", "*"];

//        System.out.println("\nWelcome to Tic Tac Toe!\n" + "\nHere's the current board: \n" + gameBoard);
//
//
//        Scanner getInput = new Scanner(System.in);
//        System.out.println("\n enter a coord x,y to place your X or enter 'q' to give up: " );
//        String chooseBoardField = getInput.nextLine();
//
//        System.out.println(chooseBoardField);

}
