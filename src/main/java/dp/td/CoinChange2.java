package dp.td;

public class CoinChange2 {
    private Integer[][] cache;
    public int change(int amount, int[] coins) {
        cache = new Integer[coins.length][amount + 1];
        return dfs(0, amount, coins);   
    }

    private int dfs(int i, int target, int[] coins) {
        if (target == 0) {
            return 1;
        }
        if (i >= coins.length || target < 0) {
            return 0;
        }
        if (cache[i][target] != null) {
            return cache[i][target];
        }

        int res = dfs(i + 1, target, coins);
        if (target >= coins[i]) {
            res += dfs(i, target - coins[i], coins);
        }
        cache[i][target] = res;
        return res;
    }
}
