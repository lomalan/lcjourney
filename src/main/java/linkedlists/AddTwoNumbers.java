package linkedlists;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var dummy = new ListNode(0);
        var pointer = dummy;
        int extraValue = 0;
        while (l1 != null || l2 != null) {
            // getting values, sum and moving it
            var sum = extraValue + getValue(l1) + getValue(l2);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // creating a new pointer
            pointer.next = new ListNode(sum % 10);
            if (sum >= 10) {
                extraValue = 1;
            } else {
                extraValue = 0;
            }
            pointer = pointer.next;
        }

        if (extraValue > 0) {
            pointer.next = new ListNode(extraValue);
        }
        return dummy.next;
    }

    private int getValue(ListNode node) {
        return node == null ? 0 : node.val;
    }
}
