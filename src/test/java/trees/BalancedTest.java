package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedTest {
    private final Balanced balanced = new Balanced();

    @Test
    public void testEmpty() {
        assertTrue(balanced.isBalanced(null));
    }

    @Test
    public void testBalanced() {
        assertTrue(balanced.isBalanced(new TreeNode(1,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))))
        );
    }

    @Test
    public void testUnBalanced() {
        assertFalse(balanced.isBalanced(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
                new TreeNode(2))));
    }

}