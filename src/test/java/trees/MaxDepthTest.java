package trees;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {

    private final MaxDepth maxDepth = new MaxDepth();

    @Nested
    class DFS {
        @Test
        void testZeroLevel() {
            assertEquals(0, maxDepth.maxDepthDfs(null));
        }

        @Test
        void testOneLevel() {
            assertEquals(1, maxDepth.maxDepthDfs(new TreeNode(1)));
        }

        @Test
        void testTwoLevel() {
            assertEquals(2, maxDepth.maxDepthDfs(new TreeNode(1, new TreeNode(2), null)));
        }

        @Test
        void testThreeLevel() {
            assertEquals(3, maxDepth.maxDepthDfs(new TreeNode(1, new TreeNode(2), new TreeNode(20, new TreeNode(15), new TreeNode(17)))));
        }
    }

    @Nested
    class BFS {
        @Test
        void testZeroLevel() {
            assertEquals(0, maxDepth.maxDepthBfs(null));
        }

        @Test
        void testOneLevel() {
            assertEquals(1, maxDepth.maxDepthBfs(new TreeNode(1)));
        }

        @Test
        void testTwoLevel() {
            assertEquals(2, maxDepth.maxDepthBfs(new TreeNode(1, new TreeNode(2), null)));
        }

        @Test
        void testThreeLevel() {
            assertEquals(3, maxDepth.maxDepthBfs(new TreeNode(1, new TreeNode(2), new TreeNode(20, new TreeNode(15), new TreeNode(17)))));
        }
    }

}