/* Given an integer n. You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:

     *****
     *****
     *****
     *****
     *****

 */

import java.util.Scanner;

class solution1 {
    public void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution1 obj = new solution1();
        obj.pattern1(N);
    }
}
















































//class Solution {
//    public void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int N = 4;
//        Solution sol = new Solution();
//        sol.pattern1(N);
//    }
//}
