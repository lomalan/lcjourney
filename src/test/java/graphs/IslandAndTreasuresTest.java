package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandAndTreasuresTest {
    private final IslandAndTreasures islandAndTreasures = new IslandAndTreasures();

    private final int land = Integer.MAX_VALUE;
    @Test
    void testOneIsland() {
        int[][] input = {{0, -1}, {land, land}};

        int[][] output = {{0, -1}, {1, 2}};
        islandAndTreasures.islandsAndTreasure(input);
        assertArrayEquals(output, input);
    }

    @Test
    void testFewIslands() {
        int[][] input = {
                {land, -1,   0,    land},
                {land, land, land, -1},
                {land, -1,   land, -1},
                {0,    -1,   land, land}
        };

        int[][] output = {
                {3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };
        islandAndTreasures.islandsAndTreasure(input);
        assertArrayEquals(output, input);
    }
}