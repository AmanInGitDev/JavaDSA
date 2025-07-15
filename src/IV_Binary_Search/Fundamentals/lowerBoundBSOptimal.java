public class lowerBoundBSOptimal {
    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;
        
        while (low <= high) {
            int mid = (low+high)/2;
            if(x <= nums[mid]){
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
        int[] arr = {3,5,8,15,19};
        int x = 2;

        lowerBoundBSOptimal sol = new lowerBoundBSOptimal();

        int ind = sol.lowerBound(arr, x);
        
        System.out.println("The lower bound is the index: " + ind);
    }
}
