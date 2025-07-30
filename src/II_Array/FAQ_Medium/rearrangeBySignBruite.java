package II_Array.FAQ_Medium;

import java.util.ArrayList;
import java.util.List;

public class rearrangeBySignBruite {
    public int[] rearrange (int nums[]){
        int n = nums.length;
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                positive.add(nums[i]);
            }
            else {
                negative.add(nums[i]);
            }
        }

        for (int i = 0; i < n/2; i++){
            nums[i * 2] = positive.get(i);
            nums[i * 2 + 1] = negative.get(i);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};

        rearrangeBySignBruite sol = new rearrangeBySignBruite();
        int[] ans = sol.rearrange(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
