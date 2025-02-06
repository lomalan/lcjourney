package graphs;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlantic {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // Phase 1. Initialise visited for both oceans and rows with columns
        int rows = heights.length;
        int columns =  heights[0].length;
        boolean[][] pacific = new boolean[rows][columns];
        boolean[][] atlantic = new boolean[rows][columns];

        /*
            We're doing this because PAC(Pacific), ATL(Atlantic)
                    PAC
            PAC ['][][]['] ATL
                ['][][][']
                ['][][][']
                    ATL
        */
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, i, columns - 1, Integer.MIN_VALUE, atlantic);
        }

        /*
            We're doing this because PAC(Pacific), ATL(Atlantic)
                     PAC
            PAC [']['][']['] ATL
                [][][][]
                ['][']['][']
                     ATL
        */
        for (int i = 0; i < columns; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacific);
            dfs(heights, rows - 1, i, Integer.MIN_VALUE, atlantic);
        }

        //Phase 3. Check intersections
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }
        return result;
    }

    // Dfs part
    private void dfs(int[][] grid, int currentRow, int currentColumn, int prevVal, boolean[][] ocean) {
        var outOfBounds = currentRow < 0 || currentColumn < 0 || currentRow >= grid.length || currentColumn >= grid[0].length;
        if (outOfBounds || ocean[currentRow][currentColumn] || grid[currentRow][currentColumn] < prevVal) {
            return;
        }
        ocean[currentRow][currentColumn] = true;
        dfs(grid, currentRow + 1, currentColumn, grid[currentRow][currentColumn], ocean);
        dfs(grid, currentRow - 1, currentColumn, grid[currentRow][currentColumn], ocean);
        dfs(grid, currentRow, currentColumn + 1, grid[currentRow][currentColumn], ocean);
        dfs(grid, currentRow, currentColumn - 1, grid[currentRow][currentColumn], ocean);
    }
}