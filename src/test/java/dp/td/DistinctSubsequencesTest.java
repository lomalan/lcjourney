package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DistinctSubsequencesTest {
    private final DistinctSubsequences distinctSubsequences = new DistinctSubsequences();
    
    
    @Test
    void test1() {
        assertEquals(3, distinctSubsequences.numDistinct("rabbbit", "rabbit"));
    }

    @Test
    void test2() {
        assertEquals(5, distinctSubsequences.numDistinct("babgbag", "bag"));
    }
}
