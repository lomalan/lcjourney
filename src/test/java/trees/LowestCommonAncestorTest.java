package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {
    private final LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

    TreeNode testTree = new TreeNode(6,
            new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
            new TreeNode(8, new TreeNode(7), new TreeNode(9))
    );

    @Test
    void test1() {
        assertEquals(
                6,
                lowestCommonAncestor.lowestCommonAncestor(testTree, new TreeNode(2), new TreeNode(8)).val);
    }

    @Test
    void test2() {
        assertEquals(
                2,
                lowestCommonAncestor.lowestCommonAncestor(testTree, new TreeNode(2), new TreeNode(4)).val);
    }

    @Test
    void test3() {
        assertEquals(
                2,
                lowestCommonAncestor.lowestCommonAncestor(testTree, new TreeNode(0), new TreeNode(5)).val);
    }

}