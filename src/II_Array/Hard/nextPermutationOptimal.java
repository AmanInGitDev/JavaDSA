package II_Array.Hard;

import java.util.*;

public class nextPermutationOptimal {
    public void permutation(int[] nums){
        int n = nums.length;
        int index = -1;
        
        for (int i = n-2 ; i >= 0; i--){
            if (nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        
        if (index == -1){
            Arrays.sort(nums);
        }
        
        for (int i = n-1; i>index; i--){
            if (nums[index] < nums[i]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }
        
        reverse(nums, index + 1, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 4,3,0,0};
        nextPermutationOptimal sol = new nextPermutationOptimal();
        // Output
        System.out.print("Given array: ");
        for(int x : nums) System.out.print(x + " ");
        sol.permutation(nums);
        
        // Output
        System.out.print("\nNext Permutation: ");
        for(int x : nums) System.out.print(x + " ");
    }
}
