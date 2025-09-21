package dp.td;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RegexMatchTest {
    private final RegexMatch regexMatch = new RegexMatch();

    @Test
    void test1() {
        assertFalse(regexMatch.isMatch("aa", "a"));
    }

    @Test
    void test2() {
        assertTrue(regexMatch.isMatch("aa", "a*"));
    }

    @Test
    void test3() {
        assertTrue(regexMatch.isMatch("aa", ".*"));
    }
    
}
