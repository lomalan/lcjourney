package trees;

import java.util.Deque;
import java.util.LinkedList;

public class MaxDepth {

    public int maxDepthDfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepthDfs(root.left), 1 + maxDepthDfs(root.right));
    }

    public int maxDepthBfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        int levels = 0;
        while (!treeNodes.isEmpty()) {
            var size = treeNodes.size();
            while (size > 0) {
                var node = treeNodes.removeFirst();
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
                size--;
            }
            levels++;
        }
        return levels;
    }
}
