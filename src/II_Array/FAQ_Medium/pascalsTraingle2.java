public class pascalsTraingle2 {
    public int[] rowArray(int r){
        int[] ans = new int[r];

        ans[0] = 1;    // The first row of the pascal triangle is always 1;

        for (int i = 1; i < r; i++){
            ans[i] = ans[i-1] * (r - i) / i;     // This is a formula;
        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 5;

        pascalsTraingle2 sol = new pascalsTraingle2();
        int[] ans = sol.rowArray(r);

        System.out.print("Row " + r + ": ");
        for(int x : ans) System.out.print(x + " ");
    }
}
