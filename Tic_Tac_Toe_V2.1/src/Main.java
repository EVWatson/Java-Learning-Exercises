public class Main {

    public static void main(String[] args) {
//        Board board = new Board ( 3, 3);
//        board.getBoardStateAsString();
//        board.updateBoardSpace(1,1,"x");
//        board.getBoardStateAsString();


        ConsoleView screen = new ConsoleView();

//        Board theBoard = new Board(3, 3);

//        Player P1 = new Player("Player_1", "X");
//        Player P2 = new Player("Player_2", "O");

        Game playTTT = new Game();

        StringParser translateStrings = new StringParser();



        screen.printMessage(ConsoleView.WELCOME_MESSAGE);
        screen.printMessage(ConsoleView.BOARD_STATE_MESSAGE);

        String newBoard = translateStrings.formatBoardAsString(playTTT.getGameBoard().getCurrentBoard());

        screen.printCurrentBoard(newBoard);



//        this loop logic could go into consoleView? or maybe game... or both????

        int turns = 9;
        String currentPlayerName;
//        String currentPlayerToken;

        for (int i = 1; i <= turns; i ++) {
//            if (i % 2 == 0){
//                 currentPlayer = playTTT.getPlayer2().getName();
//                 currentPlayerToken = playTTT.getPlayer2().getToken();
//            } else {
//                currentPlayer = playTTT.getPlayer1().getName();
//                currentPlayerToken = playTTT.getPlayer1().getToken();
//            }

            currentPlayerName = playTTT.getNextPlayer().getName();
//            currentPlayerToken = playTTT.getNextPlayer().getToken();

            String playerInput = screen.promptPlayer(currentPlayerName);

            int[] coords =  translateStrings.parseStringCoordsToInt(playerInput);

//            theBoard.updateBoardSpace(coords[0], coords[1], currentPlayerToken);
            playTTT.applyMove(coords[0], coords[1]);

            screen.printMessage(ConsoleView.MOVE_ACCEPTED_MESSAGE);

//            screen.printCurrentBoard(translateStrings.formatBoardAsString(theBoard.getCurrentBoard()));
            screen.printCurrentBoard(translateStrings.formatBoardAsString(playTTT.getGameBoard().getCurrentBoard()));

        }

    }

}
