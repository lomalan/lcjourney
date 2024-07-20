package linkedlists;

public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval = 1;

        while (interval < size) {
            for (int i = 0; i < size - interval; i += 2 * interval) {
                lists[i] = new MergeTwoSortedLists().mergeTwoLists(lists[i], lists[i + interval]);
            }

            interval *= 2;
        }

        return size > 0 ? lists[0] : null;
    }
}
