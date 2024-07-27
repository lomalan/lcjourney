package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxSlidingWindowTest {
    private final MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();

    @Test
    public void maxSlidingWindowKBiggerThanNums() {
        assertArrayEquals(new int[0], maxSlidingWindow.maxSlidingWindow(new int[1], 5));
    }

    @Test
    public void maxSlidingWindowOneElement() {
        int[] testData = new int[] { 1 };

        assertArrayEquals(testData, maxSlidingWindow.maxSlidingWindow(testData, 1));
    }

    @Test
    public void maxSlidingWindowMultipleElements() {
        int[] testData = new int[] { 1, 3, -1, -2, 5, 3, 6, 7 };
        int[] expected = new int[] {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, maxSlidingWindow.maxSlidingWindow(testData, 3));
    }

    @Test
    public void maxSlidingWindowMultipleElements_2() {
        int[] testData = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };
        int[] expected = new int[] {3, 3, -1, 5, 5, 6, 7};
        assertArrayEquals(expected, maxSlidingWindow.maxSlidingWindow(testData, 2));
    }
}
