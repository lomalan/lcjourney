package intervals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InsertIntervalTest {
    private InsertInterval insertInterval = new InsertInterval();
    
    @Test
    void insertInterval1() {
        int[][] expected = {{1, 5}, {6, 9}};
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }
    
    @Test
    void insertInterval2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12,16}};
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        int[] newInterval = {4, 8};

        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));
    }
}
