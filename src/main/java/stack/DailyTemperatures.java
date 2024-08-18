package stack;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        var result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peekLast()]) {
                var prevIndex = stack.removeLast();
                result[prevIndex] = i - prevIndex;
            }
            stack.add(i);
        }
        return result;
    }
}
