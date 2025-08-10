//package VI_LinkedList.LogicBuilding;
//import  java.util.*;
//
//
//public class deleteFromEndLLBruite19 {
//
//    public static void printLL(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
//        int N = 3;
//        ListNode head = new ListNode(arr.get(0));
//        head.next = new ListNode(arr.get(1));
//        head.next.next = new ListNode(arr.get(2));
//        head.next.next.next = new ListNode(arr.get(3));
//        head.next.next.next.next = new ListNode(arr.get(4));
//
//        // Solution instance
//        Solution sol = new Solution();
//        head = sol.removeNthFromEnd(head, N);
//        printLL(head);
//    }
//}