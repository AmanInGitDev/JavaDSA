package VII_Greedy.Easy;

public class jumpGameI {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++){
            if(i > max) return false;
            max = Math.max(nums[i] + i,max);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};

        System.out.print("Array representing maximum jump from each index: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        jumpGameI solution = new jumpGameI();
        boolean ans = solution.canJump(nums);

        if (ans) {
            System.out.println("It is possible to reach the last index.");
        } else {
            System.out.println("It is not possible to reach the last index.");
        }
    }
}