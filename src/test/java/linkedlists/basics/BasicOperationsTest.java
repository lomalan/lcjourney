package linkedlists.basics;

import linkedlists.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperations.swapElements;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicOperationsTest {

    private ListNode list;

    @BeforeEach
    public void setUp() {
        list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }

    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val).append(" -> ");
            current = current.next;
        }
        sb.append("None");
        return sb.toString();
    }

    @Test
    public void swapNonAdjacentElementsInTheMiddle() {
        var result = swapElements(list, 2, 4);
        assertEquals("1 -> 4 -> 3 -> 2 -> 5 -> None", listToString(result));
    }

    @Test
    public void swapFirstAndLastElements() {
        var result = swapElements(list, 1, 5);
        assertEquals("5 -> 2 -> 3 -> 4 -> 1 -> None", listToString(result));
    }

    @Test
    public void swapNonAdjacentElementsFirst() {
        var result = swapElements(list, 1, 3);
        assertEquals("3 -> 2 -> 1 -> 4 -> 5 -> None", listToString(result));
    }

    @Test
    public void swapNonAdjacentWhenXBiggerThanY() {
        var result = swapElements(list, 5, 3);
        assertEquals("1 -> 2 -> 5 -> 4 -> 3 -> None", listToString(result));
    }

    @Test
    public void swapTheSameNode() {
        var result = swapElements(list, 3, 3);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> None", listToString(result));
    }

    @Test
    public void swapNonExistingNodes() {
        var result = swapElements(list, 3, 3);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> None", listToString(result));
    }

    @Test
    public void swapAdjacentNodesWithFirst() {
        var result = swapElements(list, 1, 2);
        assertEquals("2 -> 1 -> 3 -> 4 -> 5 -> None", listToString(result));
    }

    @Test
    public void swapAdjacentNodesWithLast() {
        var result = swapElements(list, 4, 5);
        assertEquals("1 -> 2 -> 3 -> 5 -> 4 -> None", listToString(result));
    }

    @Test
    public void swapAdjacentNodesInTheMiddle() {
        var result = swapElements(list, 2, 3);
        assertEquals("1 -> 3 -> 2 -> 4 -> 5 -> None", listToString(result));
    }

    @Test
    public void swap6SizedList() {
        list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        var result = swapElements(list, 2, 5);
        assertEquals("1 -> 5 -> 3 -> 4 -> 2 -> 6 -> None", listToString(result));
    }
}
