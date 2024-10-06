package backtrack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PalindromPartitionTest {
    private final PalindromPartition palindromPartition = new PalindromPartition();


     @Test
    void testMultiplePalindroms() {
        assertEquals(List.of(
            List.of("a", "a", "b"),
            List.of("aa", "b")), 
            palindromPartition.partition("aab"));
    }   
    
    @Test
    void testOnePalindrom() {
        assertEquals(List.of(List.of("a")), palindromPartition.partition("a"));
    }
}
