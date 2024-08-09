package twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            var lValue = height[l];
            var rValue = height[r];
            var currArea = (r - l) * Math.min(lValue, rValue);
            if (lValue < rValue) {
                l++;
            } else {
                r--;
            }
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
