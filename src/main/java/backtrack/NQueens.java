package backtrack;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
                board[i][j] = '.';
           } 
        }
        solveNQueens(0, board);
        return result;   
    }

    private void solveNQueens(int index, char[][] board) {
        if (index == board.length) {
            result.add(construct(board));
        }

        for (int i = 0; i < board.length; i++) {
            if (validate(i, index, board)) {
                board[i][index] = 'Q';
                solveNQueens(index + 1, board);
                board[i][index] = '.';
            }
        }
    }

    private boolean validate(int x, int y, char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && 
                    (x + j == y + i 
                    || x + y == i + j || x == i)) {
                        return false;
                    }
                
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(String.valueOf(board[i]));
        }
        return res;
    }
}
