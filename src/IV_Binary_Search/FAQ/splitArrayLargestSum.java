// This is exact same question of Bookallocation and also Painter partition problem so i will reuse the book allocation code
package IV_Binary_Search.FAQ;

public class splitArrayLargestSum {
    public int largestSubarraySumMinimized(int[] a, int k) {
        return findPages(a, k);
      }

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
        int[] a = {10, 20, 30, 40};
        int k = 2;

        // Create an instance of the Solution class
        splitArrayLargestSum sol = new splitArrayLargestSum();

        int ans = sol.largestSubarraySumMinimized(a, k);

        // Print the answer
        System.out.println("The answer is: " + ans);
    }
}