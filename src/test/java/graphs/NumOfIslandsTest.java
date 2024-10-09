package graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumOfIslandsTest {

    private final NumOfIslands numOfIslands = new NumOfIslands();

    @Test
    public void testOneIsland() {
        assertEquals(
            1,
            numOfIslands.numIslands(
                new char[][] {
                    { '1', '1', '1', '1', '0' },
                    { '1', '1', '0', '1', '0' },
                    { '1', '1', '0', '0', '0' },
                    { '0', '0', '0', '0', '0' },
                }
            )
        );
    }

    @Test
    public void testMultipleIslands() {
        assertEquals(
            3,
            numOfIslands.numIslands(
                new char[][] {
                    { '1', '1', '0', '0', '0' },
                    { '1', '1', '0', '1', '0' },
                    { '0', '0', '1', '1', '0' },
                    { '0', '0', '0', '0', '1' },
                }
            )
        );
    }
}
