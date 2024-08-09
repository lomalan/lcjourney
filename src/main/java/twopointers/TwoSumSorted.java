package twopointers;

public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            var leftNumber = numbers[left];
            var rightNumber = numbers[right];
            if (leftNumber + rightNumber > target) {
                right--;
            } else if (leftNumber + rightNumber < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[2];
    }

    public int[] twoSumNonStandard(int[] numbers, int target) {
        int left = 0;
        int right = 1;
        while (left < right) {
            var leftNumber = numbers[left];
            var rightNumber = numbers[right];
            if (leftNumber + rightNumber > target) {
                left--;
            } else if (leftNumber + rightNumber < target) {
                left++;
                right++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[2];
    }
}
