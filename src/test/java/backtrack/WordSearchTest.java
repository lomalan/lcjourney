package backtrack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WordSearchTest {
    private final WordSearch wordSearch = new WordSearch();

    @Test
    void testWordFound() {
        var board = new char[][]{
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'},
        };
        assertTrue(wordSearch.exist(board, "ABCCED"));
    }
    
    @Test
    void testWordNotFound() {
        var board = new char[][]{
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'},
        };
        assertFalse(wordSearch.exist(board, "ABCB"));
    }
}
