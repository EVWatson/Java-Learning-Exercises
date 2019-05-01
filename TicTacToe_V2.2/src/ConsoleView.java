import java.util.Scanner;

public class ConsoleView {

/*
- gets player input (strings) by printing a prompt and taking in data
- sends data to ComputerResponse formatter
- prints ComputerResponse from computer to console

 */

private String requestPlayerInput;
private String ComputerResponse;

//does computerResponse need to be in the constructor?

public ConsoleView() {
    this.requestPlayerInput = promptPlayer();

}
//get player input
private String promptPlayer(){
    Scanner inputScanner = new Scanner(System.in);
    String playerInput = inputScanner.nextLine();
    return playerInput;
}

private void printMessage(String message){
    System.out.println(message);
}

    public String getRequestPlayerInput() {
        return requestPlayerInput;
    }

    public String getComputerResponse() {
        return ComputerResponse;
    }
}
