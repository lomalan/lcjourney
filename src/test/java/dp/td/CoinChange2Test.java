package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoinChange2Test {
    private final CoinChange2 coinChange = new CoinChange2();

    @Test
    void testAmount1() {
        assertEquals(4, coinChange.change(5, new int[] {1, 2, 5}));
    }
    
    @Test
    void testAmount2() {
        assertEquals(0, coinChange.change(3, new int[] {2}));
    }
    
    @Test
    void testAmount3() {
        assertEquals(1, coinChange.change(10, new int[] {10}));
    }
}
