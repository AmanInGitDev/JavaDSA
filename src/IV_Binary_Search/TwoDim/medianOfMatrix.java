package IV_Binary_Search.TwoDim;

public class medianOfMatrix {
    public int findMedian(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            
            int row=mid/m;
            int col=mid%m;
            
            
            int median=matrix[row][col];
            if(n%2==1){
                median=matrix[row+1][col+1]/2;
            }
            return median;
        }
    return -1;
    
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {8, 9, 11, 12, 13},
                {21, 23, 25, 27, 29}
        };
        
        medianOfMatrix sol = new medianOfMatrix();
        
        int ans = sol.findMedian(matrix);
        
        // Print the answer
        System.out.println("The median element is: " + ans);
    }
}
