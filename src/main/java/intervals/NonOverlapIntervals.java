package intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int result = 0;
        int target = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] currInterval = intervals[i];
            if (currInterval[0] >= target) {
                target = currInterval[0];
            } else {
                result++;
                target = Math.min(currInterval[1], target);
            }
        }
        return result;   
    }
}
