import java.util.Scanner;

public class Board {

    private String[][] currentBoard;

    private int totalRows;
    private int totalColumns;
//    private String contentsOfBoardSpace;

    public Board(int totalRows, int totalColumns) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        // create board and assign to currentBoard
        this.currentBoard = createBoard(totalRows, totalColumns);
//        this.contentsOfBoardSpace = ;

    }

//    made createBoard public in order to test it

    private String[][] createBoard(int rowSize, int columnSize) {
        String[][] newBoard = new String[rowSize][columnSize];

        for (int row = 0; row < newBoard.length; row++) {
            for (int column = 0; column < newBoard[row].length; column++) {
                newBoard[row][column] = "*";

            }
        }

        return newBoard;
    }

    public String getBoardStateAsString() {
        String formattedBoard = "";
        for (int row = 0; row < currentBoard.length; row++) {
            for (int column = 0; column < currentBoard[row].length; column++) {
                if (column < currentBoard[row].length - 1) {
                    formattedBoard = formattedBoard.concat(currentBoard[row][column] + " ");
                } else {
                    formattedBoard = formattedBoard.concat(currentBoard[row][column]);
                }
            }
            if (row < currentBoard.length - 1) {
                formattedBoard = formattedBoard + "\n";
            }
        }
        return formattedBoard;
    }

//    private int convertInputToCoordinates(String userInput){
////
////
////    }

    // TODO 1. Write tests to implement update a board space
    public void updateBoardSpace(int x, int y, String token) {

        currentBoard[x - 1][y - 1] = token;
    }


    public String getBoardSpaceContents(int x, int y) {
        return currentBoard[x-1][y-1];
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
