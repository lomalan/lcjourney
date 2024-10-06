package backtrack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    private final Subsets subsets = new Subsets();

    @Test
    void testEmptySubset() {
        assertEquals(List.of(List.of()), subsets.subsets(new int[]{}));
    }

    @Test
    void testNonEmptySubset() {
        assertEquals(List.of(
                List.of(1, 2, 3),
                List.of(1, 2),
                List.of(1, 3),
                List.of(1),
                List.of(2, 3),
                List.of(2),
                List.of(3),
                List.of()
                ),
                subsets.subsets(new int[]{1, 2, 3}));
    }


}