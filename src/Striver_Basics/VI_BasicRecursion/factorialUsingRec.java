package Striver_Basics.VI_BasicRecursion;

public class factorialUsingRec {

    public int fact(int n){
        if (n <= 0 ) return 1;
        return fact(n-1) * n;
    }

    public static void main(String[] args){
        int n = 4;
        factorialUsingRec solution = new factorialUsingRec();
        int answer = solution.fact(n);
        System.out.println("Factorial is: " + answer);

    }

}
