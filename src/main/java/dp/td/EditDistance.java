package dp.td;

public class EditDistance {
    Integer[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new Integer[word1.length()][word2.length()];
        return dfs(0, 0, word1.toCharArray(), word2.toCharArray());   
    }

    private int dfs(int i, int j, char[] c1, char[] c2) {
        if (i >= c1.length) {
            // imitate removal of the remaining chars
            return c2.length - j;
        }
        if (j >= c2.length) {
            // imitate insertion of the remaining chars
            return c1.length - i;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int res = 0;
        if (c1[i] == c2[j]) {
            dp[i][j] =  dfs(i + 1, j + 1, c1, c2);
        } else {
            res = Math.min(dfs(i + 1, j, c1, c2), dfs(i, j + 1, c1, c2));
            res = Math.min(dfs(i + 1, j + 1, c1, c2), res);
            dp[i][j] = res + 1;
        }

        return dp[i][j];
    }
    
}
