package backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    private final Permutations permutations = new Permutations();

    @Test
    void testOneElement() {
        assertEquals(List.of(
                List.of(1)
        ), permutations.permute(new int[] {1}));
    }

    @Test
    void testTwoElements() {
        assertEquals(List.of(
                List.of(0, 1),
                List.of(1, 0)
        ), permutations.permute(new int[] {0, 1}));
    }

    @Test
    void testThreeElements() {
        assertEquals(List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        ), permutations.permute(new int[] {1, 2, 3}));
    }

}