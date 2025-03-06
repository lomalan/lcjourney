package greedy;

import java.util.Deque;
import java.util.LinkedList;

public class JumpGame2 {
    public int minJump(int[] nums) {
        Deque<Node> queue = new LinkedList<>();
        queue.add(new Node(nums[0], 0));

        int step = 0;
        int goal = nums.length - 1;
        while (!queue.isEmpty()) {
            step++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                var node = queue.poll();
                if (node.value + node.index >= goal) {
                    return step;
                }
                for (int j = 1; j <= node.value; j++) {
                    int index = j + node.index;
                    queue.add(new Node(nums[index], index));
                }
                
            }
        }
        return step;
    }

    public int jump(int[] nums) {
        int step = 0, left = 0, right = 0;
        while (right < nums.length - 1) {
            int maxStep = 0;
            for (int i = left; i < right + 1; i++) {
                maxStep = Math.max(maxStep, nums[i] + i);
            }
            left = right + 1;
            right = maxStep;
            step++;
        }
        
        return step;
    }

    private class Node {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
        
    }
}
