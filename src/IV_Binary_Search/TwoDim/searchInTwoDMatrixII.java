public class searchInTwoDMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else {
                col--;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                          {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 8;
        
        // Create an instance of Solution class
        searchInTwoDMatrixII sol = new searchInTwoDMatrixII();
        
        boolean result = sol.searchMatrix(matrix, target);
        
        // Output the result
        System.out.println(result ? "true" : "false");
    }
}
