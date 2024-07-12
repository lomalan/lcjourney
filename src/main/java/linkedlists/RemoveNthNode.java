package linkedlists;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        var dummy = new ListNode(0, head);
        var pointer = dummy;
        var size = 0;
        while (pointer != null) {
            pointer = pointer.next;
            size++;
        }

        var previousPointer = dummy;
        for (int i = 0; i < size - n - 1; i++) {
            previousPointer = previousPointer.next;
        }
        var nodeToDelete = previousPointer.next;
        previousPointer.next = nodeToDelete.next;
        return dummy.next;
    }

    public ListNode removeNthFromEndOptimal(ListNode head, int n) {
        var dummy = new ListNode(0, head);
        var leftPointer = dummy;
        var rightPointer = head;
        for (int i = 0; i < n; i++) {
            rightPointer = rightPointer.next;
        }

        while (rightPointer != null) {
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next;
        }
        var nodeToDelete = leftPointer.next;
        leftPointer.next = nodeToDelete.next;
        return dummy.next;
    }
}
