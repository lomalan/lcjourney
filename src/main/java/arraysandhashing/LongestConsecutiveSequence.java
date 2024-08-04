package arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> storage = new HashSet<>();
        for (int num: nums) {
            storage.add(num);
        }
        int sequenceMax = 0;
        for (int num: nums) {
            if (!storage.contains(num - 1)) { // beginning of the sequence. This way we save the number of operations
                int sequenceCount = 0;
                while (storage.contains(num)) {
                    sequenceCount++;
                    num++;
                }
                sequenceMax = Math.max(sequenceCount, sequenceMax);
            }
            if (sequenceMax > nums.length / 2) {
                return sequenceMax;
            }
        }
        return sequenceMax;
    }
}
