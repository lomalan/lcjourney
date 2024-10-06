package backtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LetterCombinationTest {
    private final LetterCombination letterCombination = new LetterCombination();

    @Test
    void testEmptyDigits() {
        assertEquals(new ArrayList<>(), letterCombination.letterCombinations(""));
    }

    @Test
    void testMultipleDigits() {
        assertEquals(List.of(
            "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
        ), letterCombination.letterCombinations("23"));
    }

    @Test
    void testOneDigit() {
        assertEquals(List.of(
            "a", "b", "c"
        ), letterCombination.letterCombinations("2"));
    }
}
