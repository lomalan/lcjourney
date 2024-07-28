package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        // Phase 1 initializing and populating map
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num: nums) {
            var value = numCounts.getOrDefault(num, 0) + 1;
            numCounts.put(num, value);
        }
        // Phase 2. Forming result
        int[] result = new int[k];
        while (k != 0) {
            int max = 0;
            int maxKey = 0;
            for(Map.Entry<Integer, Integer> entry: numCounts.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            numCounts.remove(maxKey);
            k--;
            result[k] = maxKey;
        }
        return result;
    }

    public int[] topKFrequentBucketSort(int[] nums, int k) {
        // Phase 1 initializing and populating map
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num: nums) {
            var value = numCounts.getOrDefault(num, 0) + 1;
            numCounts.put(num, value);
        }
        // Phase 2. creating a bucket sort
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry: numCounts.entrySet()) {
            var list = bucket[entry.getValue()]  == null ? new ArrayList<Integer>() : bucket[entry.getValue()];
            list.add(entry.getKey());
            bucket[entry.getValue()] = list;
        }
        var result = new int[k];
        for (int i = bucket.length - 1; i > 0; i--) {
            var numbers = bucket[i];
            if (numbers != null) {
                for(int num: numbers) {
                    k--;
                    if (k >= 0) {
                        result[k] = num;
                    }
                }
            }

        }
        return result;
    }

}
