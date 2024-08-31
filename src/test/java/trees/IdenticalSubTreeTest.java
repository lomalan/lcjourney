package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IdenticalSubTreeTest {
    private final IdenticalSubTree identicalSubTree = new IdenticalSubTree();

    @Test
    public void nonidenticalSubtree() {
        var tree = new TreeNode(1,
                new TreeNode(1,
                        new TreeNode(1,
                                new TreeNode(1), null), null), null);


        var subTree = new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(2)), null);

        assertFalse(identicalSubTree.isSubtree(tree, subTree));
    }

    @Test
    public void identicalSubtree() {
        var tree = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));

        var subTree = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        assertTrue(identicalSubTree.isSubtree(tree, subTree));
    }

    @Test
    public void nonIdenticalSubtree() {
        var tree = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)),
                new TreeNode(5));

        var subTree = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        assertFalse(identicalSubTree.isSubtree(tree, subTree));
    }
}