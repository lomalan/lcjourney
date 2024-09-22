package heaps;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TaskScheduler {

    public int leastIntervalGreedy(char[] tasks, int n) {
        var arr = new int[26];
        for (char task : tasks) {
            arr[task - 'A']++;
        }

        Arrays.sort(arr);
        int max = arr[25]-1;
        int slots = max*n;

        for(int i=24; i>=0; i--){
            slots = slots-Math.min(max,arr[i]);
        }
        return slots>0 ? tasks.length+slots : tasks.length;
    }

    // Phase 1. Count char occurences and populate it to the priority queue
    // Phase 2. Process priority queue by decreasing the biggest value in it and adding next availability to the queue.
    public int leastInterval(char[] tasks, int n) {
        // Phase 1
        var charAppearances = new int[26];
        for (char task: tasks) {
            charAppearances[task - 'A']++;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int appearance: charAppearances) {
            if (appearance > 0) {
                maxHeap.add(-appearance);
            }
        }

        int time = 0;
        Deque<TaskAvailability> queue = new LinkedList<>();
        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;
            // Getting value from the maxHeap, dcrementing it and adding next availability
            if (!maxHeap.isEmpty()) {
                var maxValue = -maxHeap.poll();
                maxValue--;
                if (maxValue > 0) {
                    queue.add(new TaskAvailability(maxValue, time + n));
                }
            }

            if (!queue.isEmpty() && queue.peek().nextAvailablility == time) {
                maxHeap.add(-(queue.removeFirst().task));
            }
        }
        return time;
    }

    private class TaskAvailability {
        private final int task;
        private final int nextAvailablility;

        public TaskAvailability(int task, int nextAvailablility) {
            this.task = task;
            this.nextAvailablility = nextAvailablility;
        }
    }
}
