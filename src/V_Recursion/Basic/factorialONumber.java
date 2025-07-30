public class factorialONumber {
    public long factorial(int n) {
        if(n <= 1) return 1;   // Anything below 0 is not allowed
        return (n * factorial(n-1));
    }
    
    public static void main(String[] args) {
        factorialONumber solution = new factorialONumber();
        int N = 5;
        System.out.println("Factorial of " + N + " is " + solution.factorial(N));
    }
}
