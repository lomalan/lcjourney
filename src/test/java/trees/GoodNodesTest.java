package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoodNodesTest {
    private final GoodNodes goodNodes = new GoodNodes();

    @Test
    public void testNullableNode() {
        assertEquals(0, goodNodes.goodNodes(null));
    }

    @Test
    public void testOnlyRootNode() {
        assertEquals(1, goodNodes.goodNodes(new TreeNode(1)));
    }

    @Test
    public void testMultipleGoodNodes() {
        assertEquals(4, goodNodes.goodNodes(
                new TreeNode(3,
                        new TreeNode(1, new TreeNode(3), null),
                        new TreeNode(4, new TreeNode(1), new TreeNode(5)))
        ));
    }

    @Test
    public void testMultipleGoodNodes2() {
        assertEquals(3, goodNodes.goodNodes(
                new TreeNode(3,
                        new TreeNode(3, new TreeNode(4), new TreeNode(2)),
                        null)
        ));
    }

    @Test
    public void testMultipleGoodNodes3() {
        assertEquals(4, goodNodes.goodNodes(
                new TreeNode(2,
                        null,
                        new TreeNode(4, new TreeNode(10), new TreeNode(8, new TreeNode(4), null)))
        ));
    }

    @Test
    public void testOneGoodNodeWithMultipleBranches() {
        assertEquals(1, goodNodes.goodNodes(
                new TreeNode(9, null,
                        new TreeNode(3, new TreeNode(6), null))
        ));
    }

}