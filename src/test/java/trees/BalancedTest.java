package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedTest {
    private final Balanced balanced = new Balanced();

    @Test
    void testEmpty() {
        assertTrue(balanced.isBalanced(null));
    }

    @Test
    void testBalanced() {
        assertTrue(balanced.isBalanced(new TreeNode(1,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))))
        );
    }

    @Test
    void testUnBalanced() {
        assertFalse(balanced.isBalanced(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
                new TreeNode(2))));
    }

}