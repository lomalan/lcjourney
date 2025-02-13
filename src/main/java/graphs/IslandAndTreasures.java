package graphs;

import java.util.Deque;
import java.util.LinkedList;

public class IslandAndTreasures {
    private static final int LAND = Integer.MAX_VALUE;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    boolean[][] visit;
    public void islandsAndTreasure(int[][] grid) {
        // Populate queue with treasures
        Deque<int[]> queue = new LinkedList<>();
        visit = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        // Do BFS with the step
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                var head = queue.removeFirst();
                for(int[] direction: directions) {
                    var x = head[0] + direction[0];
                    var y = head[1] + direction[1];
                    var outOfBounds = x < 0 || x >= grid.length || y < 0 || y >= grid[x].length;
                    if (outOfBounds || grid[x][y] != LAND) {
                        continue;
                    }
                    grid[x][y] = step;
                    queue.add(new int[]{x, y});
                }
            }
        }
    }
}
