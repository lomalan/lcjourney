package heaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {
    private final LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    void test1() {
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    void test2() {
        assertEquals(0, lastStoneWeight.lastStoneWeight(new int[]{}));
    }

    @Test
    void test3() {
        assertEquals(1, lastStoneWeight.lastStoneWeight(new int[]{1}));
    }

}