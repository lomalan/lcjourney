package stack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    private Deque<Integer> minStorage;
    private Deque<Integer> stack;
    public MinStack() {
        minStorage = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public void push(int val) {
        stack.add(val);
        if (minStorage.isEmpty() || minStorage.peekLast() >= val) {
            minStorage.add(val);
        }
    }

    public void pop() {
        var value = stack.removeLast();
        if (value.equals(minStorage.peekLast())) {
            minStorage.removeLast();
        }
    }

    public int top() {
        return stack.peekLast();
    }

    public int getMin() {
        return minStorage.peekLast();
    }
}
