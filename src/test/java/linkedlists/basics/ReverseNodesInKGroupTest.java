package linkedlists.basics;

import linkedlists.ListNode;
import linkedlists.ReverseNodesInKGroup;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static linkedlists.basics.BasicOperationsTest.listToString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNodesInKGroupTest {

    private final ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();


    @Nested
    public class ReverseOpt {
        @Test
        public void noReverseHappensIfKMoreThanListSize() {
            var list = new ListNode(2, new ListNode(6));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 3);
            assertEquals("2 -> 6 -> None", listToString(result));
        }

        @Test
        public void noReverseHappensIfKIs1() {
            var list = new ListNode(2, new ListNode(6));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 1);
            assertEquals("2 -> 6 -> None", listToString(result));
        }

        @Test
        public void oneStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3)));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 2);
            assertEquals("2 -> 1 -> 3 -> None", listToString(result));
        }

        @Test
        public void twoStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 2);
            assertEquals("2 -> 1 -> 4 -> 3 -> 5 -> None", listToString(result));
        }

        @Test
        public void fullTwoStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 2);
            assertEquals("2 -> 1 -> 4 -> 3 -> None", listToString(result));
        }

        @Test
        public void fullTwoWithStep3Reverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

            var result = reverseNodesInKGroup.reverseKGroupOpt(list, 3);
            assertEquals("3 -> 2 -> 1 -> 6 -> 5 -> 4 -> None", listToString(result));
        }
    }

    @Nested
    public class Reverse {
        @Test
        public void noReverseHappensIfKMoreThanListSize() {
            var list = new ListNode(2, new ListNode(6));

            var result = reverseNodesInKGroup.reverseKGroup(list, 3);
            assertEquals("2 -> 6 -> None", listToString(result));
        }

        @Test
        public void noReverseHappensIfKIs1() {
            var list = new ListNode(2, new ListNode(6));

            var result = reverseNodesInKGroup.reverseKGroup(list, 1);
            assertEquals("2 -> 6 -> None", listToString(result));
        }

        @Test
        public void oneStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3)));

            var result = reverseNodesInKGroup.reverseKGroup(list, 2);
            assertEquals("2 -> 1 -> 3 -> None", listToString(result));
        }

        @Test
        public void twoStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

            var result = reverseNodesInKGroup.reverseKGroup(list, 2);
            assertEquals("2 -> 1 -> 4 -> 3 -> 5 -> None", listToString(result));
        }

        @Test
        public void fullTwoStepReverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

            var result = reverseNodesInKGroup.reverseKGroup(list, 2);
            assertEquals("2 -> 1 -> 4 -> 3 -> None", listToString(result));
        }

        @Test
        public void fullTwoWithStep3Reverse() {
            var list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

            var result = reverseNodesInKGroup.reverseKGroup(list, 3);
            assertEquals("3 -> 2 -> 1 -> 6 -> 5 -> 4 -> None", listToString(result));
        }
    }


}
