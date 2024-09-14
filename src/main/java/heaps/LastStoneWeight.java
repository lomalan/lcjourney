package heaps;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int stone: stones) {
            maxHeap.add(-stone);
        }
        while (maxHeap.size() > 1) {
           var firstMax = maxHeap.remove();
           var secondMax = maxHeap.remove();
           maxHeap.add(firstMax - secondMax);
        }
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}
