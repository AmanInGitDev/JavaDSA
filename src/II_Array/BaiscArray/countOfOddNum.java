public class countOfOddNum {

    public int count(int[] arr) {
        int count = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] % 2 == 1 ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        countOfOddNum solution = new countOfOddNum();
        int ans = solution.count(arr);
        System.out.println(ans);
    }
}
