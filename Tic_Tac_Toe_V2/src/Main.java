import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<GamePlayers> currentGamePlayers = Arrays.asList(
                new GamePlayers("Player 1", "X"),
                new GamePlayers("Player 2", "O")
        );

        for(GamePlayers p : currentGamePlayers ) {
            System.out.println(p.getPlayer() + " " + p.getPlayerToken());
        }

        GamePrompts.printGameBeginning();

        String [][] drawGameBoard = {{"*"}};

        PlayGame newGameBoard = new PlayGame(drawGameBoard);



        System.out.println(newGameBoard);
    }
}
