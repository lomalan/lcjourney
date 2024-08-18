package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Set;

public class ReversePolishNotation {
    private final Set<String> operations = Set.of("/", "+", "-", "*");

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for(String token: tokens) {
            if (isOperation(token)) {
                var secondOperand = stack.removeLast();
                var firstOperand = stack.removeLast();
                stack.add(calculate(firstOperand, secondOperand, token));
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.removeLast();
    }

    private boolean isOperation(String token) {
        return operations.contains(token);
    }

    private int calculate(Integer firstOperand, Integer secondOperand, String operation) {
        return switch (operation) {
            case "+" -> firstOperand + secondOperand;
            case "-" -> firstOperand - secondOperand;
            case "/" -> firstOperand / secondOperand;
            default -> firstOperand * secondOperand;
        };
    }
}
