public class StringParser {


    private String returnStringValue;
    private int returnIntValue;

    public StringParser(){

    }


    public int[] parseStringCoordsToInt(String playerInput) {
        String[] splitInput = playerInput.split(",");
        int x = Integer.parseInt(splitInput[0]);
        int y = Integer.parseInt(splitInput[1]);
        int[] intCoords = {x, y};
        return intCoords;
    }

//    TODO fix this method now its been moved from Board

    public String formatBoardAsString(String [][] currentBoard) {
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

}
