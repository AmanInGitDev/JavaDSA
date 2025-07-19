/*
    Find row with maximum 1's
        Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order,
        find the index of the row with the maximum number of ones.
        
        If two rows have the same number of ones, consider the one with a smaller index. If no 1 exists in the matrix, return -1.
    
        Examples: Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
        Output: 0
            Explanation: The row with the maximum number of ones is 0 (0 - indexed).
        
        Input: mat = [ [0, 0], [0, 0] ]
        Output: -1
            Explanation: The matrix does not contain any 1. So, -1 is the answer.
*/

public class rowWithMax1sBruite {
    public int rowWithMax1s(int[][] mat) {
        
        int row = mat.length;
        int col = mat[0].length;
        
        int maxOneCount = 0;
        int rowIndex = -1;
        
        for (int i = 0; i < row; i++) {
            int one = 0;
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    one++;
                }
            }
            
            if (one > maxOneCount) {
                maxOneCount = one;
                rowIndex = i;
            }
        }
        
        
        return rowIndex;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        
        // Create an instance of the Solution class
        rowWithMax1sBruite sol = new rowWithMax1sBruite();
        
        // Print the answer
        System.out.println("The row with maximum number of 1's is: " +
                                   sol.rowWithMax1s(matrix));
    }
}
