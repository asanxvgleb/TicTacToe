public class Board {
    private final String[][] board = new String[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void printBoard() {
        System.out.println("Board: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void makeMoveOnBoard(int x, int y, Symbol symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[x][y] = String.valueOf(symbol);
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String EMPTY_CELL = " ";
                if (EMPTY_CELL.equals(board[i][j]))
                    return false;
            }
        }
        return true;
    }

    public boolean isWin(String symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(symbol)
                    && board[i][1].equals(symbol)
                    && board[i][2].equals(symbol))
                return true;
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(symbol)
                    && board[1][j].equals(symbol)
                    && board[2][j].equals(symbol))
                return true;
        }
        if (board[0][0].equals(symbol)
                && board[1][1].equals(symbol)
                && board[2][2].equals(symbol))
            return true;
        if (board[0][2].equals(symbol)
                && board[1][1].equals(symbol)
                && board[2][0].equals(symbol))
            return true;

        return false;
    }
}
