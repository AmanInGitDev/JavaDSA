package IV_Binary_Search.FAQ;

public class bookAllocation {
    private int countStd(int[] nums, int pages){
        int std = 1;
        int pagesMax = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i]+pagesMax <= pages){
                pagesMax += nums[i];
            }
            else{
                std++;
                pagesMax = nums[i];
            }

        }
        return std;
    }

    public int findPages(int[] nums, int m) {
        int n = nums.length;
        if(m > n) return -1;

        int max = nums[0];
        int sum = nums[0];

        for(int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        while (max <= sum){
            int mid = (max + sum)/2;
            int pages = countStd(nums, mid);
            if (pages > m){
                max = mid + 1;
            }
            else{
                sum = mid - 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int m = 4;

        // Create an instance of the Solution class
        bookAllocation sol = new bookAllocation();

        int ans = sol.findPages(arr, m);

        // Output the result
        System.out.println("The answer is: " + ans);
    }
}