package arraysandhashing;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentTest {
    private final TopKFrequent topKFrequent = new TopKFrequent();

    @Nested
    public class BucketSort {
        @Test
        public void testOneElement() {
            assertArrayEquals(new int[] {1}, topKFrequent.topKFrequentBucketSort(new int[]{1}, 1));
        }

        @Test
        public void testMultipleElements() {
            try {
                assertArrayEquals(new int[] {1, 2}, topKFrequent.topKFrequentBucketSort(new int[]{1}, 1));
            } catch (AssertionError err) {
                assertArrayEquals(new int[] {2, 1}, topKFrequent.topKFrequentBucketSort(new int[]{1, 1, 1, 2, 2, 3}, 2));
            }
        }
    }

    @Test
    public void testOneElement() {
        assertArrayEquals(new int[] {1}, topKFrequent.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void testMultipleElements() {
        try {
            assertArrayEquals(new int[] {1, 2}, topKFrequent.topKFrequent(new int[]{1}, 1));
        } catch (AssertionError err) {
            assertArrayEquals(new int[] {2, 1}, topKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        }
    }
}
