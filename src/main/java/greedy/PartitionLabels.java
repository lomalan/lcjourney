package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        // Definitng end indexes in a hash map
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        // Define size and end and drop size
        List<Integer> result = new ArrayList<>();
        int size = 0;
        int end = lastIndex.get(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            size++;
            var currEnd = lastIndex.get(s.charAt(i));
            if (currEnd > end) {
                end = currEnd;
            }
            if (i == end) {
                result.add(size);
                size = 0;
            }
        }
        return result;   
    }
}
