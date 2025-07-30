package V_Recursion.ImplementationProblem;

public class rearrangeBySignOpti {
    public int[] rearrange (int nums[]){
        int n = nums.length;
        int[] answer = new int[n];

        int positive = 0;
        int negative = 1;

        for (int i = 0; i < n; i++){
            if (nums[i] > 0){
                answer[positive] = nums[i];
                positive += 2;
            }
            else {
                answer[negative] = nums[i];
                negative += 2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};

        rearrangeBySignOpti sol = new rearrangeBySignOpti();
        int[] ans = sol.rearrange(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
