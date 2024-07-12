package linkedlists;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            var temp = head.next;
            head.next = result;
            result = head;
            head = temp;
        }
        return result;
    }


    public ListNode reverseList2(ListNode head, int left, int right) {
        if (left == right || head == null) {
            return head;
        }
        var dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftPointer = dummy;
        for (int i = 0; i < left - 1; i++) {
            leftPointer = leftPointer.next;
        }

        ListNode current = leftPointer.next;
        while (left < right) {
            var temp = current.next;
            current.next = temp.next;
            temp.next = leftPointer.next;
            leftPointer.next = temp;
            left++;
        }
        return dummy.next;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null) {
            return head;
        }
        // phase 1 setting pointer just before the sub-list we are going to reverse
        var dummy = new ListNode(0);
        dummy.next = head;
        var leftPointer = dummy;

        for(int i = 0; i < left - 1; i++) {
            leftPointer = leftPointer.next;
        }

        // phase 2 reverse the subList (after traverse current will point to the node just after the reversed ones)
        ListNode revSubList = null;
        ListNode current = leftPointer.next;
        ListNode subListHead = current;

        while(current != null && left <= right) {
            var tempNext = current.next;
            current.next = revSubList;
            revSubList = current;
            current = tempNext;
            left++;
        }

        // phase 3 connect reversed list to the head and tail

        leftPointer.next = revSubList;
        subListHead.next = current;
        return dummy.next;
    }

}
