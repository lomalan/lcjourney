package greedy;

public class MaxSubArray {
    
   public int maxSubArray(int[] nums) {
        int max = nums[0], currMax = 0;
        for(int num: nums) {
            currMax += num;
            max = Math.max(max, currMax);
            if (currMax < 0) {
                currMax = 0;
            }
        }
        return max;   
    } 
}
