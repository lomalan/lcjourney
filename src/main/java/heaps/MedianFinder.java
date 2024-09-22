package heaps;

import java.util.PriorityQueue;

public class MedianFinder {

    private final PriorityQueue<Integer> smallNumbersHeap; // max heap
    private final PriorityQueue<Integer> largeNumbersHeap; // minHeap

    public MedianFinder() {
        smallNumbersHeap = new PriorityQueue<>((a, b) -> b - a);
        largeNumbersHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        smallNumbersHeap.add(num);

        if (smallNumbersHeap.size() - largeNumbersHeap.size() > 1
                || !largeNumbersHeap.isEmpty()
                    && smallNumbersHeap.peek() > largeNumbersHeap.peek()) {
            largeNumbersHeap.add(smallNumbersHeap.poll());
        }

        if (largeNumbersHeap.size() - smallNumbersHeap.size() > 1) {
            smallNumbersHeap.add(largeNumbersHeap.poll());
        }
    }

    public double findMedian() {
        if (smallNumbersHeap.size() == largeNumbersHeap.size() && !smallNumbersHeap.isEmpty()) {
            return (double) (smallNumbersHeap.peek() + largeNumbersHeap.peek()) / 2;
        } else if(smallNumbersHeap.size() > largeNumbersHeap.size()) {
            return (double) smallNumbersHeap.peek();
        } else {
            return (double) largeNumbersHeap.peek();
        }
    }
}


