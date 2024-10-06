package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private final List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        dfs1(0, nums, list);
        return result;
    }

    private void dfs1(int idx, int[] nums, List<Integer> res) {
        result.add(new ArrayList<>(res));
        for (int i = idx; i < nums.length; i++) {
            res.add(nums[i]);
            dfs1(i + 1, nums, res);
            res.removeLast();
        }
    }

    private void dfs(int start, int[] nums, List<Integer> res) {
        if (nums.length == start) {
            result.add(new ArrayList<>(res));
        } else {
            res.add(nums[start]);
            dfs(start + 1, nums, res);
            res.removeLast();
            dfs(start + 1, nums, res);
        }
    }
}
