package dp.td;

public class DistinctSubsequences {
    private Integer[][] dp;
    public int numDistinct(String s, String t) {
        dp = new Integer[s.length()][t.length()];
        return dfs(0, 0, s.toCharArray(), t.toCharArray());   
    }

    private int dfs(int i, int j, char[] s, char[] t) {
        if (j == t.length) {
            return 1;
        }
        if (i >= s.length || j >= t.length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int res = dfs(i + 1, j, s, t);
        if (s[i] == t[j]) {
            res += dfs(i + 1, j + 1, s, t);
        }
        dp[i][j] = res;
        return res;        
    }
}
