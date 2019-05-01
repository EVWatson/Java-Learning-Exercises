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

}
