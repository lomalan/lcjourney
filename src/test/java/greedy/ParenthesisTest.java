package greedy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ParenthesisTest {
    private Parenthesis parenthesis = new Parenthesis();

    @Test
    void validCase1() {
        assertTrue(parenthesis.checkValidString("()"));
    }
    
    @Test
    void validCase2() {
        assertTrue(parenthesis.checkValidString("(*)"));
    }

    @Test
    void validCase3() {
        assertTrue(parenthesis.checkValidString("(*))"));
    }

    @Test
    void validCase4() {
        assertTrue(parenthesis.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
    
    @Test
    void invalidCase1() {
        assertFalse(parenthesis.checkValidString(")(*))"));
    }
}
