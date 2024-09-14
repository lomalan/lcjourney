package tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    private final WordSearch wordSearch = new WordSearch();

    @Test
    void wordSearchTest() {
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        var result = wordSearch.findWords(board, words);
        assertEquals(2, result.size());
        assertTrue(result.contains("oath"));
        assertTrue(result.contains("eat"));
    }

    @Test
    void wordSearchTest2() {
        char[][] board = {
                {'a', 'b'},
                {'c', 'd'}
        };
        String[] words = {"abcb"};
        var result = wordSearch.findWords(board, words);
        assertTrue(result.isEmpty());
    }
}