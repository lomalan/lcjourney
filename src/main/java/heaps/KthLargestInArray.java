package heaps;

import java.util.PriorityQueue;

public class KthLargestInArray {
    public int findKthLargest(int[] nums, int k) {
        // Phase 1. Create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Phase 2. Populate heap k times
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        // Phase 3. Check all numbers and replace elements only if value is bigger than min element
        for (int num: nums) {
            if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        // Phase 3. Return first element in a heap
        return minHeap.remove();
    }
}
