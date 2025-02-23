package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SwimInRisingWaterTest {
    private final SwimInRisingWater swimInRisingWater = new SwimInRisingWater();

    @Test
    void test2x2Grid() {
        int[][] grid = {{0, 2}, {1, 3}};
        assertEquals(3, swimInRisingWater.swimInWater(grid));
    }

    @Test
    void testBigGrid() {
        int[][] grid = {
            {0, 1, 2, 3, 4}, 
            {24, 23, 22, 21, 5},
            {12, 13, 14, 15, 16},
            {11, 17, 18, 19, 20},
            {10, 9, 8, 7, 6}
        };
        assertEquals(16, swimInRisingWater.swimInWater(grid));
    }

}
