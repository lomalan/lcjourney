package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void twoSizedContainerTest() {
        assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    void multipleSizedContainerTest() {
        assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void multipleSizedContainerTest2() {
        assertEquals(30, containerWithMostWater.maxArea(new int[]{1, 5, 7, 5, 4, 5, 5, 6, 4, 1}));
    }

    @Test
    void multipleSizedContainerTest3() {
        assertEquals(2, containerWithMostWater.maxArea(new int[]{1, 2, 1}));
    }
}
