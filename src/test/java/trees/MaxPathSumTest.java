package trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxPathSumTest {
    private final MaxPathSum maxPathSum = new MaxPathSum();

    @Test
    public void testSimplePath() {
        assertEquals(6, 
            maxPathSum.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test
    public void testPathWithNegativeBranches() {
        assertEquals(42, 
            maxPathSum.maxPathSum(
                new TreeNode(-10, 
                    new TreeNode(9), 
                    new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}
