package dp.td;

public class LIPInMatrix {
   int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
   Integer[][] cache;
   public int longestIncreasingPath(int[][] matrix) {
        int res = 0;
        cache = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               res = Math.max(res, dfs(i, j, -1, matrix)); 
            }
        }
        return res;   
    }
    
    private int dfs(int i, int j, int prev, int[][] matrix) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] <= prev) {
            return 0;
        }
        if (cache[i][j] != null) {
            return cache[i][j];
        }
        int res = 0;
        for (int[] direction : directions) {
            res = Math.max(1 + dfs(i + direction[0], j + direction[1], matrix[i][j], matrix), res);   
        }
        cache[i][j] = res;
        return res;
    }
}
