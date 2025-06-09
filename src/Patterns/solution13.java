import java.util.Scanner;

class solution13 {
    int num = 1;
    public void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution13 obj = new solution13();
        obj.pattern13(N);
    }
}