package VII_Greedy.Hard;

public class candyBruite {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        
        int[] right = new int[n];
        
        right[n - 1] = 1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i], right[i]);
        }
        
        return sum;
    }
    
    
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        candyBruite sol = new candyBruite();
        
        int result = sol.candy(ratings);
        
        System.out.println("Minimum candies required: " + result);
    }
}
