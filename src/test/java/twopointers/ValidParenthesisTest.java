package twopointers;

import org.junit.jupiter.api.Test;
import stack.ValidParentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void test1() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void test2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void test3() {
        assertTrue(validParentheses.isValid("([]){}"));
    }

    @Test
    void test4() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    void test5() {
        assertFalse(validParentheses.isValid("]"));
    }
}
