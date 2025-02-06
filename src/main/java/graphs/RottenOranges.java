package graphs;

import java.util.Deque;
import java.util.LinkedList;

class RottenOranges {
    private static final int FRESH = 1;
    private static final int ROTTEN = 2;

    public int orangesRotting(int[][] grid) {
        // Phase 1 populate queue of initially rotten oranges
        int fresh = 0;
        Deque<int[]> rottenQueue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                var orangeState = grid[i][j];
                if (orangeState == ROTTEN) {
                    rottenQueue.add(new int[] {i, j});
                } else if(orangeState == FRESH) {
                    fresh++;
                }
            }
        }
        // define directions (for easy traverse)
        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        //define minutes
        int minutes = 0;
        // Phase 2 process every minute of rotting
        while (!rottenQueue.isEmpty() && fresh > 0) {
            minutes++;
            // Queue size is quantity of newly rotten oranges for every minute
            var rotten = rottenQueue.size();
            for (int i = 0; i < rotten; i++) {
                var current = rottenQueue.removeFirst();
                for (int[] direction: directions) {
                    var column = current[0] + direction[0];
                    var row = current[1] + direction[1];
                    var outOfBounds = column < 0 || row < 0 || column >= grid.length || row >= grid[column].length;
                    if (outOfBounds) {
                        continue;
                    }
                    var orangeState = grid[column][row];
                    if (orangeState == FRESH) {
                        grid[column][row] = 2;
                        fresh--;
                        rottenQueue.add(new int[] {column, row});
                    }
                }
            }
        }
        return fresh > 0 ? -1 : minutes;
    }
}