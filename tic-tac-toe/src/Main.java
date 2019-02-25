import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    add to array, take from array, change array, sort array

    public static String [] GetStringArray(ArrayList<String> arr) {
        String str[] = new String[arr.size()];
        for (int a = 0; a < arr.size(); a++) {
            str[a] = arr.get(a);
        }
        return str;
    }

    public static void main(String[] args) {

         ArrayList<String> firstList = new ArrayList<>();
         firstList.add("*");
         firstList.add("*");
         firstList.add("*");

         System.out.println("ArrayList: " + firstList);

         String[] str = GetStringArray(firstList);

         System.out.print("String Array[]: " + Arrays.toString(str));


//        String gameBoard[][] = {
//                {"*", "*", "*"},
//                {"*", "*", "*"},
//                {"*", "*", "*"}};

        String simpleGameBoard [] = new String [] {"*", "*", "*"};

        int index = 0;

        while (index <= 2) {
            System.out.print(simpleGameBoard[index] + "  ");
            index++;
        }

        System.out.println();

        int n = 3;

        ArrayList<Integer> newGameBoard = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i ++)
            newGameBoard.add(i);
        System.out.println(newGameBoard);

        System.out.println();

        ArrayList<String> anotherGameBoard = new ArrayList<>();
            anotherGameBoard.add("*");
            anotherGameBoard.add("*");
            anotherGameBoard.add("*");

            for (int i = 0; i <= 2; i ++)

            System.out.println(anotherGameBoard);


    }


}


