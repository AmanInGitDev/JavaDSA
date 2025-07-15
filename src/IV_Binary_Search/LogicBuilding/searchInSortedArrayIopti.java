/*Search in rotated sorted array-I
    Given an integer array nums, sorted in ascending order (with distinct values) and a target value k.
    The array is rotated at some pivot point that is unknown.
    Find the index at which k is present and if k is not present return -1.
    
    Examples: Input : nums = [4, 5, 6, 7, 0, 1, 2], k = 0
    Output: 4
    Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums.
    Thus, we get output as 4, which is the index at which 0 is present in the array.
*/


public class searchInSortedArrayIopti{
    
    public int search(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = n-1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(nums[mid] == k)
                return mid;
            
            if(nums[left] <= nums[mid]){
                if(nums[left] <= k && nums[mid] >= k){
                    right = mid - 1;
                }
                else
                    left = mid + 1;
            }
            
            else{
                if(nums[mid] <= k && nums[right] >= k){
                    left = mid + 1;
                }
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        searchInSortedArrayIopti sol = new searchInSortedArrayIopti();
        int result = sol.search(nums, target);
        
        if (result == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + result);
    }
}
