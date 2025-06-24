public class sumOfArray {

    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumOfArray solution = new sumOfArray();
        int ans = solution.sumOfArray(arr);
        System.out.println(ans);
    }
}
