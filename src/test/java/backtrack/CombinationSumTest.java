package backtrack;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private final CombinationSum combinationSum = new CombinationSum();

    @Nested
    class Solution1 {
        @Test
        void testNoCombinationsFound() {
            assertEquals(List.of(), combinationSum.combinationSum(new int[]{2}, 1));
        }

        @Test
        void testCombinationsFound() {
            assertEquals(List.of(
                    List.of(2, 2, 3),
                    List.of(7)
            ), combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
        }
    }

    @Nested
    class Solution2 {
        @Test
        void testNoCombinationsFound() {
            assertEquals(List.of(), combinationSum.combinationSum2(new int[]{2}, 1));
        }

        @Test
        void testCombinationsFound() {
            assertEquals(List.of(
                    List.of(2, 2, 3),
                    List.of(7)
            ), combinationSum.combinationSum2(new int[]{2, 3, 6, 7}, 7));
        }
    }

}