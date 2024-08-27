package trees;

import java.util.Deque;
import java.util.LinkedList;

public class Identical {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        Deque<TreeNode> pQueue = new LinkedList<>();
        pQueue.add(p);
        Deque<TreeNode> qQueue = new LinkedList<>();
        qQueue.add(q);
        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode pNode = pQueue.removeFirst();
            TreeNode qNode = qQueue.removeFirst();
            if (pNode.val != qNode.val) {
                return false;
            }
            if (pNode.left != null && qNode.left != null) {
                pQueue.add(pNode.left);
                qQueue.add(qNode.left);
            } else if (pNode.left != qNode.left) {
                return false;
            }

            if (pNode.right != null && qNode.right != null) {
                pQueue.add(pNode.right);
                qQueue.add(qNode.right);
            } else if (qNode.right != pNode.right) {
                return false;
            }
        }
        return true;
    }

    public boolean isSameTreeDfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTreeDfs(p.left, q.left) && isSameTreeDfs(p.right, q.right);
    }
}
