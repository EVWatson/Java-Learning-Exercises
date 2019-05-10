public class Game {

    private Integer numberOfMoves;
    private boolean isCompleted;
    private Player winner;
    private Board gameBoard;
    private Player player1;
    private Player player2;
    private Player nextPlayer;



    public Game() {
        this.numberOfMoves = 0;
//        this.isCompleted = false;
        this.winner = null;
        this.gameBoard = new Board(3, 3);
        this.player1 = new Player("Player1", "X");
        this.player2 = new Player("Player2", "O");
        this.nextPlayer = this.player1;

//        nextplayer is confusing when you need the 'current player'

    }

//    places player token

    public void applyMove (int x, int y){
        this.gameBoard.updateBoardSpace(x, y, this.nextPlayer.getToken());
        if(this.nextPlayer == this.player2){
            this.nextPlayer = this.player1;
        } else {
            this.nextPlayer = this.player2;
        }
        this.numberOfMoves += 1;
    }

//    public Integer getNumberOfMoves() {
//        return numberOfMoves;
//    }

//    TODO 1. write test for what i expect
//    2. send test as code snippet to channel
//    3. where might the win checks go?

//    rename to 'should game continue'?
    public boolean isGameComplete() {
        if(this.hasPlayerWon()){
            return true;
        } if(this.numberOfMoves == 9){
            return true;
        }
//        if (this.winner != null) {
//            return true;
//        }
        // number of moves < 9
        // the winner
        // quit (potentially ignore for now)
        return false;
    }

    public boolean hasPlayerWon() {

        if(checkAllRows(player1.getToken()) || checkAllRows(player2.getToken())){
            return true;
        } if(checkAllColumns(player1.getToken()) || checkAllColumns(player2.getToken())){
            return true;
        } if (checkAllDiagonals(player1.getToken()) || checkAllDiagonals(player2.getToken())) {
            return true;
        }
        return false;
    }


    private boolean checkAllRows(String token){
        String[][] currentBoard = this.gameBoard.getCurrentBoard();
        if (currentBoard[0][0].equals(token) && currentBoard[0][1].equals(token) && currentBoard[0][2].equals(token)) {
            return true;
        } else if (currentBoard[1][0].equals(token) && currentBoard[1][1].equals(token) && currentBoard[1][2].equals(token)) {
            return true;
        } else if (currentBoard[2][0].equals(token) && currentBoard[2][1].equals(token) && currentBoard[2][2].equals(token)) {
            return true;
        }
        return false;
    }

    private boolean checkAllColumns(String token){
        String[][] currentBoard = this.gameBoard.getCurrentBoard();
        if (currentBoard[0][0].equals(token) && currentBoard[1][0].equals(token) && currentBoard[2][0].equals(token)) {
            return true;
        } else if (currentBoard[0][1].equals(token) && currentBoard[1][1].equals(token) && currentBoard[2][1].equals(token)) {
            return true;
        } else if (currentBoard[0][2].equals(token) && currentBoard[1][2].equals(token) && currentBoard[2][2].equals(token)) {
            return true;
        }
        return false;
    }

    private boolean checkAllDiagonals(String token){
        String[][] currentBoard = this.gameBoard.getCurrentBoard();
        if (currentBoard[0][0].equals(token) && currentBoard[1][1].equals(token) && currentBoard[2][2].equals(token)) {
            return true;
        }else if (currentBoard[0][2].equals(token) && currentBoard[1][1].equals(token) && currentBoard[2][0].equals(token)) {
            return true;
        }
        return false;
    }

    /*
        wincheck:
        - get current board, if no rows/columns/diagonals of three of the same token exist, game continues
        - if there are still free spaces, game continues

         */


    public Player getWinner() {
        return winner;
    }

    public Board getGameBoard() {

        return gameBoard;
    }

    public Player getPlayer1() {

        return player1;
    }

    public Player getPlayer2() {

        return player2;
    }

    public Player getNextPlayer() {

        return this.nextPlayer;
    }
}
