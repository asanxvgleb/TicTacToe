import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();

        Player player1 = new Player(new Scanner(System.in), Symbol.X);
        Player player2 = new Player(new Scanner(System.in), Symbol.O);

        GameLoop gameLoop = new GameLoop(board, player1, player2);
        gameLoop.runGame();
    }
}
