package dp;

import java.util.Arrays;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;   
        }
        return second;
    }    
    
    private int[] dp;

    // With memo
    public int climbStairsRec(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return dfs(n);
    }
    
    private int dfs(int n) {
        if (n < 0) {
            return 0;
        }
        if (n < 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int res =  dfs(n - 1) + dfs(n - 2);
        dp[n] = res;
        return dp[n];
    }
}
