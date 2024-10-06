package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    private final List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        dfs(0, nums, list);
        return result;
    }

    private void dfs(int idx, int[] nums, List<Integer> res) {
        result.add(new ArrayList<>(res));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            res.add(nums[i]);
            dfs(i + 1, nums, res);
            res.removeLast();
        }
    }
}
