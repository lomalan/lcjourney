package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    private final List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        dfs(target, 0, combination, candidates);
        return combinations;
    }

    private void dfs(int target, int index, List<Integer> combination, int[] candidates) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                combination.add(candidates[i]);
                dfs(target - candidates[i], i + 1, combination, candidates);
                combination.removeLast();
            }
        }
    }
}
