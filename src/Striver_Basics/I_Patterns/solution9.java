package Striver_Basics.I_Patterns;

import java.util.Scanner;

class solution9 {
    public void pattern9(int n) {
        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (2*n)-2*i-1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution9 obj = new solution9();
        obj.pattern9(N);
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
