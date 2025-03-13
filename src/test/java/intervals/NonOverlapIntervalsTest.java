package intervals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NonOverlapIntervalsTest {
    private NonOverlapIntervals nonOverlapIntervals = new NonOverlapIntervals();

    @Test
    void overlappedOnce(){
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(1, nonOverlapIntervals.eraseOverlapIntervals(intervals));
    }
    
    @Test
    void overlappedTwice(){
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        assertEquals(2, nonOverlapIntervals.eraseOverlapIntervals(intervals));
    }
        @Test
    void nonOverlapped(){
        int[][] intervals = {{1, 2}, {2, 3}};
        assertEquals(0, nonOverlapIntervals.eraseOverlapIntervals(intervals));
    }
 
}
