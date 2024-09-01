package trees;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateBSTTest {
    private final ValidateBST validateBST = new ValidateBST();
    
    @Test
    public void testValidTwoLevelTree() {
        assertTrue(validateBST.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }
    
    @Test
    public void testInvalidTwoLevelTree() {
        assertFalse(validateBST.isValidBST(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    } 
    
    @Test
    public void testInvalidMultiLevelTree() {
        assertFalse(validateBST.isValidBST(new TreeNode(5, 
        new TreeNode(1), 
        new TreeNode(4, new TreeNode(3), new TreeNode(6))))
        );
    }
    
    @Test
    public void testValidMultiLevelTree() {
        assertTrue(validateBST.isValidBST(new TreeNode(5, 
        new TreeNode(1), 
        new TreeNode(8, new TreeNode(7), new TreeNode(9))))
        );
    } 
    
    @Test
    public void testInvalidMultiLevelTree2() {
        assertFalse(validateBST.isValidBST(new TreeNode(5, 
        new TreeNode(1, new TreeNode(3), new TreeNode(6)), 
        new TreeNode(8, new TreeNode(2), new TreeNode(9))))
        );
    }
    
    @Test
    public void testSameValueTree() {
        assertFalse(validateBST.isValidBST(new TreeNode(2, new TreeNode(2), new TreeNode(2)))); 
    }
    
    @Test
    public void testBiggerThanMaxIntegerTree() {
        assertTrue(validateBST.isValidBST(new TreeNode(Integer.MAX_VALUE))); 
    }
}
