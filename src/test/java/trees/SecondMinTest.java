package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondMinTest {

    private final SecondMin secondMin = new SecondMin();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(2, new TreeNode(2), new TreeNode(2147483647));
        assertEquals(2147483647, secondMin.findSecondMinimumValue(root));
    }
}
