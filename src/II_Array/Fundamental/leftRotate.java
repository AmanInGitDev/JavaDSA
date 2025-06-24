public class leftRotate {
    public void rotateArrayByOne(int[] nums){
        int n = nums.length;
        int last = nums[0];

        // I made a mistake her and run the loop for n times which may give Time Limit Exceeded error
        for (int i = 0; i < n-1; i++){
            nums[i] = nums[i+1];
        }
        nums[n-1] = last;
    }



    public static void main(String[] args) {
        leftRotate solution = new leftRotate();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);

        for (int ans : nums) {
            System.out.print(ans + " ");
        }
    }
}
