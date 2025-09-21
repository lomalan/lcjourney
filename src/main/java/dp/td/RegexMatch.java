package dp.td;

public class RegexMatch {
    Boolean[][] dp;
   public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(0, 0, s.toCharArray(), p.toCharArray());   
    }
    
    private boolean dfs(int i, int j, char[] s, char[] p) {
        if (j == p.length) {
            return i == s.length;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        boolean isMatch = i < s.length && (s[i] == p[j] || p[j] == '.');
        
        boolean res = false;
        if (j + 1 < p.length && p[j + 1] == '*') {
            res = (dfs(i, j + 2, s, p)) || (isMatch && dfs(i + 1, j, s, p));
        } else {
            res = isMatch && dfs(i + 1, j + 1, s, p);
        }
        dp[i][j] = res;
        return res;
    }
}
