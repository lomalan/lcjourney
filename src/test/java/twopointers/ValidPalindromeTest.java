package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void validEmptyStringPalindrome() {
        assertTrue(validPalindrome.isPalindrome(""));
    }

    @Test
    void validStringPalindrome() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void invalidStringPalindrome() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    void invalidStringPalindrome2() {
        assertFalse(validPalindrome.isPalindrome("0P"));
    }
}
