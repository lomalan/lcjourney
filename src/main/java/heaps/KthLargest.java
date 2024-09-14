package heaps;

import java.util.PriorityQueue;

public class KthLargest {
    private final PriorityQueue<Integer> heap = new PriorityQueue<>();
    private final int k;

    // We need to add elements only if heap size is less than k or current value is greater than the smallest value in heap
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num: nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (heap.size() < k) {
            heap.add(val);
        } else if (val > heap.peek()){
            // It means that our queue is full and we need to replace our minimum value with new one
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}
