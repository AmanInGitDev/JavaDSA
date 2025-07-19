package IV_Binary_Search.TwoDim;

public class TwoDMatrix {
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 8;
        
        // Create an instance of Solution class
        Solution sol = new Solution();
        
        boolean result = sol.searchMatrix(matrix, target);
        
        // Output the result
        System.out.println(result ? "true" : "false");
    }
}
