package linkedlists;

public class ReorderLinkedList {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        var slow = head;
        var fast = head;

        // Step 1. Finding a split point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2. Reversing the second part of the list
        var secondListPointer = slow.next;
        slow.next = null;
        ListNode secondList = null;
        while (secondListPointer != null) {
            var temp = secondListPointer.next;
            secondListPointer.next = secondList;
            secondList = secondListPointer;
            secondListPointer = temp;
        }

        // Step 3. Merging lists together
        ListNode first = head;
        while (secondList != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = secondList.next;
            first.next = secondList;
            secondList.next = tmp1;
            first = tmp1;
            secondList = tmp2;
        }
    }

}
