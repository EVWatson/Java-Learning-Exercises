import java.util.Scanner;

public class Player {
    public Player(String gameToken) {
        System.out.println(gameToken);
    }
    public static void main(String[] args) {
        Player player1 = new Player("X");
        Player player2 = new Player("O");
    }

    Scanner getInput = new Scanner(System.in);
    System.out.println("enter a coord x,y to place your X or enter 'q' to give up: " );
    getInput.nextLine();
    public static int makeMove (int player1) {

        return ;
    }

}
