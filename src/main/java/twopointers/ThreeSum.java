package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Phase 1. Sort the array
        Arrays.sort(nums);
        // Phase 2. Init prev value to skip it if we already had the element
        int prev = Integer.MIN_VALUE;
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            var currValue = nums[i];
            if (prev == currValue) {
                continue;
            }
            // Phase 3. Initialise two pointers and add their sum if it's == 0
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                var leftValue = nums[left];
                var rightValue = nums[right];
                var threeSum = currValue + leftValue + rightValue;
                if (threeSum == 0) {
                    triplets.add(List.of(currValue, leftValue, rightValue));
                    while (leftValue == nums[left] && left < right) {
                        left++;
                    }
                } else if (threeSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            prev = currValue;
        }
        return triplets;
    }
}
