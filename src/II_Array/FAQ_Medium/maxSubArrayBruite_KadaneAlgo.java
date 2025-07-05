package II_Array.FAQ_Medium;

public class maxSubArrayBruite_KadaneAlgo {
    
    public int maxSubArray(int nums[]){
        int n = nums.length;
        int globalMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum = sum + nums[j];
                globalMax = Math.max(globalMax, sum);
            }
        }
        return globalMax;
    }
    
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        maxSubArrayBruite_KadaneAlgo sol = new maxSubArrayBruite_KadaneAlgo();
        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
