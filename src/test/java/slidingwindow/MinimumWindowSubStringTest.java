package slidingwindow;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumWindowSubStringTest {
    private final MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

    @Nested
    class ListSolution {

        @Test
        public void minWindowFound() {
            System.out.println('z' - 'A');
            assertEquals("BANC", minimumWindowSubstring.minWindowList("ADOBECODEBANC", "ABC"));
        }

        @Test
        public void minWindowFound2() {
            assertEquals("a", minimumWindowSubstring.minWindowList("a", "a"));
        }

        @Test
        public void minWindowNotFound() {
            assertEquals("", minimumWindowSubstring.minWindowList("a", "aa"));
        }

        @Test
        public void WindowFoundEqualLists() {
            assertEquals("aa", minimumWindowSubstring.minWindowList("aa", "aa"));
        }
    }

    @Test
    public void minWindowFound() {
        assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void minWindowFound2() {
        assertEquals("a", minimumWindowSubstring.minWindow("a", "a"));
    }

    @Test
    public void minWindowNotFound() {
        assertEquals("", minimumWindowSubstring.minWindow("a", "aa"));
    }

    @Test
    public void WindowFoundEqualLists() {
        assertEquals("aa", minimumWindowSubstring.minWindow("aa", "aa"));
    }
}
