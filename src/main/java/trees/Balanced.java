package trees;

public class Balanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        var leftDepth = maxDepthDfs(root.left);
        var rightDepth = maxDepthDfs(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepthDfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepthDfs(root.left), 1 + maxDepthDfs(root.right));
    }
}
