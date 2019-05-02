public class StringParser {

    private String coordinates;

    public StringParser(){

        this.coordinates = coordinates;
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
        for (int row = 0; row < Board.getCurrentBoard.length; row++) {
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
