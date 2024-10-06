package backtrack;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> res = new ArrayList<>();
        dfs(0, 0, candidates, res, target);
        return result;
    }

    private void dfs(int start, int sum, int[] candidates, List<Integer> res, int target) {
        if (sum == target) {
            result.add(new ArrayList<>(res));
        }
        if (start < candidates.length && sum < target) {
            res.add(candidates[start]);
            sum += candidates[start];
            dfs(start, sum, candidates, res, target);
            sum -= candidates[start];
            res.removeLast();
            dfs(start + 1, sum, candidates, res, target);
        }
    }

    private final List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        dfs(target, 0, combination, candidates);
        return combinations;
    }

    private void dfs(int target, int index, List<Integer> combination, int[] candidates) {
        if (target < 0 || index >= candidates.length) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
        } else {
            combination.add(candidates[index]);
            dfs(target - candidates[index], index, combination, candidates);
            combination.removeLast();
            dfs(target, index + 1, combination, candidates);
        }
    }
}
