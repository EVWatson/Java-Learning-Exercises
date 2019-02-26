public class Game_board {

    public static void main(String[] args) {

//        board printing v1. note to self: when no string value is specified, each

        String[][] theGameBoard = new String[3][3];
//            theGameBoard[1][2] = "#";
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                theGameBoard[x][y] = "*";
                System.out.print(theGameBoard[x][y] + "     ");
            }
            System.out.println(" \n");
        }

        System.out.println();

        System.out.println(theGameBoard[1][1]);

        System.out.println();

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

        String[] miniArray = {"X", "X", "X"};

        changeArrayElement(miniArray);

    }

    public static void changeArrayElement (String [] miniArray) {
        int index = 0;
        char ch = '*';

        for (int x = 0; x < 2; x++) {

            StringBuilder newElement = new StringBuilder(miniArray[2]);
            newElement.setCharAt(index, ch);

            System.out.println("New array = " + newElement);

        }
    }
}
