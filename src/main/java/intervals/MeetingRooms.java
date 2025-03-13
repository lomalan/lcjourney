package intervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(in -> in.start));

        for (int i = 1; i < intervals.size(); i++) {
            var first = intervals.get(i - 1);
            var second = intervals.get(i);
            if (first.end > second.start) {
                return false;
            }   
        }
        return true;
    }

    public int minMeetingRooms(List<Interval> intervals) {
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];
        for (int i = 0; i < intervals.size(); i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int count = 0, res = 0;
        int s = 0, e = 0;
        while (s < start.length) {
            if (end[e] > start[s]) {
                s++;
                count++;
            } else {
                e++;
                count--;
            }
            res = Math.max(count, res);
        }
        return res;
   } 
}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
