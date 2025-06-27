import java.util.Arrays;

public class moveZeroToEnd {
    public int moveZeroes(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

    public static void main(String[] args){
        int[] nums = {2,4,6,0,3,1,5,8};

        moveZeroToEnd solution = new moveZeroToEnd();
        int answer = solution.moveZeroes(nums);

        System.out.println("Answer: "+answer);
    }
}
