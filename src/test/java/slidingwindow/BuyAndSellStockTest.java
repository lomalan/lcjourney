package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyAndSellStockTest {
    private final BuyAndSellStock buyAndSellStock = new BuyAndSellStock();

    @Test
    public void noProfit() {
        var tradingDays = new int[] {7, 6, 4, 3, 1};
        assertEquals(0, buyAndSellStock.maxProfit(tradingDays));
    }

    @Test
    public void profit() {
        var tradingDays = new int[] {7, 1, 5, 3, 6, 4};
        assertEquals(5, buyAndSellStock.maxProfit(tradingDays));
    }

    @Test
    public void firstTwoDaysProfit() {
        var tradingDays = new int[] {1, 7, 5, 3, 6, 4};
        assertEquals(6, buyAndSellStock.maxProfit(tradingDays));
    }

    @Test
    public void lastTwoDaysProfit() {
        var tradingDays = new int[] {5, 7, 3, 6, 1, 8};
        assertEquals(7, buyAndSellStock.maxProfit(tradingDays));
    }
}
