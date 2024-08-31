package trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {
    private final LevelOrder levelOrder = new LevelOrder();

    @Test
    void testOneElement() {
        assertEquals(List.of(List.of(1)), levelOrder.levelOrder(new TreeNode(1)));
    }

    @Test
    void testMultipleElements() {
        var testTree = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        ), levelOrder.levelOrder(testTree));
    }

    @Test
    void testMultipleElement2() {
        var testTree = new TreeNode(3,
                new TreeNode(9, new TreeNode(13), new TreeNode(12)),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(List.of(
                List.of(3),
                List.of(9, 20),
                List.of(13, 12, 15, 7)
        ), levelOrder.levelOrder(testTree));
    }

    @Test
    void testNullableTree() {
        assertEquals(List.of(), levelOrder.levelOrder(null));
    }

}