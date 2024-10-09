package graphs;

public class MaxIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, islandArea(i, j, grid));
                }
            }
        }
        return maxArea;
    }

    private int islandArea(int i, int j, int[][] grid) {
        var isOutOfBounds = i >= grid.length || i < 0 || j < 0 || j >= grid[i].length;
        if (isOutOfBounds) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        var bottom = islandArea(i + 1, j, grid);
        var right = islandArea(i, j + 1, grid);
        var up = islandArea(i - 1, j, grid);
        var left = islandArea(i, j - 1, grid);

        return 1 + bottom + right + up + left;
    }
}
