package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterTest {

    private final Diameter diameter = new Diameter();

    @Test
    void diameterTest1() {
        assertEquals(3, diameter.diameterOfBinaryTree(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)))
        );
    }

    @Test
    void diameterTest2() {
        assertEquals(1, diameter.diameterOfBinaryTree(
                new TreeNode(1, new TreeNode(2), null))
        );
    }

}