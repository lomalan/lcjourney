package linkedlists.basics;

import linkedlists.AddTwoNumbers;
import linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addNumbersOnZeroLists() {
        var l1 = new ListNode(0);
        var l2 = new ListNode(0);

        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals("0 -> None", listToString(result));
    }

    @Test
    public void addNumbersOnSameSizeLists() {
        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals("7 -> 0 -> 8 -> None", listToString(result));
    }

    @Test
    public void addNumbersOnDifferentSizeLists() {
        var l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        var l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        var result = addTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals("8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1 -> None", listToString(result));
    }

}
