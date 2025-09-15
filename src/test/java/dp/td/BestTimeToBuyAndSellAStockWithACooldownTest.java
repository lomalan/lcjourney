package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellAStockWithACooldownTest {
    private final BestTimeToBuyAndSellAStockWithACooldown bestTime = new BestTimeToBuyAndSellAStockWithACooldown();

    @Test
    void testMultiplePrices() {
        assertEquals(3, bestTime.maxProfit(new int[] {1, 2, 3, 0, 2}));
    }

    @Test
    void testOnlyOnePrice() {
        assertEquals(0, bestTime.maxProfit(new int[] {1}));
    } 
}
