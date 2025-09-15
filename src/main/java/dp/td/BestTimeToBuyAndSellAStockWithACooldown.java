package dp.td;

public class BestTimeToBuyAndSellAStockWithACooldown {
    Integer[][] cache;
    public int maxProfit(int[] prices) {
        cache = new Integer[prices.length][2];
        return dfs(0, 1, prices);
    }

    private int dfs(int i, int buying, int[] prices) {
        if (i >= prices.length) {
            return 0;
        }

        int res = dfs(i + 1, buying, prices);
        if (buying == 0) {
            res = Math.max(res, dfs(i + 2, 1, prices) + prices[i]);
        } else {
            res = Math.max(res, dfs(i + 1, 0, prices) - prices[i]);
        }
        return res;
    }
}
