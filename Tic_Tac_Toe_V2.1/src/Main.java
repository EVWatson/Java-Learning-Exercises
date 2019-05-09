public class Main {

    public static void main(String[] args) {

        ConsoleView screen = new ConsoleView();

        Game playTTT = new Game();

        InputParser translateStrings = new InputParser();



        screen.printMessage(ConsoleView.WELCOME_MESSAGE);
        screen.printMessage(ConsoleView.BOARD_STATE_MESSAGE);

        String newBoard = translateStrings.formatBoardAsString(playTTT.getGameBoard().getCurrentBoard());

        screen.printCurrentBoard(newBoard);



//        this loop logic could go into consoleView? or maybe game... or both????

        String currentPlayerName;

        while (playTTT.isGameComplete()) {
            currentPlayerName = playTTT.getNextPlayer().getName();
            String playerInput = screen.promptPlayer(currentPlayerName);

            int[] coords =  translateStrings.parseStringCoordsToInt(playerInput);

            playTTT.applyMove(coords[0], coords[1]);

            screen.printMessage(ConsoleView.MOVE_ACCEPTED_MESSAGE);

            screen.printCurrentBoard(translateStrings.formatBoardAsString(playTTT.getGameBoard().getCurrentBoard()));
        }

        //

    }

}
