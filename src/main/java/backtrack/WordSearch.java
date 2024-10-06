package backtrack;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        var columnLen = board.length;
        var rowLen = board[0].length;
        for (int i = 0; i < columnLen; i++) {
            for (int j = 0; j < rowLen; j++) {
                if (check(board, word.toCharArray(), i, j, columnLen, rowLen, 0)) {
                    return true;
                }
            }
        }
        return false;   
    }

    private boolean check(char[][] board, char[] word, int i, int j, int columnLen, int rowLen, int index) {
        if (index >= word.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= columnLen || j >= rowLen || board[i][j] != word[index]) {
            return false;
        }
        if(board[i][j] == '^') {
            // Handling visited logic
            return false;
        }
        var temp = board[i][j];
        // Marking as visited
        board[i][j] = '^';
        boolean exists = check(board, word, i + 1, j, columnLen, rowLen, index + 1) // going to the bottom
                || check(board, word, i, j + 1, columnLen, rowLen, index + 1) // going to the right
                || check(board, word, i - 1, j, columnLen, rowLen, index + 1) // going up
                || check(board, word, i, j - 1, columnLen, rowLen, index + 1); // going left  ;
        board[i][j] = temp; 
        return exists;
    }
}
