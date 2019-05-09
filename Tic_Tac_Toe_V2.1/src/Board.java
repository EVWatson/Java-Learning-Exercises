import java.util.Scanner;

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


    private String[][] createBoard(int rowSize, int columnSize) {
        String[][] newBoard = new String[rowSize][columnSize];

        for (int row = 0; row < newBoard.length; row++) {
            for (int column = 0; column < newBoard[row].length; column++) {
                newBoard[row][column] = "*";

            }
        }

        return newBoard;
    }



    // TODO 1. Write tests to implement update a board space

//    why is update boardspace in board, but apply move is in game? aren't they the same thing?
    public void updateBoardSpace(int x, int y, String token) {

        currentBoard[x - 1][y - 1] = token;
    }

    public String getBoardSpaceContents(int x, int y) {

        return currentBoard[x-1][y-1];
    }

    public boolean isBoardSpaceFree(int x, int y){

        return getBoardSpaceContents(x, y).equals( "*");
    }


    public String[] getRowContents (String[][] currentBoard){
        String[] rowContents = {};
        for (int row = 0; row < currentBoard.length; row++){
            rowContents = currentBoard[row];
        }
        return rowContents;
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
