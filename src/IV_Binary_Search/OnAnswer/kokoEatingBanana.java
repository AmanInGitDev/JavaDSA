package IV_Binary_Search.OnAnswer;

public class kokoEatingBanana {
    private int findMax(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        return maxi;
    }

    private long calculateTotalHours(int[] nums, int hourly) {
        long totalH = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) nums[i] / (double) hourly);
        }
        return totalH;
    }

    public int minimumRateToEatBananas(int[] nums, int h) {
        int low = 1, high = findMax(nums);

        while (low <= high) {
            int mid = (low + high) / 2;
            long totalH = calculateTotalHours(nums, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {7, 15, 6, 3};
        int h = 8;

        // Create an object of the Solution class
        kokoEatingBanana sol = new kokoEatingBanana();

        int ans = sol.minimumRateToEatBananas(nums, h);

        // Print the result
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}



class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=findMax(piles);

       int left=1;
       int right=max;
       int maxhr=max;
       while(left<=right){
        int mid=(left+right)/2;
        int hrs=calculateHrs(piles,mid);
         if(hrs<=h){
            maxhr=mid;
            right=mid-1;
         }
         else{
            left=mid+1;
         }

       }
return maxhr;
    }

    private int calculateHrs(int[] nums,int h){
        int th=0;
        for(int i=0;i<nums.length;i++){
            th+=(int)Math.ceil((double)nums[i]/h);
        }

        return th;
    }

    private int findMax(int[] nums){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           max=Math.max(nums[i],max);
        }
        return max;
    }
}