package dp.td;


public class BurstBaloons {
    Integer[][] dp;
    public int maxCoins(int[] nums) {
        // Add extra 1 to the beginning and the end of the array
        int[] newNums = new int[nums.length + 2];
        newNums[0] = 1;
        newNums[newNums.length - 1] = 1;
        for (int i = 1; i < newNums.length - 1; i++) {
            newNums[i] = nums[i - 1];
        }
        dp = new Integer[newNums.length][newNums.length];
        return dfs(1, newNums.length - 2, newNums);    
    }


    private int dfs(int l, int r, int[] nums) {
        if (l > r) {
            return 0;
        }
        if (dp[l][r] != null) {
            return dp[l][r];
        }
        int res = 0;
        for (int i = l; i <= r; i++) {
            int coins = nums[l - 1] * nums[i] * nums[r + 1];
            coins += dfs(i + 1, r, nums) + dfs(l, i - 1, nums);
            res = Math.max(res, coins);
        }
        dp[l][r] = res;

        return res;
    }
    
}
