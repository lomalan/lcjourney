package heaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void test1() {
        var kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }

    @Test
    void test2() {
        var kthLargest = new KthLargest(1, new int[]{});
        assertEquals(0, kthLargest.add(0));
    }

}