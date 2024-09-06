package trees;

import java.util.Deque;
import java.util.LinkedList;

public class TreeSerializeDeserialize {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder serialized = new StringBuilder();
        // Using BFS
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                var node = queue.removeFirst();
                if (node == null) {
                    serialized.append("n,");
                } else {
                    serialized.append(node.val).append(",");
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        return serialized.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        var serialisedTree = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(serialisedTree[0]));
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        for (int i = 1; i < serialisedTree.length && !deque.isEmpty(); i++) {
            var node = deque.removeFirst();
            if (!serialisedTree[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(serialisedTree[i]));
                node.left = left;
                deque.add(left);
            }
            i++;
            if (!serialisedTree[i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(serialisedTree[i]));
                node.right = right;
                deque.add(right);
            }
        }
        return root;
    }

    // Encodes a tree to a single string.
    public String serializePreOrder(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder serialized = new StringBuilder();
        dfs(root, serialized);
        return serialized.toString();
    }

    private void dfs(TreeNode treeNode, StringBuilder stringBuilder) {
        if (treeNode == null) {
            stringBuilder.append("n,");
        } else {
            stringBuilder.append(treeNode.val).append(",");
            dfs(treeNode.left, stringBuilder);
            dfs(treeNode.right, stringBuilder);
        }
    }

    private int i = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserializePreOrder(String data) {
        var tokens = data.split(",");
        return deserialiseDfs(tokens);
    }
    private TreeNode deserialiseDfs(String[] tokens) {
        String token = tokens[this.i];
        if (token.equals("n")) {
            this.i++;
            return null;
        }
        var node = new TreeNode(Integer.parseInt(token));
        this.i++;
        node.left = deserialiseDfs(tokens);
        node.right = deserialiseDfs(tokens);
        return node;
    }

}
