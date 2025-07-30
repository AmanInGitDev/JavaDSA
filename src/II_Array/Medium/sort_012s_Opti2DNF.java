public class sort_012s_Opti2DNF {
    
    public void sorted (int[] nums){
        int n = nums.length;
        int low = 0; int mid = 0; int high = n-1;
        
        while (mid <= high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else {   // for 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};

        // Create an instance of Solution class
        sort_012s_Opti2DNF sol = new sort_012s_Opti2DNF();

        sol.sorted(nums);

        // Print the array elements after sorting
        System.out.println("After sorting:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
