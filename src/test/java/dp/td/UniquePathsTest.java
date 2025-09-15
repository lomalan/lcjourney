package dp.td;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniquePathsTest {
    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    void threeUniquePaths() {
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }

    @Test
    void manyUniquePaths() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }
}
