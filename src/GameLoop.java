public class GameLoop {
    private final Board board;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;

    public GameLoop(Board board, Player playerX, Player playerO) {
        this.board = board;
        this.playerX = playerX;
        this.playerO = playerO;
        this.currentPlayer = playerX;

    }

    public void runGame() {
        while (true) {
            int[] move = currentPlayer.getMove();
            board.makeMoveOnBoard(move[0], move[1], currentPlayer.getSymbol());
            board.printBoard();

            if (board.isWin(String.valueOf(currentPlayer.getSymbol()))) {
                System.out.println("Player " + currentPlayer.getSymbol() + " is win");
                break;
            }
            if (board.isFull()) {
                System.out.println("Draw");
                break;
            }
            switchPlayer();

        }
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }
}
