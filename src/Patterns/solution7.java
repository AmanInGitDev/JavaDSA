package Patterns;

import java.util.Scanner;

class solution7 {
    public static void pattern7(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution7 obj = new solution7();
        obj.pattern7(N);
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
