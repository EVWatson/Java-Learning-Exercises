public class Board {

    private String[][] currentBoard;

    private int totalRows;
    private int totalColumns;

    public Board(int totalRows, int totalColumns) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        // create board and assign to currentBoard
        this.currentBoard = createBoard(totalRows, totalColumns);
    }

    private String[][] createBoard(int rowSize, int columnSize){
        String[][] newBoard = new String[rowSize][columnSize];

        for (int row = 0; row < newBoard.length; row ++) {
            for (int column = 0; column < newBoard[row].length; column++) {
                newBoard[row][column] = "*";
            }
        }

        return newBoard;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public String[][] getCurrentBoard() {
        return currentBoard;
    }


}
