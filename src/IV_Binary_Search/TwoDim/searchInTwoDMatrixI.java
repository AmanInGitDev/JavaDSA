public class searchInTwoDMatrix {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0, high = n * m - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            int row = mid / m;
            int col = mid % m;
            
            if (mat[row][col] == target)
                return true;
            
            else if
                (mat[row][col] < target) low = mid + 1;
            
            else high = mid - 1;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 8;
        
        searchInTwoDMatrix sol = new searchInTwoDMatrix();
        
        boolean result = sol.searchMatrix(matrix, target);
        
        System.out.println(result ? "true" : "false");
    }
}
