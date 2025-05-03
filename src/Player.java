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

        while (true) {
            System.out.println("Enter coordinate for " + symbol + " (for example: 1)");
            int row = scanner.nextInt();
            if (isCoordinateIncorrect(row)) {
                System.out.println("Invalid input");
                continue;
            }
            System.out.println("Enter coordinate for " + symbol + " (for example: 2)");
            int col = scanner.nextInt();
            if (isCoordinateIncorrect(col)) {
                System.out.println("Invalid input");
                continue;
            }
            return new int[]{row, col};
        }

    }

    public boolean isCoordinateIncorrect(int x) {
        return x < 0 || x > 2;
    }
}

enum Symbol {
    X, O;
}
