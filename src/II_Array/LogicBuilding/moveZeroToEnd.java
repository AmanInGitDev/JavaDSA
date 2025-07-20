import java.util.Arrays;

public class moveZeroToEnd {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        
        for(int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        
        for(int i = index; i < n; i++){
            nums[i] = 0;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        
        // Create an instance of the Solution class
        moveZeroToEnd solution = new moveZeroToEnd();
        
        // Modify the array in place
        solution.moveZeroes(arr);
        
        // Print the elements
        for (int it : arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
