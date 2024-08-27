package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static trees.TreeNode.insert;

public class TreeNodeTest {

    @Test
    void testTreeSize() {
        var treeNode = new TreeNode(5);
        treeNode.right = new TreeNode(5, new TreeNode(4), null);
        assertEquals(3, TreeNode.size(treeNode));
    }

    @Test
    void returnFalseIfTreeIsNotLeaf() {
        var treeNode = new TreeNode(7);
        treeNode.right = new TreeNode(5, new TreeNode(4), null);
        assertFalse(TreeNode.isLeaf(treeNode));
    }

    @Test
    void returnTrueIfTreeIsNotLeaf() {
        var treeNode = new TreeNode(5);
        assertTrue(TreeNode.isLeaf(treeNode));
    }

    @Test
    void insertNullableTree() {
        assertEquals(5, insert(null, 5).val);
    }

    @Test
    void insertLesserValue() {
        var treeNode = new TreeNode(5);
        assertEquals(4, insert(treeNode, 4).left.val);
    }

    @Test
    void insertBiggerValue() {
        var treeNode = new TreeNode(6);
        assertEquals(6, insert(treeNode, 6).right.val);
    }

    @Test
    void findNonExistedValue() {
        var treeNode = new TreeNode(7);
        treeNode.right = new TreeNode(5, new TreeNode(4), null);
        assertFalse(TreeNode.find(treeNode, 9));
    }

    @Test
    void findExistedValue() {
        var treeNode = new TreeNode(7);
        treeNode.left = new TreeNode(5, new TreeNode(4), null);
        assertTrue(TreeNode.find(treeNode, 4));
    }
}
