package trees;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeSerializeDeserializeTest {

    private final TreeSerializeDeserialize treeSerializeDeserialize = new TreeSerializeDeserialize();

    @Test
    void serializeOneNodeTree() {
        assertEquals("5,n,n,", treeSerializeDeserialize.serialize(new TreeNode(5)));
    }

    @Test
    void deSerializeOneNodeTree() {
        assertEquals(new TreeNode(5), treeSerializeDeserialize.deserialize("5,n,n,"));
    }

    private final String expectedString = "-1,2,3,n,n,4,5,n,n,n,n,";
    private final TreeNode expectedRoot = new TreeNode(-1,
            new TreeNode(2),
            new TreeNode(3, new TreeNode(4), new TreeNode(5)));
    @Test
    void serializeMultipleNodeTree() {
        assertEquals(expectedString, treeSerializeDeserialize.serialize(expectedRoot));
    }

    @Test
    void deSerializeMultipleNodeTree() {
        assertEquals(expectedRoot, treeSerializeDeserialize.deserialize(expectedString));
    }

    @Nested
    public class PreOrder {
        @Test
        void serializeOneNodeTree() {
            assertEquals("5,n,n,", treeSerializeDeserialize.serializePreOrder(new TreeNode(5)));
        }

        @Test
        void deSerializeOneNodeTree() {
            assertEquals(new TreeNode(5), treeSerializeDeserialize.deserializePreOrder("5,n,n,"));
        }

        private final String expectedString = "-1,2,n,n,3,4,n,n,5,n,n,";
        private final TreeNode expectedRoot = new TreeNode(-1,
                new TreeNode(2),
                new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        @Test
        void serializeMultipleNodeTree() {
            assertEquals(expectedString, treeSerializeDeserialize.serializePreOrder(expectedRoot));
        }

        @Test
        void deSerializeMultipleNodeTree() {
            assertEquals(expectedRoot, treeSerializeDeserialize.deserializePreOrder(expectedString));
        }
    }
}