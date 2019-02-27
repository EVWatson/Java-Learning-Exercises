import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game_board {

////    Back to multidimensional arraylists and methods that (hopefully) all me to change elements at specific points. Maybe..
//
//    static List create2DArrayList() {
//        ArrayList<ArrayList<String> > xy = new ArrayList<ArrayList<String> > ();
//
//        xy.add(new ArrayList<String>());
//        xy.get(0).add(0, "*");
//        xy.get(1).add(1, "*");
//        xy.get()



    public static void main(String[] args) {

//        board printing v1. **moved to gameboard 2

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
//
//        System.out.println(theGameBoard[1][1]);
//
//        theGameBoard[0][0] = "X";
//
//        System.out.print(theGameBoard[0][0]);
//
//        System.out.println();

//        swapping an element of the array for something else.
//        simple array first:

        String[] simpleArray = new String[3];
        for (int a = 0; a <= 2; a++) {
            simpleArray[a] = "#";
            System.out.print(simpleArray[a] + "   ");
        }

        System.out.println();

//        using StringBuilder and setCharAt to set a new char at a particular index

        String str = "# # #";

        int index = 2;

        char ch = '*';

        System.out.println("Original String = " + str);

        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch);

        System.out.println("Modified String = " + string);

        System.out.println();

        String[] shortArray = new String[3];
        for (int a = 0; a <= 2; a++) {
            shortArray[a] = "~";
            System.out.print(shortArray[a] + "   ");
        }

        System.out.println();



//        tried with array. complete waste of time. only works with a string, defeats the purpose of using an array.

//        String[] miniArray = {"X X X"};
//
//        changeArrayElement(miniArray);
//
//    }
//
//    public static void changeArrayElement (String [] miniArray) {
//
//        for (int x = 0; x < 2; x++) {
//            String theString = miniArray[x];
//            int index = 1;
//            char ch = '*';
//
//            StringBuilder newElement = new StringBuilder(theString);
//            newElement.setCharAt(index, ch);
//
//            System.out.println("New array = " + newElement);
//
//        }

//        trying arrays.asList

        String gameFields[] = new String[] {"*", "*", "*"};

        List row1 = Arrays.asList(gameFields);

        System.out.println("The first row is: " + row1);

        System.out.println();

        String allGameFields [][] = new String[][] {
                {"*", "*", "*"},
                {"*", "*", "*"},
                {"*", "*", "*"}
        };

//        doesn't work with 2d arrays

//        for (int i = 0; i <=2; i++) {
//            List rowFields = Arrays.asList(allGameFields);
//            for (int j= 0; j <=2; j++) {
//                List columnFields = Arrays.asList(allGameFields);
//                System.out.println("all game fields are: " + rowFields + columnFields);
//            }
//        }




    }
}
