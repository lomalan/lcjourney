package heaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {


    @Test
    void testMedian() {
        var medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian());

        medianFinder.addNum(3);
        assertEquals(2.0, medianFinder.findMedian());
    }

}