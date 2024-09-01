package trees;


class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);       
    }

    private boolean dfs(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max); 
    }
}