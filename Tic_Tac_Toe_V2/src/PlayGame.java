public class PlayGame {

    String gameBoardFields;

    PlayGame(String [][] gameBoard) {
        this.gameBoardFields = gameBoard[1][1];
    }

    public String getGameBoardFields() {
        return gameBoardFields;
    }
}
