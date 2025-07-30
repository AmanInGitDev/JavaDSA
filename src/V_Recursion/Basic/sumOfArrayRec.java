public class sumOfArrayRec {
    public int arraySum(int[] nums,int n) {
      return sum(nums, 0);
    }
    
    private int sum (int[] nums, int i){
        if(i >= nums.length) return 0;
        return (nums[i] + sum(nums,i+1));
    }


    public static void main(String[] args) {
        sumOfArrayRec solution = new sumOfArrayRec();
        int[] nums = {1, 2, 3};
        int result = solution.arraySum(nums,nums.length);
        System.out.println(result);
    }
}
