package IV_Binary_Search.LogicBuilding;

public class searchInsertPosOpti {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;
        
        while (low <= high) {
            int mid = (low+high)/2;
            if(target <= nums[mid]){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        
        searchInsertPosOpti sol = new searchInsertPosOpti();
        
        int index = sol.searchInsert(nums, target);
        System.out.println("The index is: " + index);
    }
}
