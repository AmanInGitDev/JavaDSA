package II_Array.Fundamental;

public class rotateByKOpti {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        reverseArr(nums, k, n-1);
        reverseArr(nums,0,k-1);
        reverseArr(nums,0,n-1);
    }
    
    private void reverseArr(int[] nums, int left, int right){
          while(left<=right){
              int temp = nums[left];
              nums[left] = nums[right];
              nums[right] = temp;
              left++;
              right--;
          }
    }
    
    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 5, 3, -5};
        int k = 8;
        
        System.out.println("Initial array: ");
        printArray(nums);
        
        rotateByKOpti sol = new rotateByKOpti();
        
        sol.rotateArray(nums, k);
        
        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
}
