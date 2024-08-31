package trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        nodes.add(root);
        while (!nodes.isEmpty()) {
            var levelSize = nodes.size();
            List<Integer> levelElements = new ArrayList<>();
            while (levelElements.size() < levelSize) {
                var currentElement = nodes.removeFirst();
                if (currentElement.left != null) {
                    nodes.add(currentElement.left);
                }
                if (currentElement.right != null) {
                    nodes.add(currentElement.right);
                }
                levelElements.add(currentElement.val);
            }
            result.add(levelElements);
        }
        return result;
    }
}
