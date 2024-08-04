package arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        // phase 1 initialising storages for rows columns and squares
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Map.Entry<Integer, Integer>, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                var currentValue = board[i][j];
                if (board[i][j] == '.') {
                    continue;
                }
                var squareKey = Map.entry(i / 3, j / 3);
                var elementsInRow = rows.getOrDefault(i, new HashSet<>());
                var elementsInColumn = columns.getOrDefault(j, new HashSet<>());
                var elementsInSquare = squares.getOrDefault(squareKey, new HashSet<>());
                if (elementsInRow.contains(currentValue) || elementsInColumn.contains(currentValue) || elementsInSquare.contains(currentValue)) {
                    return false;
                }
                elementsInColumn.add(currentValue);
                elementsInRow.add(currentValue);
                elementsInSquare.add(currentValue);

                rows.put(i, elementsInRow);
                columns.put(j, elementsInColumn);
                squares.put(squareKey, elementsInSquare);
            }
        }
        return true;
    }
}
