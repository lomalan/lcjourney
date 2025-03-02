package greedy;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int remainingLength = nums[0];
        for (int i = 1; i < nums.length -1 && remainingLength > 0; i++) {
            if (remainingLength <= nums[i]) {
                remainingLength = nums[i];
            } else {
                remainingLength--;
            }
        }
        return remainingLength > 0;
    }

    public boolean canJumpAnother(int[] nums) {
        int post = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= post) {
                post = i;
            }
        }
        return post == 0;
    }
}
