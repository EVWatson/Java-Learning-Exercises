public class Game_board {

    public static void main(String[] args) {

        String[][] theGameBoard = new String[3][3];
//            theGameBoard[1][2] = "hello";
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                theGameBoard[x][y] = "*";
                System.out.print(theGameBoard[x][y] + "    ");
            }
            System.out.println(" \n");
        }



    }
}
