package trees;

import java.util.Set;
import java.util.TreeSet;

public class SecondMin {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> values = new TreeSet<>();
        inorder(root, values);
        if (values.size() < 2) {
            return - 1;
        } else {
            var iterator = values.iterator();
            iterator.next();
            return iterator.next();
        }
    }

    private void inorder(TreeNode root, Set<Integer> values) {
        if (root != null) {
            inorder(root.left, values);
            values.add(root.val);
            inorder(root.right, values);
        }
    }
}
