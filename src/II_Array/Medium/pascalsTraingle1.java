public class pascalsTraingle1 {
    public int position(int r, int c){
        return nCr(r-1,c-1);
    }
    private int nCr(int n, int r){
        if(r > n - r){
            r = n - r;   // For simply optimizing the answer used mathematical operation to set r a new value
        }

        if(r == 0)  return 1;  // Edge case: nC0 = 1
        if(r == 1)  return n;  // Simple case: nC1 = n

        int result = 1;
        for (int i = 0; i < r; i++){
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        int r = 6;
        int c = 2;
        pascalsTraingle1 sol = new pascalsTraingle1();

        int ans = sol.position(r, c);

        System.out.println("The element in the rth row and cth column in pascal's triangle is: " + ans);
    }
}
