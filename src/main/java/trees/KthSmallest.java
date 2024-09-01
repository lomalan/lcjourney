package trees;

import java.util.*;

public class KthSmallest {

    public int kthSmallestStack(TreeNode root, int k) {
        Deque<TreeNode> stack = new LinkedList<>();
        int pops = 0;
        var curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.removeLast();
            pops++;
            if (pops == k) {
                return curr.val;
            }
            curr = curr.right;
        }
        return 0;
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> storage = new ArrayList<>();
        inorder(root, storage);
        return storage.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> storage) {
        if (root != null) {
            inorder(root.left, storage);
            storage.add(root.val);
            inorder(root.right, storage);
        }
    }
}
