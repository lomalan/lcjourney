package graphs;

class SurroundedRegions {
    private int[][] directions = new int[][] {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };
    public void solve(char[][] board) {
        // Phase 1. Capturing non surended
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O' &&
                        ((i == 0 || i == board.length - 1)
                        || (j == 0 || j == board[i].length - 1))
                ) {
                    capture(i, j, board);
                }
            }
        }
        // Phase 2. Capturing surrended
        // Phase 3. Setting back temporary value
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O') {
                    // Phase 2
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'T') {
                    // Phase 3
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void capture(int currentRow, int currentColumn, char[][] grid) {
        var isOutOfBounds = currentRow < 0 || currentColumn < 0 || currentRow >= grid.length || currentColumn >= grid[0].length;
        if (isOutOfBounds || grid[currentRow][currentColumn] != 'O') {
            return;
        }

        grid[currentRow][currentColumn] = 'T';
        for (int[] direction : directions) {
            capture(
                    currentRow + direction[0],
                    currentColumn + direction[1],
                    grid
            );
        }
    }
}