package graphs;

public class NumOfIslands {

    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    search(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    void search(char[][] grid, int i, int j) {
        var isOutOfBorders =
            i < 0 || i >= grid.length || j < 0 || j >= grid[i].length;
        if (isOutOfBorders) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        search(grid, i - 1, j);
        search(grid, i + 1, j);
        search(grid, i, j - 1);
        search(grid, i, j + 1);
    }
}
