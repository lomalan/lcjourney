package trees;

import java.util.Objects;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static boolean isEmpty(TreeNode node) {
        return node == null;
    }

    static boolean isLeaf(TreeNode node) {
        return !isEmpty(node) && node.left == null && node.right == null;
    }

    static int size(TreeNode node) {
        if (!isEmpty(node)) {
            return 1 + size(node.left) + size(node.right);
        } else {
            return 0;
        }
    }

    static TreeNode insert(TreeNode treeNode, int value) {
        if (isEmpty(treeNode)) {
            return new TreeNode(value);
        } else {
            if (value < treeNode.val) {
                treeNode.left = insert(treeNode.left, value);
            } else {
                treeNode.right = insert(treeNode.right, value);
            }
        }
        return treeNode;
    }

    static boolean find(TreeNode treeNode, int value) {
        if (isEmpty(treeNode)) {
            return false;
        } else {
            if (value == treeNode.val) {
                return true;
            }
            if (value < treeNode.val) {
                return find(treeNode.left, value);
            } else {
                return find(treeNode.right, value);
            }
        }
    }

    static void remove(TreeNode treeNode, int value) {
         if (isEmpty(treeNode)) {
             return;
         }

         if (treeNode.val == value) {
            if (!isEmpty(treeNode.left) && !isEmpty(treeNode.right)) {
                var minRight = minNode(treeNode.right);
                treeNode.val = minRight.val;
                remove(treeNode.right, minRight.val);
            } else {
                TreeNode discard = treeNode;
                if (isLeaf(treeNode)) {
                    treeNode = null;
                } else if(!isEmpty(treeNode.left)) {
                    treeNode = treeNode.left;
                } else {
                    treeNode = treeNode.right;
                }

                discard = null;
                return;
            }
         } else if(treeNode.val > value) {
             remove(treeNode.left, value);
         } else {
             remove(treeNode.right, value);
         }
    }

    static TreeNode minNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
