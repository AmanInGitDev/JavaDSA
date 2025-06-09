package Patterns;

import java.util.Scanner;

class solution16 {
    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {

            char ch = (char) ('A'+i);
            for (int j=0; j<=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution16 obj = new solution16();
        obj.pattern15(N);
    }
}