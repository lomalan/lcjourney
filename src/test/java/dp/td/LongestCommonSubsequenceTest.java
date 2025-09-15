package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {
    private final LongestCommonSubsequence lCommonSubsequence = new LongestCommonSubsequence();


    @Test
    void testNoMatch() {
        assertEquals(0, lCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void testAllMatch() {
        assertEquals(3, lCommonSubsequence.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void testPartialMatch() {
        assertEquals(3, lCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
    }
    
}
