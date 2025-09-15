package dp.td;

public class InterleavingString {
    Boolean[][] cache;
     public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        cache = new Boolean[s3.length()][s3.length()];
        return dfs(0, 0, s1.toCharArray(), s2.toCharArray(), s3.toCharArray());   
    }
    
    private boolean dfs(int i, int j, char[] c1, char[] c2, char[] c3) {
        int x = i + j; 
        if (x == c3.length) {
            return true;
        }
        
        if (cache[i][j] != null) {
            return cache[i][j];
        }
        boolean res = false;
        if (i < c1.length && c1[i] == c3[x]) {
            res = dfs(i + 1, j, c1, c2, c3);
        } 
        if (!res && j < c2.length && c2[j] == c3[x]) {
            res = dfs(i, j + 1, c1, c2, c3);
        }
        cache[i][j] = res;
        return res;
    }
}
