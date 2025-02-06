package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidTreeTest {
    private final ValidTree validTree = new ValidTree();

    @Test
    void testValidTree() {
        int[][] possibleTree = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        assertTrue(validTree.validTree(5, possibleTree));
    }

    @Test
    void testInValidTree() {
        int[][] possibleTree = {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
        assertFalse(validTree.validTree(5, possibleTree));
    }

    @Test
    void testValidTrees() {
        int[][] possibleTree = {{0, 1}, {2, 3}};
        assertFalse(validTree.validTree(4, possibleTree));
    }
}