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



        int turns = 8;

        for (int i = 0; i <= turns; i ++) {
            String playerInput = screen.promptPlayer();

            int[] coords =  translateStrings.parseStringCoordsToInt(playerInput);

            theBoard.updateBoardSpace(coords[0], coords[1], P1.getToken());

            screen.printMessage(ConsoleView.MOVE_ACCEPTED_MESSAGE);

            screen.printCurrentBoard(translateStrings.formatBoardAsString(theBoard.getCurrentBoard()));

        }

    }

}
