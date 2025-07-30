package II_Array.FAQ_Medium;

public class sort_0_1_2sOpti1 {
    
    public void sorted (int[] nums){
        int n = nums.length;;
        int zeros = 0; int ones = 0; int twos = 0;
        
        for (int i = 0; i < n; i++){
            if (nums[i] == 0)
                zeros++;
            else if(nums[i] == 1)
                ones++;
            else
                twos++;
        }
        
        int index = 0;
        for (int i = 0; i < ones; i++)
            nums[index++] = 0;
        for (int i = 0; i < ones; i++)
            nums[index++] = 1;
        for (int i = 0; i < twos; i++)
            nums[index++] = 2;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};

        // Create an instance of Solution class
        sort_0_1_2sOpti1 sol = new sort_0_1_2sOpti1();

        sol.sorted(nums);

        // Print the array elements after sorting
        System.out.println("After sorting:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
