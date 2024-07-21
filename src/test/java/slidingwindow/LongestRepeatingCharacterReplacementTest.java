package slidingwindow;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementTest {
    private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();

    @Nested
    class MapSolution {
        @Test
        public void case1() {
            assertEquals(4,
                    longestRepeatingCharacterReplacement.characterReplacement("AABA", 2));
        }

        @Test
        public void case2() {
            assertEquals(4,
                    longestRepeatingCharacterReplacement.characterReplacementMap("AABABBA", 1));
        }

        @Test
        public void case3() {
            assertEquals(3,
                    longestRepeatingCharacterReplacement.characterReplacementMap("ABCD", 2));
        }

        @Test
        public void case4() {
            assertEquals(1,
                    longestRepeatingCharacterReplacement.characterReplacementMap("ABCD", 0));
        }

        @Test
        public void case5() {
            assertEquals(2,
                    longestRepeatingCharacterReplacement.characterReplacementMap("AABC", 0));
        }

        @Test
        public void case6() {
            assertEquals(5,
                    longestRepeatingCharacterReplacement.characterReplacementMap("AABABBBC", 1));
        }
    }

    @Test
    public void case1() {
        assertEquals(4,
                longestRepeatingCharacterReplacement.characterReplacement("AABA", 2));
    }

    @Test
    public void case2() {
        assertEquals(4,
                longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
    }

    @Test
    public void case3() {
        assertEquals(3,
                longestRepeatingCharacterReplacement.characterReplacement("ABCD", 2));
    }

    @Test
    public void case4() {
        assertEquals(1,
                longestRepeatingCharacterReplacement.characterReplacement("ABCD", 0));
    }

    @Test
    public void case5() {
        assertEquals(2,
                longestRepeatingCharacterReplacement.characterReplacement("AABC", 0));
    }

    @Test
    public void case6() {
        assertEquals(5,
                longestRepeatingCharacterReplacement.characterReplacement("AABABBBC", 1));
    }
}
