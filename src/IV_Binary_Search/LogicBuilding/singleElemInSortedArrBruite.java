/*
    Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice.
    Find the single number in the array.
    
    
    Examples: Input :nums = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6]
    Output:4
    Explanation: Only the number 4 appears once in the array.
*/


public class singleElemInSortedArrBruite {
    public int singleNonDuplicate(int[] nums) {
        int index=0;
        int n=nums.length;
       
        for(int i=0;i<n;i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
                
            }
        }
        return nums[n-1];
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        
        // Create an object of the Solution class.
        singleElemInSortedArrBruite sol = new singleElemInSortedArrBruite();
        
        int ans = sol.singleNonDuplicate(nums);
        
        // Print the result.
        System.out.println("The single element is: " + ans);
    }
}
