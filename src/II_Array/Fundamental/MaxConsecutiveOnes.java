public class MaxConsecutiveOnes {
        public int secondLargestElement(int[] nums) {
                int n = nums.length;

                int count = 0;
                int max_count = 0;

                for (int i = 0; i < n; i++){
                    if(nums[i] == 1){
                        count++;
                        max_count = Math.max(count, max_count);
                    }
                    else {
                        count = 0;
                    }
                }
                return max_count;
            }

    public static void main (String[] args){
        int[] nums = {0,1,0,1,1,1,0};
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();
        int ans = sol.secondLargestElement(nums);
        System.out.println("Maximum Consecutive Ones: " + ans);
    }
}




