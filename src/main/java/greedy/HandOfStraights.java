package greedy;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : hand) {
            count.put(num, count.getOrDefault(num, 0) + 1);   
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(count.keySet());
        while (!minHeap.isEmpty()) {
            int min = minHeap.peek();
            for (int i = min; i < min + groupSize; i++) {
                if (count.getOrDefault(i, 0) == 0) {
                    return false;
                }
                count.put(i, count.get(i) - 1);
                if (count.get(i) == 0) {
                    minHeap.poll();
                }
            }
            
        }
        return true;   
    }
}
