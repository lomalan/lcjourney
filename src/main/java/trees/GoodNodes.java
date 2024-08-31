package trees;

public class GoodNodes {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return goodNodesDfs(root, root.val);
    }

    private int goodNodesDfs(TreeNode root, int rootValue) {
        if (root == null) {
            return 0;
        }
        int accumulator = 0;
        if (root.val >= rootValue) {
            accumulator++;
        }
        return accumulator
                + goodNodesDfs(root.left, Math.max(rootValue, root.val))
                + goodNodesDfs(root.right, Math.max(rootValue, root.val));
    }
}
