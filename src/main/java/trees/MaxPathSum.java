package trees;

public class MaxPathSum {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathDfs(root);
        return res;   
    }

    private int maxPathDfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Case 1. Calculating max per every branch
        var leftSum = Math.max(maxPathDfs(root.left), 0);
        var rightSum = Math.max(maxPathDfs(root.right), 0);
        res = Math.max(root.val + leftSum + rightSum, res);

        // Case 2. When we need to return possible max for the current path
        return root.val + Math.max(leftSum, rightSum);
    }
}
