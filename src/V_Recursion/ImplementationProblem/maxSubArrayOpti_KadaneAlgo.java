package V_Recursion.ImplementationProblem;

public class maxSubArrayOpti_KadaneAlgo {
    
    public int maxSubArray(int nums[]){
        int n = nums.length;
        long globalMax = Long.MIN_VALUE;
        
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + nums[i];
            
            if (sum > globalMax)
                globalMax = sum;
            
            if (sum < 0)
                sum = 0;
        }
        return (int)globalMax;
    }
    
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        maxSubArrayOpti_KadaneAlgo sol = new maxSubArrayOpti_KadaneAlgo();
        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
