package trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ConstructBtreeTest {
    private final ConstructBTree constructBTree = new ConstructBTree();

    @Nested
    public class NonOptimal {
        @Test
        public void constructFromOneElement() {
            assertEquals(new TreeNode(-1), constructBTree.buildTree(new int[] {-1}, new int[] {-1}));
        }
    
        @Test
        public void constructFromNultipleElements() {
            assertEquals(new TreeNode(3, 
                new TreeNode(9), 
                new TreeNode(20, new TreeNode(15), new TreeNode(7))), 
            constructBTree.buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7}));
        }
    }
    
    @Nested
    public class Optimal {
        @Test
        public void constructFromOneElement() {
            assertEquals(new TreeNode(-1), constructBTree.buildTreeOptimal(new int[] {-1}, new int[] {-1}));
        }
    
        @Test
        public void constructFromMultipleElements() {
            assertEquals(new TreeNode(3, 
                new TreeNode(9), 
                new TreeNode(20, new TreeNode(15), new TreeNode(7))), 
            constructBTree.buildTreeOptimal(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7}));
        }
    }
}
