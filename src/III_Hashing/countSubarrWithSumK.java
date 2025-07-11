package III_Hashing;

public class countSubarrWithSumK {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
            
        }
        return count;
    }
    
    public class Main {
        public static void main(String[] args) {
            countSubarrWithSumK solution = new countSubarrWithSumK();
            int[] nums = {3, 1, 2};
            int k = 3;
            // Function call to find the result
            int cnt = solution.subarraySum(nums, k);
            System.out.println("The number of subarrays is: " + cnt);
        }
    }
}