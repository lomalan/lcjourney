package slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermutationInStringTest {
    private final PermutationInString permutationInString = new PermutationInString();

    @Test
    public void falseIfS1BiggerThanS2() {
        assertFalse(permutationInString.checkInclusion("abc", "ab"));
    }

    @Test
    public void permutationNotFound() {
        assertFalse(permutationInString.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void permutationFoundS1WithSize2() {
        assertTrue(permutationInString.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void permutationFoundS1WithSize3() {
        assertTrue(permutationInString.checkInclusion("abc", "eidbacooo"));
    }

    @Test
    public void permutationFoundS1WithSize3inTheEnd() {
        assertTrue(permutationInString.checkInclusion("adc", "dcda"));
    }
}
