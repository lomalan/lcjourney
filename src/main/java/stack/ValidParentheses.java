package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        var closingToOpenMap = Map.of(
                ']', '[', ')', '(', '}',  '{'
        );
        Deque<Character> stack = new LinkedList<>();
        
        for (Character c: s.toCharArray()) {
            if (closingToOpenMap.containsKey(c)) {
                if (stack.isEmpty() || stack.removeLast() != closingToOpenMap.get(c)) {
                    return false;
                }
            } else {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}
