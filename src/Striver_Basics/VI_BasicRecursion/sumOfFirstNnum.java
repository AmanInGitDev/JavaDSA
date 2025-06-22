package Striver_Basics.VI_BasicRecursion;

public class sumOfFirstNnum {

    public int sumofN(int n){
        if (n == 0 ) return 0;
        return sumofN(n-1) +n;
    }

    public static void main(String[] args){
        int n = 4;
        sumOfFirstNnum solution = new sumOfFirstNnum();
        int answer = solution.sumofN(n);
        System.out.println("Sum is: " + answer);

    }

}
