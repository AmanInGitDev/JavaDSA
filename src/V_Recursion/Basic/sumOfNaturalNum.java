/*
    Sum of First N Numbers
    Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
    
    Examples: Input : N = 4
    Output: 10
    
    Explanation : The first four natural numbers are 1, 2, 3, 4.
    Sum is 1 + 2 + 3 + 4 => 10.
    
*/

public class sumOfNaturalNum {
    public int NnumbersSum(int N) {
        if (N == 1) return 1;
        return (N + NnumbersSum(N-1));
    }
    
    
    public static void main(String[] args) {
        sumOfNaturalNum solution = new sumOfNaturalNum();
        int N = 4;
        System.out.println("Sum of first " + N + " numbers is " + solution.NnumbersSum(N));
    }
}
