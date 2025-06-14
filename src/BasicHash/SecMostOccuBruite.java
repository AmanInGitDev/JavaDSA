package BasicHash;

class SecMostOccuBruite {
    public int solution3(int[] nums){

        int n = nums.length;
        int maxFrequency = 0, secmaxFrequecy = 0;
        int maxElement = -1, secmaxElement = -1;

        boolean[] visisted = new boolean[n];

        for (int i = 0; i<n; i++){
            if(visisted[i]) continue;
            int freq = 0;

            for (int j=i; j<n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visisted[j] = true;
                }
            }

            if (freq>maxFrequency){
                secmaxFrequecy = maxFrequency;
                maxFrequency = freq;

                secmaxElement = maxElement;
                maxElement = nums[i];
            }

            else if (freq == maxFrequency){
                maxElement = Math.min(maxElement, nums[i]);
            }

            else if (freq>secmaxFrequecy){
                secmaxFrequecy = freq;
                secmaxElement = nums[i];
            }

            else if (freq == secmaxFrequecy) {
                secmaxElement = Math.min(secmaxElement, nums[i]);
            }

        }return secmaxElement;
    }

    public static void main(String[] args){
        int[] nums = {4, 4, 5, 5, 6, 7};
        SecMostOccuBruite sol3 = new SecMostOccuBruite();
        int answer3 = sol3.solution3(nums);
        System.out.println(answer3);

    }
}


