/*Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k.
If no such sub-array exists, return 0.

Examples: Input: nums = [10, 5, 2, 7, 1, 9],  k=15

Output: 4
Explanation: The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. T
his sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore,
the length of this sub-array is 4.*/

public class LongestSubarrWithSumKBruite {
    public int longestSubarray(int[] nums, int k) {
        int n  = nums.length;
        int max = 0;
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
               sum+=nums[j];
                if (sum == k){
                    max = Math.max(j - i + 1,max);
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 7;
        
        // Create an instance of the Solution class
        LongestSubarrWithSumKBruite solution = new LongestSubarrWithSumKBruite();
        // Function call to get the result
        int len = solution.longestSubarray(nums, k);
        
        System.out.println("The length of the longest subarray is: " + len);
    }
}
