package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RottenOrangesTest {
    private final RottenOranges rottenOranges = new RottenOranges();

    @Test
    void testOnlyRottenOranges() {
        assertEquals(0, rottenOranges.orangesRotting(new int[][]{
                {0, 2}
        }));
    }

    @Test
    void testGridWhenOrangeStaysFresh() {
        assertEquals(-1, rottenOranges.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }));
    }

    @Test
    void testRottenOranges() {
        assertEquals(4, rottenOranges.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }));
    }
}