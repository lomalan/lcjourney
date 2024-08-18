package stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesisTest {

    private final GenerateParenthesis generateParenthesis = new GenerateParenthesis();

    @Test
    void test1() {
        assertEquals(List.of("()"), generateParenthesis.generateParenthesis(1));
    }

    @Test
    void test2() {
        assertEquals(List.of("(())", "()()"), generateParenthesis.generateParenthesis(2));
    }

    @Test
    void test3() {
        var expectedResult = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        var result = generateParenthesis.generateParenthesis(3);
        assertEquals(expectedResult, result);
    }

    @Test
    void testOftests() {
        assertEquals("Done", generateParenthesis.backTrackTest(10));
    }
}
