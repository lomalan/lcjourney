package twopointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, leftMax = 0, right = height.length - 1, rightMax = 0, result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                result += Math.max(leftMax - height[left], 0);
                leftMax = Math.max(leftMax, height[left]);
                left++;
            } else {
                result += Math.max(rightMax - height[right], 0);
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }
        return result;
    }
}
