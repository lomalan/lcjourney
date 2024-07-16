package linkedlists;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // phase 1. Acquire cycle point
        var slow = 0; var fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        var slow2 = 0;
        // phase 2. Getting duplicate value
        do {
            slow2 = nums[slow2];
            slow = nums[slow];
        } while (slow != slow2);

        return slow;
    }
}
