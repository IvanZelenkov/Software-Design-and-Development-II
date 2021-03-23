package Chapter18Practice;

public class EightQueens {
    private static final int N = 8;
    private static int[][] chessboard = new int[N][N];

    public static void main(String[] args) {
        queenLocation(1, 0);
        printChess(chessboard);
    }

    public static boolean queenLocation(int queen, int column) {
        if (column >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isAttacking(chessboard, i, column)) {
                chessboard[i][column] = queen;

                if (queenLocation(queen + 1, column + 1))
                    return true;

                chessboard[i][column] = 0;
            }
        }
        return false;
    }

    public static boolean isAttacking(int[][] chess, int row, int column) {
        int i, j;

        // check the rows
        for (i = 0; i < N; i++) {
            if (chess[row][i] != 0)
                return false;
        }

        // check the columns
        for (i = 0; i < N; i++) {
            if (chess[i][column] != 0)
                return false;
        }

        // check the diagonals
        //  diagonal /
        j = column + 1;
        for (i = row - 1; (i >= 0 && j < N); i--, j++) {
            if (chess[i][j] != 0)
                return false;
        }

        j = column - 1;
        for (i = row + 1; (i < N && j >= 0); i++, j--) {
            if (chess[i][j] != 0)
                return false;
        }

        //   diagonal \
        j = column - 1;
        for (i = row - 1; (i >= 0 && j >= 0); i--, j--) {
            if (chess[i][j] != 0)
                return false;
        }

        j = column + 1;
        for (i = row + 1; (i < N && j < N); i++, j++) {
            if (chess[i][j] != 0)
                return false;
        }
        return true;
    }

    public static void printChess(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++)
                System.out.print(" " + chess[i][j] + " ");

            System.out.println();
        }
    }
}
