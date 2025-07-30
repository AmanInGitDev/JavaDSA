package II_Array.FAQ_Medium;//using optimal approach using two pointers

public class twoSumOpti2TP {

    public int[] twoSum(int[] nums, int target){

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        // Create an instance of Solution class
        twoSumOpti2TP sol = new twoSumOpti2TP();

        int[] ans = sol.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + ans[0] + ", " + ans[1] + "]");
    }
}
