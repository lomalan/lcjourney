package arraysandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void testEmptyArray() {
        assertEquals(0, longestConsecutiveSequence.longestConsecutive(new int[] {}));
    }

    @Test
    void testSingletonArray() {
        assertEquals(1, longestConsecutiveSequence.longestConsecutive(new int[] {1}));
    }

    @Test
    void testArray_1() {
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test
    void testArray_2() {
        assertEquals(9, longestConsecutiveSequence.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
