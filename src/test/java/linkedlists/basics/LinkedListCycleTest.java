package linkedlists.basics;

import linkedlists.LinkedListCycle;
import linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListCycleTest {
    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void testIfOneNodeHasCycle() {
        var l1 = new ListNode(0);

        assertFalse(linkedListCycle.hasCycle(l1));
    }

    @Test
    public void testIfMultipleNodeHasCycle() {
        var n1 = new ListNode(3);
        var n2 = new ListNode(2);
        var n3 = new ListNode(0);
        var n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        assertTrue(linkedListCycle.hasCycle(n1));
    }

}
