import java.util.HashMap;
import java.util.Map;

public class twoSumOpti {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++){
            int num = nums[i];
            int desiredNum = target - num;

            if (mpp.containsKey(desiredNum)){
                return new int[] {mpp.get(desiredNum), i};
            }
            mpp.put(num,i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {2, 1, 6, 8, 11};
        int target = 14;

        twoSumOpti sol = new twoSumOpti();

        int[] ans = sol.twoSum(nums, target);
        System.out.println("This is the answer: [" + ans[0] + ", " + ans[1] + "]");
    }
}
