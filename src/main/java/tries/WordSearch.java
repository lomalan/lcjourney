package tries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch {
    private final Set<String> result = new HashSet<>();
    private final Set<String> visited = new HashSet<>();

    // phase 1 create trie from words
    public List<String> findWords(char[][] board, String[] words) {
        var trie = new Trie();
        for(String word: words) {
            trie.insert(word);
        }
        // Phase 2. Find words in the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, trie, i, j, "");
            }
        }
        return new ArrayList<>(result);
    }

    private void dfs(char[][] board, Trie trie, int x, int y, String word) {
        if (x < 0 || y < 0 || x >= board.length
                || y >= board[0].length
                || visited.contains(x + "," + y)
                || trie.children[board[x][y] - 'a'] == null
        ) {
            return;
        }
        visited.add(x + "," + y);

        trie = trie.children[board[x][y] - 'a'];
        word += board[x][y];
        if (trie.isWord) {
            result.add(word);
        }

        dfs(board, trie, x + 1, y, word);
        dfs(board, trie, x - 1, y, word);
        dfs(board, trie, x, y + 1, word);
        dfs(board, trie, x, y - 1, word);
        visited.remove(x + "," + y);
    }
}
