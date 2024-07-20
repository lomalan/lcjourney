package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.MergeKLists;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeKListsTest {

    private final MergeKLists mergeKLists = new MergeKLists();

    @Nested
    public class NonPriorityQueueSolution {

        @Test
        public void mergeThreeLists() {
            var list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
            var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
            var list3 = new ListNode(2, new ListNode(6));

            var result = mergeKLists.mergeKLists(Arrays.asList(list1, list2, list3).toArray(ListNode[]::new));
            assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> None", listToString(result));
        }

        @Test
        public void mergeFourLists() {
            var list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
            var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
            var list3 = new ListNode(2, new ListNode(6));
            var list4 = new ListNode(7, new ListNode(8));

            var result = mergeKLists.mergeKLists(Arrays.asList(list1, list2, list3, list4).toArray(ListNode[]::new));
            assertEquals("1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> 7 -> 8 -> None", listToString(result));
        }

    }

}
