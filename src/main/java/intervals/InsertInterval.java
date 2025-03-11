package intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
   public int[][] insert(int[][] intervals, int[] newInterval) {
        // if new interval is bigger than current one, 
        //    add only current interval in the response
        // if new interval is less than min value of the current interval, 
        //    then add it before current interval and then add current interval
        // if it's overlapping, make new interval 
        //as a combination of [min(cI0, nI0), max(cI1, MI1)]

        List<int[]> result = new ArrayList<>();
        boolean inserted = false;
        for (int[] interval : intervals) {
            if (inserted || newInterval[0] > interval[1]) {
                result.add(interval);
            } else if (newInterval[1] < interval[0]) {
                result.add(newInterval);
                inserted = true;
                result.add(interval);
            } else {
                newInterval = new int[]{
                    Math.min(newInterval[0], interval[0]), 
                    Math.max(newInterval[1], interval[1])
                };
            }
        }
        if (!inserted) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);   
    } 
}
