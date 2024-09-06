package trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightSideView {
    
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        nodes.add(root);
        while (!nodes.isEmpty()) {
            var size = nodes.size();
            for (int i = 0; i < size; i++) {
                var currentElement = nodes.removeFirst();
                if (currentElement.left != null) {
                    nodes.add(currentElement.left);
                }
                if (currentElement.right != null) {
                    nodes.add(currentElement.right);
                }
                if (i == size - 1) {
                    result.add(currentElement.val);
                }
            }
        }
        return result;
    }
}
