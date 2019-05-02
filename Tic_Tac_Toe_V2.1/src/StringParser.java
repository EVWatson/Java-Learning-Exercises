public class StringParser {

    private String coordinates;
    private String currentBoardAsString;
    private String[][] currentBoard;

    public StringParser(){

        this.coordinates = coordinates;
        this.currentBoardAsString = getBoardStateAsString();

    }


    public int[] parseStringCoordsToInt(String playerInput) {
        String[] splitInput = playerInput.split(",");
        int x = Integer.parseInt(splitInput[0]);
        int y = Integer.parseInt(splitInput[1]);
        int[] intCoords = {x, y};
        return intCoords;
    }

//    TODO fix this method now its been moved from Board

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

}
