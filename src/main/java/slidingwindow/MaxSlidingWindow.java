package slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k > nums.length) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        // We are going to save here indexes to make it easier to define if value is not in window anymore
        Deque<Integer> windowValues = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            var firstWindowElementIndex = i - k + 1;
            // While max value(first element) is not in window anymore, delete it
            while (!windowValues.isEmpty() && windowValues.peekFirst() < firstWindowElementIndex) {
                windowValues.removeFirst();
            }
            // While current value is bigger than last value in the deque, remove the last value
            while (!windowValues.isEmpty() && nums[windowValues.peekLast()] < nums[i]) {
                windowValues.removeLast();
            }
            // put the value in the end
            windowValues.offerLast(i);
            // If our (i - k + 1) reached window size, it means that we can start defining a result.
            // For example if k = 3 and i = 2 mean that we have first valid window with 3 elements 0, 1, 2
            if (firstWindowElementIndex >= 0) {
                result[firstWindowElementIndex] = nums[windowValues.peekFirst()];
            }
        }
        return result;
    }
}
