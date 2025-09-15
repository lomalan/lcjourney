package dp.td;

public class LongestCommonSubsequence {
    // Top-down approach
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        char[] c1 = text1.toCharArray();
        char[] c2 = text2.toCharArray();
        dp = new Integer[c1.length][c2.length];
        return dfs(0, 0, c1, c2);
    }

    private int dfs(int i, int j, char[] c1, char[] c2) {
        if (i >= c1.length || j >= c2.length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        
        if (c1[i] == c2[j]) {
            dp[i][j] = 1 + dfs(i + 1, j + 1, c1, c2); 
        } else {
            dp[i][j] = Math.max(dfs(i + 1, j, c1, c2), dfs(i, j + 1, c1, c2));
        }
        return dp[i][j];
    }
    
}
