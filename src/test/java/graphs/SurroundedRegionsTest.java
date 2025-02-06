package graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SurroundedRegionsTest {
    private final SurroundedRegions surroundedRegions = new SurroundedRegions();

    @Test
    void testOneElementBoard() {
        char[][] expectedBoard = new char[][]{{'X'}};
        char[][] initialBoard = new char[][]{{'X'}};
        surroundedRegions.solve(initialBoard);
        assertArrayEquals(expectedBoard, initialBoard);
    }

    @Test
    void testMultiElementBoard() {
        char[][] expectedBoard = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] initialBoard = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
        surroundedRegions.solve(initialBoard);
        assertArrayEquals(expectedBoard, initialBoard);
    }

    @Test
    void testMultiElementBoard1() {
        char[][] expectedBoard = new char[][]{
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}
       };
        char[][] initialBoard = new char[][]{
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}
        };
        surroundedRegions.solve(initialBoard);
        assertArrayEquals(expectedBoard, initialBoard);
    }
}