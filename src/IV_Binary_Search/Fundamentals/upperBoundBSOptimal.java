package IV_Binary_Search.Fundamentals;

public class upperBoundBSOptimal {
    
    public int upperBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low+high)/2;
            if(x < nums[mid]){
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
        int x = 9;
        
        upperBoundBSOptimal sol = new upperBoundBSOptimal();
        
        int ind = sol.upperBound(arr, x);
        
        System.out.println("The lower bound is the index: " + ind);
    }
}
