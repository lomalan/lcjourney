package intervals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {
    private MergeIntervals mergeIntervals = new MergeIntervals();
    
    @Test
    void merge1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};

        assertArrayEquals(expected, mergeIntervals.merge(intervals));
    }
    
    @Test
    void merge2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};

        assertArrayEquals(expected, mergeIntervals.merge(intervals));
    }
    
    @Test
    void mergeUnsorted() {
        int[][] intervals = {{1, 4}, {4, 5}, {1, 10}};
        int[][] expected = {{1, 10}};

        assertArrayEquals(expected, mergeIntervals.merge(intervals));
    }
}
