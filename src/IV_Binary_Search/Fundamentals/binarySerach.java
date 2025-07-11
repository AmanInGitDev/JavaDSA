public class binarySerach {
    
    public static int BinarySearch(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            
            if(nums[mid]==target)
                return mid;
            
            else if(target<nums[mid])
                right=mid-1;
            
            else if(target>nums[mid])
                left=mid+1;
        }
        return -1;
    }
    
    
    public static void main(String[] args){
        int[] nums = {2,3,4,8,18,220};
        int target = 8;
        
        binarySerach sol = new binarySerach();
        int answer = binarySerach.BinarySearch(nums,target);
        if (answer == -1)
            System.out.println("The target element is not present");
        else
            System.out.println("The target element is present at index " + answer);
    }
    
}
