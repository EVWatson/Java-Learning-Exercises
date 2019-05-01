public class Board {

    private String [][] newBoard;
    private String [][] currentBoard;

    private int rows;
    private int columns;

    public Board(){
        this.rows = 3;
        this.columns = 3;
        this.newBoard = createBoard(rows, columns);
//        this.currentBoard = updateBoard(...);
    }

    private String[][] createBoard(int rows, int columns){
        String[][] newBoard = new String[rows][columns];

        for (int row = 0; row < newBoard.length; row++) {
            for (int column = 0; column < newBoard[row].length; column++) {
                newBoard[row][column] = "*";
            }
        }
        return newBoard;
    }

    public void updateBoardSpace(int x, int y, String token) {

        currentBoard[x - 1][y - 1] = token;
    }

    public String[][] getNewBoard() {
        return newBoard;
    }

//    public String[][] getCurrentBoard() {
//        return currentBoard;
//    }
}
