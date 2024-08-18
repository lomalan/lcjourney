package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleTest {

    private final LargestRectangle largestRectangle = new LargestRectangle();

    @Test
    void test1() {
        assertEquals(4, largestRectangle.largestRectangleArea(new int[] {2, 4}));
    }

    @Test
    void test2() {
        assertEquals(10, largestRectangle.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }

    @Test
    void test3() {
        assertEquals(12, largestRectangle.largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3, 2, 2}));
    }
}
