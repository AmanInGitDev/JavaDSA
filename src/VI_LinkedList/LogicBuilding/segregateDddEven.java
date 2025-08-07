//import java.util.*;
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {
//        val = 0;
//        next = null;
//    }
//    ListNode(int data1) {
//        val = data1;
//        next = null;
//    }
//    ListNode(int data1, ListNode next1) {
//        val = data1;
//        next = next1;
//    }
//}
//
//class SegregateOddEven {
//    // Function to segregate odd and even indices nodes
//    public ListNode oddEvenList(ListNode head) {
//
//        return head;
//    }
//
//    // Function to print the linked list
//    public static void printLL(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 4, 2, 5, 6};
//        ListNode head = new ListNode(arr[0]);
//        ListNode curr = head;
//        for (int i = 1; i < arr.length; i++) {
//            curr.next = new ListNode(arr[i]);
//            curr = curr.next;
//        }
//
//        SegregateOddEven solution = new SegregateOddEven();
//        head = solution.oddEvenList(head);
//        printLL(head);
//    }
//}
//
//
