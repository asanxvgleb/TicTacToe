import java.util.Scanner;

public class Player {
    private final Scanner scanner;
    private final Symbol symbol;

    public Player(Scanner scanner, Symbol symbol) {
        this.scanner = scanner;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public int[] getMove() {

        System.out.println("Enter coordinate for " + symbol + " (for example: 1)");
        int row = scanner.nextInt();
        System.out.println("Enter coordinate for " + symbol + " (for example: 2)");
        int col = scanner.nextInt();

        return new int[]{row, col};

    }
}

enum Symbol {
    X, O;
}
