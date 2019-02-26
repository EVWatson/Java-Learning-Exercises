import java.util.Arrays;
import java.util.Scanner;

public class Array_loop_experiments {

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

        int newArray[] = makeArray();

        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");

        int new2DArray[][] = create2DArray();

        System.out.println();

        for (int i = 0; i < new2DArray.length; i++) {
            for (int j = 0; j < new2DArray.length; j++) {
                System.out.print(new2DArray[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

        int newVanillaArray[] = createNewVanillaArray();

        for (int i = 0; i < newVanillaArray.length; i++)
            System.out.print(newVanillaArray[i] + " ");

        System.out.println();

        int makeYourOwn2DArray[][] = createYourOwn2DArray();

        for (int i = 0; i <makeYourOwn2DArray.length; i++) {
            for (int j = 0; j <makeYourOwn2DArray.length; j++){
                System.out.print(makeYourOwn2DArray[i][j] + " ");
            }
        } System.out.println();
    }

//    sort of works. doesn't really create  new array, wont' let you enter too many numbers

    public static int[][] createYourOwn2DArray() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("enter array values: ");
        int inputValues1 = getInput.nextInt();
        return new int [][] {{inputValues1, inputValues1, inputValues1}};
    }

    public static int[] makeArray() {
        return new int[]{1, 2, 3};
    }

    public static int[][] create2DArray() {
        return new int[][]{{8, 8, 8}, {8, 8, 8}, {8, 8, 8}};
    }

//better way to do this??? sort of works. convert string to int?

    public static int[] createNewVanillaArray() {
        Scanner getInput = new Scanner(System.in);
        System.out.println("enter 3 array values: ");
        int enterValues = getInput.nextInt();
        return new int [] {enterValues};
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

        String[][] boardOfStrings = new String[3][3];
//            boardOfStrings[1][2] = "hello";

        for (int a = 0; a <= 2; a++) {
            for (int b = 0; b <= 2; b++) {
                boardOfStrings[a][b] = "*";
                System.out.print(boardOfStrings[a][b] + " ");
            }
            System.out.println();

        }

//        System.out.println(Arrays.deepToString(boardOfStrings));
    }



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


