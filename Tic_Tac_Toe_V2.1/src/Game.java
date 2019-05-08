public class Game {

    private Integer numberOfMoves;
    private boolean isCompleted;
    private Player winner;
//    private Board gameBoard;
//    private Player player1;
//    private Player player2;
//    private Player nextPlayer;



    public Game() {
        this.numberOfMoves = 0;
        this.isCompleted = false;
        this.winner = null;
//        this.gameBoard = new Board(3, 3);
//        this.player1 = new Player("Player1", "X");
//        this.player2 = new Player("Player2", "O");
//        this.nextPlayer = this.player1;

    }

//    places player token

//    public void applyMove (int x, int y){
//
//        this.gameBoard.updateBoardSpace(x, y, this.nextPlayer.getToken());
//    }




    public Integer getNumberOfMoves() {

        return numberOfMoves;
    }

    public boolean getIsCompleted() {

        return isCompleted;
    }

    public Player getWinner() {

        return winner;
    }

//    public Board getGameBoard() {
//
//        return gameBoard;
//    }
//
//    public Player getPlayer1() {
//
//        return player1;
//    }
//
//    public Player getPlayer2() {
//
//        return player2;
//    }
//
//    public Player getNextPlayer() {
//
//        return this.nextPlayer;
//    }
}
