import java.util.Scanner;

public class Player {
    public Player(String gameToken) {
        System.out.println(gameToken);
    }



public static void main(String[] args) {
    Player player1 = new Player("X");
    Player player2 = new Player("O");


    System.out.println(player1);
    System.out.println(player2);
    
    System.out.println();


  }
}
// player1 goes first
//player2 goes second