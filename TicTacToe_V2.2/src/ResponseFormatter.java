public class ResponseFormatter {

/*
- takes string input from console view
- if input is 'n,n', converts to ints
- if input is q, stays as string

- also takes response from computer, and turns it back into a string to be outputted to screen via console view
 */

    private String standardInput;
//    private String computerOutput?; where will this come from?

    public ResponseFormatter(){
        this.standardInput = new ConsoleView().getRequestPlayerInput();
    }

//    possible case statement for if a player response is 'q'?
    private int[] parseStringCoordinatesToInt(String playerInput){
        String[] splitInput = playerInput.split(",");
        int x = Integer.parseInt(splitInput[0]);
        int y = Integer.parseInt(splitInput[1]);
        int[] intCoords = {x, y};
        return intCoords;
    }

}
