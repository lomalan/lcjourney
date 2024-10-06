package backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    private final Map<Character, String> mappings = Map.of(
        '1', "",
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return res;
        }
        dfs(new StringBuilder(), 0, digits);
        return res;       
    }

    private void dfs(StringBuilder combination, int index, String digits) {
        if (combination.length() == digits.length()) {
            res.add(combination.toString());
        } else if (index >= digits.length()) {
            return;
        } else {
            String digit = mappings.get(digits.charAt(index));
            for (char ch: digit.toCharArray()) {
                combination.append(ch);
                dfs(combination, index + 1, digits);
                combination.deleteCharAt(combination.length() - 1);
            }
        }         
    }
}
