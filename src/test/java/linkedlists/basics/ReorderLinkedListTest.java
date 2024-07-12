package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.ReorderLinkedList;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReorderLinkedListTest {

    private final ReorderLinkedList reorderLinkedList = new ReorderLinkedList();

    @Test
    public void reorderNull() {
        ListNode head = null;
        reorderLinkedList.reorderList(head);
        assertEquals("None", listToString(head));
    }

    @Test
    public void reorderListOneElement() {
        ListNode listNode = new ListNode(1);
        reorderLinkedList.reorderList(listNode);
        assertEquals("1 -> None", listToString(listNode));
    }

    @Test
    public void reverseListFiveElements() {
        ListNode testNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderLinkedList.reorderList(testNode);
        assertEquals("1 -> 5 -> 2 -> 4 -> 3 -> None", listToString(testNode));
    }

    @Test
    public void reverseListWithTwoElements() {
        ListNode listNode = new ListNode(1, new ListNode(2));
        reorderLinkedList.reorderList(listNode);
        assertEquals("1 -> 2 -> None", listToString(listNode));
    }

    @Test
    public void reverseListWithThreeElements() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        reorderLinkedList.reorderList(listNode);
        assertEquals("1 -> 3 -> 2 -> None", listToString(listNode));
    }

    @Test
    public void reverseListWithFourElements() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderLinkedList.reorderList(listNode);
        assertEquals("1 -> 4 -> 2 -> 3 -> None", listToString(listNode));
    }
}
