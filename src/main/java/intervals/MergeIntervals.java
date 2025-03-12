package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
   public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int[] targetInterval = intervals[0];
        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (targetInterval[1] < intervals[i][0]) {
                result.add(targetInterval);
                targetInterval = intervals[i];
            } else {
                targetInterval[0] = Math.min(targetInterval[0], intervals[i][0]);
                targetInterval[1] = Math.max(targetInterval[1], intervals[i][1]);
            }
        }
        result.add(targetInterval);
        return result.toArray(new int[result.size()][]);
   } 
}
