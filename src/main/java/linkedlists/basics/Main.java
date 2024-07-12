package linkedlists.basics;

import linkedlists.ListNode;

import static linkedlists.basics.BasicOperations.swapElements;

public class Main {
    public static void main(String[] args) {
        test1(initializeNode());
        test2(initializeNode());
        test3(initializeNode());
        test4(initializeNode());
        test5(initializeNode());
        test6(initializeNode());
        test7(initializeNode());
        test8(initializeNode());
        test9(initializeNode());
    }

    private static ListNode initializeNode() {
        // Test case 1: Create the list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);
        return head;
    }

    private static void test1(ListNode head) {
        head = swapElements(head, 2, 4);
        System.out.println("List after swapping nodes with values 2 and 4:");
        printList(head);
    }

    private static void test2(ListNode head) {
        head = swapElements(head, 1, 3);
        System.out.println("List after swapping nodes with values 1 and 3:");
        printList(head);
    }

    private static void test3(ListNode head) {
        head = swapElements(head, 1, 5);
        System.out.println("List after swapping nodes with values 1 and 5:");
        printList(head);
    }

    private static void test4(ListNode head) {
        head = swapElements(head, 5, 3);
        System.out.println("List after swapping nodes with values 5 and 3:");
        printList(head);
    }

    private static void test5(ListNode head) {
        head = swapElements(head, 2, 2);
        System.out.println("List after swapping nodes with values 2 and 2 (same value):");
        printList(head);
    }

    private static void test6(ListNode head) {
        head = swapElements(head, 6, 7);
        System.out.println("List after attempting to swap non-existent nodes with values 6 and 7:");
        printList(head);
    }

    private static void test7(ListNode head) {
        head = swapElements(head, 1, 2);
        System.out.println("List after attempting to swap nodes with values 1 and 2:");
        printList(head);
    }

    private static void test8(ListNode head) {
        head = swapElements(head, 3, 4);
        System.out.println("List after attempting to swap nodes with values 3 and 4:");
        printList(head);
    }

    private static void test9(ListNode head) {
        head = swapElements(head, 4, 5);
        System.out.println("List after attempting to swap nodes with values 4 and 5:");
        printList(head);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("None");
    }
}
