public class Main {

    public static void main(String[] args) {
//        Board board = new Board ( 3, 3);
//        board.getBoardStateAsString();
//        board.updateBoardSpace(1,1,"x");
//        board.getBoardStateAsString();


        ConsoleView screen = new ConsoleView();

        Board theBoard = new Board(3, 3);

        Player P1 = new Player("Player_1", "X");
        Player P2 = new Player("Player_2", "O");

        Game playTTT = new Game();

        StringParser translateStrings = new StringParser();



        screen.printMessage(ConsoleView.WELCOME_MESSAGE);
        screen.printMessage(ConsoleView.BOARD_STATE_MESSAGE);

        String newBoard = translateStrings.formatBoardAsString(theBoard.getCurrentBoard());

        screen.printCurrentBoard(newBoard);



//        this loop logic could go into consoleView?

        int turns = 9;
        String currentPlayer;
        String currentPlayerToken;

        for (int i = 1; i <= turns; i ++) {
            if (i % 2 == 0){
                 currentPlayer = P2.getName();
                 currentPlayerToken = P2.getToken();
            } else {
                currentPlayer = P1.getName();
                currentPlayerToken = P1.getToken();
            }

            String playerInput = screen.promptPlayer(currentPlayer);

            int[] coords =  translateStrings.parseStringCoordsToInt(playerInput);

            theBoard.updateBoardSpace(coords[0], coords[1], currentPlayerToken);

            screen.printMessage(ConsoleView.MOVE_ACCEPTED_MESSAGE);

            screen.printCurrentBoard(translateStrings.formatBoardAsString(theBoard.getCurrentBoard()));

        }

    }

}
