package II_Array.FAQ_Medium;

public class twoSumBruite {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == nums[i] + nums[j]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        twoSumBruite sol = new twoSumBruite();

        int[] ans = sol.twoSum(nums, target);
        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
}
