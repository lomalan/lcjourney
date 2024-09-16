package heaps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KthLargestInArrayTest {

    private final KthLargestInArray kthLargestInArray = new KthLargestInArray();

    @Test
    public void test1() {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        assertEquals(5, kthLargestInArray.findKthLargest(nums, 2));
    }

    @Test
    public void test2() {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        assertEquals(4, kthLargestInArray.findKthLargest(nums, 4));
    }

    @Test
    public void testOneElementArray() {
        int[] nums = { 2 };
        assertEquals(2, kthLargestInArray.findKthLargest(nums, 1));
    }
}
