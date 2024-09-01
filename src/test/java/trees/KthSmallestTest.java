package trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class KthSmallestTest {
    private final KthSmallest kthSmallest = new KthSmallest();

    private TreeNode testTree = new TreeNode(6, 
        new TreeNode(4, new TreeNode(3, new TreeNode(2), null), new TreeNode(5)),
        new TreeNode(7)
    );

    @Nested
    class KthRec {
        @Test
        public void firstSmallest() {
            assertEquals(2, kthSmallest.kthSmallest(testTree, 1));
        }

        @Test
        public void secondSmallest() {
            assertEquals(3, kthSmallest.kthSmallest(testTree, 2));
        }

        @Test
        public void thirdSmallest() {
            assertEquals(4, kthSmallest.kthSmallest(testTree, 3));
        }

        @Test
        public void fifthSmallestSmallest() {
            assertEquals(6, kthSmallest.kthSmallest(testTree, 5));
        }
    }

    @Nested
    class KthStack {
        @Test
        public void firstSmallest() {
            assertEquals(2, kthSmallest.kthSmallestStack(testTree, 1));
        }

        @Test
        public void secondSmallest() {
            assertEquals(3, kthSmallest.kthSmallestStack(testTree, 2));
        }

        @Test
        public void thirdSmallest() {
            assertEquals(4, kthSmallest.kthSmallestStack(testTree, 3));
        }

        @Test
        public void fifthSmallestSmallest() {
            assertEquals(6, kthSmallest.kthSmallestStack(testTree, 5));
        }
    }
}
