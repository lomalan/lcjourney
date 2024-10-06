package backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum2Test {

    private final CombinationSum2 combinationSum2 = new CombinationSum2();

    @Test
    void testNoCombinationsFound() {
        assertEquals(List.of(
                List.of(1, 2, 2),
                List.of(5)
                ),
                combinationSum2.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }

    @Test
    void testCombinationsFound() {
        assertEquals(List.of(
                List.of(1, 1, 6),
                List.of(1, 2, 5),
                List.of(1, 7),
                List.of(2, 6)
        ), combinationSum2.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

}