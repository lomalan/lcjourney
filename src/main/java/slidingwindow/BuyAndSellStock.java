package slidingwindow;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left = prices[0];
        int max = 0;
        for (int price: prices) {
            if (left > price) {
                left = price;
            }
            max = Math.max(price - left, max);
        }
        return max;
    }
}
