package Patterns;

import java.util.Scanner;

class solution6 {
    public static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution6 obj = new solution6();
        obj.pattern6(N);
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
