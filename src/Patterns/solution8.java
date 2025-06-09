package Patterns;

import java.util.Scanner;

class solution8 {
    public static void pattern8(int n) {

        for (int i = 0; i < n; i++) {
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

        solution8 obj = new solution8();
        obj.pattern8(N);
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
