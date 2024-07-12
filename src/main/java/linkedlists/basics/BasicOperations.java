package linkedlists.basics;

import linkedlists.ListNode;

public class BasicOperations {
    public static ListNode swapElements(ListNode head, int x, int y) {
        if (x == y) {
            return head;
        }
        if (x > y){
            var temp = x;
            x = y;
            y = temp;
        }
        var dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevX = dummy;
        var currX = dummy;
        ListNode prevY = dummy;
        var currY = dummy;

        // traversing till find a point
        while (currX != null && currX.val != x) {
            prevX = currX;
            currX = currX.next;
        }

        while (currY != null && currY.val != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return head;
        }

        //swapping if prevY == currX it means that nodes are adjacent
        if (prevY != currX) {
            var temp = currX.next;
            currX.next = currY.next;
            prevY.next = currX;
            currY.next = temp;
        } else  { // swapping adjacent nodes
            currX.next = currY.next;
            currY.next = prevY;
        }
        prevX.next = currY;
        return dummy.next;
    }
}
