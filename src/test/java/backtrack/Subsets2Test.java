package backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Subsets2Test {
    private final Subsets2 subsets = new Subsets2();

    @Test
    void testEmptySubset() {
        assertEquals(List.of(List.of()), subsets.subsetsWithDup(new int[]{}));
    }

    @Test
    void testNonEmptySubset() {
        assertEquals(List.of(
                        List.of(),
                        List.of(1),
                        List.of(1, 2),
                        List.of(1, 2, 2),
                        List.of(2),
                        List.of(2, 2)
                ),
                subsets.subsetsWithDup(new int[]{1, 2, 2}));
    }
}