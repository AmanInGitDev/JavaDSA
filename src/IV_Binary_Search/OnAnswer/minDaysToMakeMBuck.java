class MinDaysToMakeMBuck {
    private int roseGarden(int[] nums, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int ans = -1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (isPossible(nums, m, k, mid)) {
                ans = mid;
                max = mid - 1; // try to find smaller day
            } else {
                min = mid + 1; // need more days
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int m, int k, int day) {
        int n = nums.length;
        int count = 0;
        int bucket = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= day) {
                count++;
            } else {
                bucket += count / k;
                count = 0;
            }
        }
        bucket += count / k;
        return bucket >= m;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3; 
        int m = 2;

        MinDaysToMakeMBuck sol = new MinDaysToMakeMBuck();
        int ans = sol.roseGarden(arr, m, k);

        if (ans == -1) {
            System.out.println("We cannot make m bouquets.");
        } else {
            System.out.println("We can make bouquets on day " + ans);
        }
    }
}