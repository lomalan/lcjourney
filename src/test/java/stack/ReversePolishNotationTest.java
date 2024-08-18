package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationTest {
    private final ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

    @Test
    void test1() {
        assertEquals(9, reversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void test2() {
        assertEquals(6, reversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void test3() {
        assertEquals(22, reversePolishNotation.evalRPN(
                new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}
        ));
    }
}
