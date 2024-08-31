package trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RightSideViewTest {
    private final RightSideView rightSideView = new RightSideView();

    @Test
    void testNullableRoot() {
        assertEquals(List.of(), rightSideView.rightSideView(null));
    }

    @Test
    void testOneElementRoot() {
        assertEquals(List.of(1), rightSideView.rightSideView(new TreeNode(1)));
    }

    @Test
    void testLeftBranchedTree() {
        assertEquals(List.of(1, 2), rightSideView.rightSideView(new TreeNode(1, new TreeNode(2), null)));
    }

    @Test
    void testRightBranchedTree() {
        assertEquals(List.of(1, 3), rightSideView.rightSideView(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }

    @Test
    void testMultipleLevelLeftSidedTree() {
        assertEquals(List.of(1, 3, 5), rightSideView.rightSideView(new TreeNode(1,
                new TreeNode(2, new TreeNode(5), null),
                new TreeNode(3))));
    }

    @Test
    void testMultipleLevelLeftSidedTree1() {
        assertEquals(List.of(1, 3, 7), rightSideView.rightSideView(new TreeNode(1,
                new TreeNode(2, new TreeNode(5), new TreeNode(7)),
                new TreeNode(3))));
    }

    @Test
    void testMultipleLevelRightSidedTree1() {
        assertEquals(List.of(1, 3, 6), rightSideView.rightSideView(new TreeNode(1,
                new TreeNode(2, new TreeNode(5), new TreeNode(7)),
                new TreeNode(3, new TreeNode(6), null))));
    }

    @Test
    void testMultipleLevelRightSidedTree2() {
        assertEquals(List.of(1, 3, 8), rightSideView.rightSideView(new TreeNode(1,
                new TreeNode(2, new TreeNode(5), new TreeNode(7)),
                new TreeNode(3, new TreeNode(6), new TreeNode(8)))));
    }

}