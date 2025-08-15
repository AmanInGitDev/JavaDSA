package IV_Binary_Search.FAQ;

import java.util.Arrays;

public class aggrersiveCows {
    public int aggressiveCows(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 1;
        int high = nums[n - 1] - nums[0];
        
        while(low <= high){
            int mid = (low + high) /2;
            
            if(isPossible(nums, mid, k)){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    
    private boolean isPossible(int[] nums, int i, int k){
        int count = 1;
        int n = nums.length;
        
        int last = nums[0];
        
        for(int x = 1; x < n; x++){
            if(nums[x] - last >= i){
                count++;
                last = nums[x];
            }
            if(count >= k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;

        // Create an instance of the Solution class
        aggrersiveCows sol = new aggrersiveCows();

        int ans = sol.aggressiveCows(nums, k);

        // Output the result
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}