public class binarySerachRecursive {
    public static int BinarySearch(int[] nums,int target){
        int n = nums.length;
        return helper(0,n-1,nums,target);
    }
    
    public static int helper(int left, int right, int[] nums, int target){
        if (left>right)
            return -1;
    
        int mid = (left+right)/2;
        int ind;
        
        if(nums[mid] == target)
            ind = mid;
        
        else if (nums[mid] < target)
            ind = helper(mid+1,right,nums,target);
        
        else
            ind = helper(left,mid-1,nums,target);
        
        return ind;
    }
    
    public static void main(String[] args){
        int[] nums = {2,3,4,8,18,220};
        int target = 8;
        
        binarySerachRecursive sol = new binarySerachRecursive();
        int answer = binarySerachRecursive.BinarySearch(nums,target);
        if (answer == -1)
            System.out.println("The target element is not present");
        else
            System.out.println("The target element is present at index " + answer);
    }
}
