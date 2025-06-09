package Patterns;

import java.util.Scanner;

class solution15 {
    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+(n-i-1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution15 obj = new solution15();
        obj.pattern15(N);
    }
}