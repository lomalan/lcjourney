package trees;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IdenticalTest {
    private final Identical identical = new Identical();

    @Nested
    public class BFS {
        @Test
        public void testIdentical() {
            var tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
            var tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
            assertTrue(identical.isSameTree(tree1, tree));
        }

        @Test
        public void testNonIdentical1() {
            var tree = new TreeNode(1, new TreeNode(2), null);
            var tree1 = new TreeNode(1, null, new TreeNode(2));
            assertFalse(identical.isSameTree(tree, tree1));
        }

        @Test
        public void testNonIdentical2() {
            var tree = new TreeNode(1, new TreeNode(2), new TreeNode(1));
            var tree1 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
            assertFalse(identical.isSameTree(tree1, tree));
        }

        @Test
        public void testNonIdentical3() {
            var tree = new TreeNode(1);
            assertFalse(identical.isSameTree(null, tree));
        }
    }

    @Nested
    public class DFS {
        @Test
        public void testIdentical() {
            var tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
            var tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
            assertTrue(identical.isSameTreeDfs(tree1, tree));
        }

        @Test
        public void testNonIdentical1() {
            var tree = new TreeNode(1, new TreeNode(2), null);
            var tree1 = new TreeNode(1, null, new TreeNode(2));
            assertFalse(identical.isSameTreeDfs(tree, tree1));
        }

        @Test
        public void testNonIdentical2() {
            var tree = new TreeNode(1, new TreeNode(2), new TreeNode(1));
            var tree1 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
            assertFalse(identical.isSameTreeDfs(tree1, tree));
        }

        @Test
        public void testNonIdentical3() {
            var tree = new TreeNode(1);
            assertFalse(identical.isSameTreeDfs(null, tree));
        }
    }
}