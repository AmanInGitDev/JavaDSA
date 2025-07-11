public class lowerBoundBSBruite {
    public int lowerBound(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] <= x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {1,3,54,55,676};
        int x = 29;
        
        // Create an instance of the Solution class
        lowerBoundBSBruite sol = new lowerBoundBSBruite();
        
        // Function call to find the lower bound
        int ind = sol.lowerBound(arr, x);
        
        System.out.println("The lower bound is the index: " + ind);
    }
}
