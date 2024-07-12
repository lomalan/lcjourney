package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.RemoveNthNode;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveNthNodeTest {

    private final RemoveNthNode removeNthNode = new RemoveNthNode();

    ListNode testNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

    @Test
    public void removeNthNodeWith1SizedList() {
        var result = removeNthNode.removeNthFromEnd(new ListNode(1), 1);
        assertEquals("None", listToString(result));
    }

    @Test
    public void removeNthNodeWith2SizedList() {
        var result = removeNthNode.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1);
        assertEquals("1 -> None", listToString(result));
    }

    @Test
    public void removeNthNodeWith5SizedList() {
        var result = removeNthNode.removeNthFromEnd(testNode, 2);
        assertEquals("1 -> 2 -> 3 -> 5 -> None", listToString(result));
    }

    @Nested
    public class Optimal {
        @Test
        public void removeNthNodeWith1SizedList() {
            var result = removeNthNode.removeNthFromEndOptimal(new ListNode(1), 1);
            assertEquals("None", listToString(result));
        }

        @Test
        public void removeNthNodeWith2SizedList() {
            var result = removeNthNode.removeNthFromEndOptimal(new ListNode(1, new ListNode(2)), 1);
            assertEquals("1 -> None", listToString(result));
        }

        @Test
        public void removeNthNodeWith5SizedList() {
            var result = removeNthNode.removeNthFromEndOptimal(testNode, 2);
            assertEquals("1 -> 2 -> 3 -> 5 -> None", listToString(result));
        }
    }
}
