//package VI_LinkedList.LogicBuilding;
//
//
//// Definition for singly-linked list
//
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode t1 = l1;
//        ListNode t2 = l2;
//
//        ListNode current = dummy;
//
//        int carry = 0;
//
//        while( t1 != null || t2 != null ){
//            int sum = carry;
//            if(t1 != null){
//                sum += t1.val;
//            }
//
//            if(t2 != null){
//                sum+= t2.val;
//            }
//
//            ListNode node = new ListNode(sum%10);
//            carry = sum / 10;
//
//            current.next = node;
//            current = current.next;
//
//            if(t1 != null)
//                t1 = t1.next;
//
//            if(t2 != null)
//                t2 = t2.next;
//        }
//
//        if(carry!= 0){
//            ListNode node = new ListNode(carry);
//            current.next = node;
//            current = current.next;
//        }
//        return dummy;
//    }
//}
//
//// Function to print the linked list
//class addTwoLinkedList {
//    public static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        // Manual creation of linked list
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//
//        // Instance of solution class
//        Solution solution = new Solution();
//        ListNode result = solution.addTwoNumbers(l1, l2);
//
//        // Print the result
//        printList(result);
//    }
//}