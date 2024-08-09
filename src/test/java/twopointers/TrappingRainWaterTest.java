package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {
    private final TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    void trappingNothing() {
        assertEquals(0, trappingRainWater.trap(new int[]{0, 1, 0, 0, 0}));
    }

    @Test
    void trappingOneLevel() {
        assertEquals(2, trappingRainWater.trap(new int[]{0, 1, 0, 0, 1}));
    }

    @Test
    void trappingMultipleLevels() {
        assertEquals(6, trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trappingALot() {
        assertEquals(9, trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
