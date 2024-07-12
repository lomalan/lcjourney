package linkedlists;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var dummy = new ListNode(0);
        var result = dummy;
        while (list1 != null && list2 != null) {
            int nextValue;
            if (list1.val <= list2.val) {
                nextValue = list1.val;
                list1 = list1.next;
            } else {
                nextValue = list2.val;
                list2 = list2.next;
            }
            dummy.next = new ListNode(nextValue);
            dummy = dummy.next;
        }

        if (list1 != null) {
            dummy.next = list1;
        }
        if (list2 != null) {
            dummy.next = list2;
        }

        return result.next;
    }

    public ListNode mergeTwoListsRec(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
