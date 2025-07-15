public class firstAndLastOccuranceOpti {
    public int[] searchRange(int[] nums, int target) {
    int n=nums.length;
    int low=0;
    int high=n-1;
    int[] ans=new int[2];
    int idx=0;
    while(low<=high){
        if(nums[low]==target && high==-1){
            ans[0]=low;
        }
        if(nums[high]==target && low==-1 ){
            ans[1]=high;
        }
        if(low!=-1 && high!=-1) {
           break;
        }
        if(low==-1) {
            low++;
         }
        if(high==-1) {
            high++;
        }
    }
    return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        // Create an instance of the Solution class
        firstAndLastOccuranceOpti sol = new firstAndLastOccuranceOpti();
        
        // Function call to find the first and last occurrences
        int[] result = sol.searchRange(nums, target);
        
        System.out.println("The first and last occurrences are at indices: "
                                   + result[0] + " and " + result[1]);
    }
}
