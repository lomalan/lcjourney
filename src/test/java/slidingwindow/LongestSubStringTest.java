package slidingwindow;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubStringTest {
    private final LongestSubString longestSubString = new LongestSubString();

    @Nested
    public class Opt {
        @Test
        public void zeroIfStringIsEmpty() {
            assertEquals(0, longestSubString.lengthOfLongestSubstringOpt(""));
        }

        @Test
        public void oneIfStringWithOnlyRepeatedChars() {
            assertEquals(1, longestSubString.lengthOfLongestSubstringOpt("aaa"));
        }

        @Test
        public void multipleCharsCase1() {
            assertEquals(3, longestSubString.lengthOfLongestSubstringOpt("abcabcbb"));
        }

        @Test
        public void multipleCharsCase2() {
            assertEquals(3, longestSubString.lengthOfLongestSubstringOpt("pwwkew"));
        }

        @Test
        public void multipleCharsCase3() {
            assertEquals(3, longestSubString.lengthOfLongestSubstringOpt("dvdf"));
        }

        @Test
        public void multipleCharsCase4() {
            assertEquals(5, longestSubString.lengthOfLongestSubstringOpt("qrsvbspk"));
        }
    }

    @Test
    public void zeroIfStringIsEmpty() {
        assertEquals(0, longestSubString.lengthOfLongestSubstring(""));
    }

    @Test
    public void oneIfStringWithOnlyRepeatedChars() {
        assertEquals(1, longestSubString.lengthOfLongestSubstring("aaa"));
    }

    @Test
    public void multipleCharsCase1() {
        assertEquals(3, longestSubString.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void multipleCharsCase2() {
        assertEquals(3, longestSubString.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void multipleCharsCase3() {
        assertEquals(3, longestSubString.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void multipleCharsCase4() {
        assertEquals(5, longestSubString.lengthOfLongestSubstring("qrsvbspk"));
    }
}
