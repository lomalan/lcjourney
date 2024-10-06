package backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    private final List<List<Integer>> permutations = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> permutation = new ArrayList<>();
        backtrack(permutation, nums);
        return permutations;
    }

    private void backtrack(List<Integer> permutation, int[] nums) {
        if (nums.length == permutation.size()) {
            permutations.add(new ArrayList<>(permutation));
            return;
        }
        for (int num : nums) {
            if (!permutation.contains(num)) {
                permutation.add(num);
                backtrack(permutation, nums);
                permutation.removeLast();
            }
        }
    }
}
