package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.MergeTwoSortedLists;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Nested
    public class IterativeMerge {
        @Test
        public void mergeTwoNulls() {
            var result = mergeTwoSortedLists.mergeTwoLists(null, null);
            assertEquals("None", listToString(result));
        }

        @Test
        public void mergeOneNullWithNonNullList() {
            var result = mergeTwoSortedLists.mergeTwoLists(null, new ListNode(1, new ListNode(2)));
            assertEquals("1 -> 2 -> None", listToString(result));
        }

        @Test
        public void mergeSecondNullWithNonNullList() {
            var result = mergeTwoSortedLists.mergeTwoLists(new ListNode(1, new ListNode(2)), null);
            assertEquals("1 -> 2 -> None", listToString(result));
        }

        @Test
        public void mergeTwoLists() {
            var result = mergeTwoSortedLists.mergeTwoLists(new ListNode(3, new ListNode(4)), new ListNode(1, new ListNode(2)));
            assertEquals("1 -> 2 -> 3 -> 4 -> None", listToString(result));
        }
    }

    @Nested
    public class RecursiveMerge {
        @Test
        public void mergeTwoNulls() {
            var result = mergeTwoSortedLists.mergeTwoListsRec(null, null);
            assertEquals("None", listToString(result));
        }

        @Test
        public void mergeOneNullWithNonNullList() {
            var result = mergeTwoSortedLists.mergeTwoListsRec(null, new ListNode(1, new ListNode(2)));
            assertEquals("1 -> 2 -> None", listToString(result));
        }

        @Test
        public void mergeSecondNullWithNonNullList() {
            var result = mergeTwoSortedLists.mergeTwoListsRec(new ListNode(1, new ListNode(2)), null);
            assertEquals("1 -> 2 -> None", listToString(result));
        }

        @Test
        public void mergeTwoLists() {
            var result = mergeTwoSortedLists.mergeTwoListsRec(new ListNode(3, new ListNode(4)), new ListNode(1, new ListNode(2)));
            assertEquals("1 -> 2 -> 3 -> 4 -> None", listToString(result));
        }
    }

}
