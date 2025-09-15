package dp.td;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class InterlivingStringTest {
    private final InterleavingString interleavingString = new InterleavingString();

    @Test
    void isInterlieving() {
        assertTrue(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void isNotInterlieving() {
        assertFalse(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void emptyStrings() {
        assertTrue(interleavingString.isInterleave("", "", ""));
    }
    
}
