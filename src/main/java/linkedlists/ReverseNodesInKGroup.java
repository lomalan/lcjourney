package linkedlists;

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }
        var dummy = new ListNode(0);
        dummy.next = head;
        var pointer = dummy;
        var left = dummy.next;
        var right = dummy.next;
        while (left != null) {
            // Moving right to the last node of reversed subList
            for (int i = 0; i < k - 1; i++) {
                right = right.next;
                if (right == null) {
                    return dummy.next;
                }
            }

            var result = right.next;
            // reversing sub list
            for (int i = 0; i < k; i++) {
                var temp = left.next;
                left.next = result;
                result = left;
                left = temp;
            }
            pointer.next = result;
            for (int i = 0; i < k; i++) {
                pointer = pointer.next;
            }
            right = left;
        }
        return dummy.next;
    }

    // Visualise this solution, then put two explanations in the notion
    public ListNode reverseKGroupOpt(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode temp = null;

        int count = k;

        // temp 1 -> 2 -> 3 -> 4 -> 5; prev = 0, 2, 3, 4, 5; curr = 1, 3, 4, 5; prev = 0, 1, 3, 4, 5
        while (curr != null) {
            if (count > 1) {
                temp = prev.next;
                prev.next = curr.next;
                curr.next = curr.next.next;
                prev.next.next = temp;

                count--;
            } else {
                prev = curr;
                curr = curr.next;

                ListNode end = curr;

                for (int i = 0; i < k; ++i) {
                    if (end == null) {
                        return dummy.next;
                    }
                    end = end.next;
                }
                count = k;
            }
        }

        return dummy.next;
    }
}
