package BasicHash;

class SumHighAndLowFrqBruite {
    public int solution3(int[] nums) {

        int n = nums.length;
        int maxFreq = 0;
        int minFreq = n;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;

            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);

        }
        return maxFreq + minFreq;
    }

    public static void main(String[] args){
        int[] nums = {4, 4, 4, 5, 5, 6, 7};
        SumHighAndLowFrqBruite sol3 = new SumHighAndLowFrqBruite();
        int answer3 = sol3.solution3(nums);
        System.out.println(answer3);

    }
}


