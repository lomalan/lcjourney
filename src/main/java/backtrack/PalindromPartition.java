package backtrack;

import java.util.ArrayList;
import java.util.List;

public class PalindromPartition {
    private List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(0, s, new ArrayList<>());
        return res;   
    }

    private void dfs(int index, String s, List<String> partition) {
        if (index == s.length()) {
            res.add(new ArrayList<>(partition));
        } else {
            for (int i = index; i < s.length(); i++) {
                if (isPalindrome(index, i, s.toCharArray())) {
                    partition.add(s.substring(index, i + 1));
                    dfs(i + 1, s, partition);
                    partition.removeLast();
                }
            }
        }
    }

    private boolean isPalindrome(int l, int r, char[] word) {
        while (l <= r) {
            if (word[l] != word[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
