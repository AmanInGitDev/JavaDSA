package VIII_SlidingWindowAndTwoPointer.LongestAndSmallestWindow;

public class maxConsecutiveOneIII {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int maxLength = 0;
        int zeroCount = 0;
        
        while(right < n)
        {
            if(nums[right] == 0)
                zeroCount++;
            
            if(zeroCount > k)
            {
                if(nums[left] == 0)
                    zeroCount--;
                
                left++;
            }
            
            if(zeroCount <= k)
            {
                int length = right - left + 1;
                maxLength = Math.max(length, maxLength);
            }
            
            right++;
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        
        maxConsecutiveOneIII sol = new maxConsecutiveOneIII();
        
        int length = sol.longestOnes(input, k);
        
        // Print the result
        System.out.println("Length of longest substring with at most " + k + " zeros: " + length);
    }
}
