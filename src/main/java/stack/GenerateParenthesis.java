package stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backTrack(n, n, "");
        return result;
    }

    private void backTrack(int openCount, int closeCount, String entry) {
        if (openCount == closeCount && openCount == 0) {
            result.add(entry);
        }
        if (openCount > 0) {
            backTrack(openCount - 1, closeCount, entry + "(");
        }
        if (closeCount > openCount) {
            backTrack(openCount, closeCount - 1, entry + ")");
        }
    }

    public String backTrackTest(int n) {
        if (n == 0) {
            return "Done";
        }
        System.out.println(n);
        return backTrackTest(n - 1);
    }
}
