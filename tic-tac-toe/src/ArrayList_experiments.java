import javax.imageio.metadata.IIOInvalidTreeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_experiments {

//    method to turn a string into an arraylist
//    takes an array list and an array(?)

    public static String [] GetStringArray(ArrayList<String> arr) {
        String str[] = new String[arr.size()];
        for (int a = 0; a < arr.size(); a++) {
            str[a] = arr.get(a);
        }
        return str;
    }

    public static void main(String[] args) {

//        new array list that adds strings

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("*");
        firstList.add("*");
        firstList.add("*");

//        printing the above arraylist:

        System.out.println("ArrayList: " + firstList);

//        creating new string array by calling getstringarray method and giving it the firstList array as an argument

        String[] str = GetStringArray(firstList);

        System.out.print("String Array[]: " + Arrays.toString(str));


//        String gameBoard[][] = {
//                {"*", "*", "*"},
//                {"*", "*", "*"},
//                {"*", "*", "*"}};

        System.out.println();

//        new simple array

        String simpleGameBoard [] = new String [] {"*", "*", "*"};

//        while loop to print above array:

        int index = 0;

        while (index <= 2) {
            System.out.print(simpleGameBoard[index] + "  ");
            index++;
        }

        System.out.println();

//        creating new array list. int n = 3 states how many indexes there are.
//        for loop adds an int at each index
//        newGameBoard prints as arraylist
//        .remove removes an int at specified index
//        prints newGameBoard sans removed index

        int n = 3;

        ArrayList<Integer> newGameBoard = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i ++)
            newGameBoard.add(i);
        System.out.println(newGameBoard);
            newGameBoard.remove(2);
            System.out.println(newGameBoard);

//            new for loop gets the array list and prints the elements one by one

            for (int k = 0; k <newGameBoard.size(); k++)
                System.out.print(newGameBoard.get(k) + " ");

        System.out.println();

//         new arrayList
//         added * strings to arraylist


        ArrayList<String> anotherGameBoard = new ArrayList<>();
//        add horizontally
        anotherGameBoard.add("*");
        anotherGameBoard.add("*");
        anotherGameBoard.add("*");
//        anotherGameBoard.add("*" + " " + "*" + " " + "*");

//        for loop prints out arraylist. seems to print out strings added per line (kind of creates a multi-dimentional array?), with commas
//        if you add all within the one bracket eg anotherGameBoard.add("*" + " " + "*" + " " + "*");, it prints each 'array' in [] but without the commas
//        i <= 2 add vertically

        for (int i = 0; i <= 2; i ++)

            System.out.println(anotherGameBoard);

//        for loop for printing out board as strings rather than arraylists. only prints out one line of *'s

        for (int b = 0; b <anotherGameBoard.size(); b++) {
            System.out.print(anotherGameBoard.get(b) + "  ");
        }

        System.out.println();
        System.out.println();

//        an array of an arraylist (like a 2d array. however, comes with a warning according to geeks for geeks):

//        number of rows:
        int number = 3;

        ArrayList<Integer> [] yetAnotherArrayList = new ArrayList[n];

        for (int i = 0; i < n; i ++) {
            yetAnotherArrayList[i] = new ArrayList<Integer>();
        }

//        adding columns to my rows:

        yetAnotherArrayList[0].add(1);
        yetAnotherArrayList[0].add(1);
        yetAnotherArrayList[0].add(1);
        yetAnotherArrayList[1].add(2);
        yetAnotherArrayList[1].add(2);
        yetAnotherArrayList[1].add(2);
        yetAnotherArrayList[2].add(3);
        yetAnotherArrayList[2].add(3);
        yetAnotherArrayList[2].add(3);

//        loop to print out elements of arraylists:

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < yetAnotherArrayList[i].size(); j++) {
                System.out.print(yetAnotherArrayList[i].get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

//         arraylist of arraylist

//        could try String rows = "*"??

        int rows = 3;

//        master list:

        ArrayList<ArrayList<Integer> > masterList = new ArrayList<ArrayList<Integer>>(rows);

//        individual lists to be appended to master list:

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(1);
        a1.add(1);
        masterList.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(2);
        a2.add(2);
        a2.add(2);
        masterList.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(3);
        a3.add(3);
        a3.add(3);
        masterList.add(a3);

        for (int i = 0; i < masterList.size(); i++) {
            for (int j = 0; j < masterList.get(i).size(); j++) {
                System.out.print(masterList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

//        string version:

        int stringRows = 3;

        ArrayList<ArrayList<String> > mainList = new ArrayList<ArrayList<String>>(stringRows);

        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("*");
        l1.add("*");
        l1.add("*");
        mainList.add(l1);

        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("#");
        l2.add("#");
        l2.add("#");
        mainList.add(l2);

        ArrayList<String> l3 = new ArrayList<String>();
        l3.add("&");
        l3.add("&");
        l3.add("&");
        mainList.add(l3);

        for (int x = 0; x < mainList.size(); x++) {
            for (int y = 0; y < mainList.get(x).size(); y++) {
                System.out.print(mainList.get(x).get(y) + " ");
            }
            System.out.println();
        }

//        string variation works!!!

    }
}
