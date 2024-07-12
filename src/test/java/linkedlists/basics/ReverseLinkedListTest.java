package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.ReverseLinkedList;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Nested
    public class FullReverse {
        @Test
        public void reverseNull() {
            var result = reverseLinkedList.reverseList(null);
            assertEquals("None", listToString(result));
        }

        @Test
        public void reverseListOneElement() {
            var result = reverseLinkedList.reverseList(new ListNode(1));
            assertEquals("1 -> None", listToString(result));
        }

        @Test
        public void reverseListWithTwoElements() {
            var result = reverseLinkedList.reverseList(new ListNode(1, new ListNode(2)));
            assertEquals("2 -> 1 -> None", listToString(result));
        }

        @Test
        public void reverseListWithFiveElements() {
            var result = reverseLinkedList.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
            assertEquals("5 -> 4 -> 3 -> 2 -> 1 -> None", listToString(result));
        }
    }

    @Nested
    public class SubsetReverse {
        @Test
        public void reverseNull() {
            var result = reverseLinkedList.reverseList2(null, 5, 6);
            assertEquals("None", listToString(result));
        }

        @Test
        public void reverseListOneElement() {
            var result = reverseLinkedList.reverseList2(new ListNode(1), 1 , 1);
            assertEquals("1 -> None", listToString(result));
        }

        ListNode testNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        @Test
        public void reverseListSameElement() {
            var result = reverseLinkedList.reverseList2(testNode, 3 , 3);
            assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> None", listToString(result));
        }

        @Test
        public void reverseListWithTwoElements() {
            var result = reverseLinkedList.reverseList2(new ListNode(1, new ListNode(2)), 1, 2);
            assertEquals("2 -> 1 -> None", listToString(result));
        }

        @Test
        public void reverseFirstListElementsWithFiveElements() {
            var result = reverseLinkedList.reverseList2(testNode, 1, 2);
            assertEquals("2 -> 1 -> 3 -> 4 -> 5 -> None", listToString(result));
        }
        @Test
        public void reverseMiddleListElementsWithFiveElements() {
            var result = reverseLinkedList.reverseBetween(testNode, 2, 4);
            assertEquals("1 -> 4 -> 3 -> 2 -> 5 -> None", listToString(result));
        }
        @Test
        public void reverseAllListElementsWithFiveElements() {
            var result = reverseLinkedList.reverseList2(testNode, 1, 5);
            assertEquals("5 -> 4 -> 3 -> 2 -> 1 -> None", listToString(result));
        }
        @Test
        public void reverseLastListElementsWithFiveElements() {
            var result = reverseLinkedList.reverseList2(testNode, 4, 5);
            assertEquals("1 -> 2 -> 3 -> 5 -> 4 -> None", listToString(result));
        }
    }
}
