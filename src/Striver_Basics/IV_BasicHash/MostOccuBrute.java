class MostOccuBrute {

    public int solution1(int[] nums){
        int n = nums.length;         // Its length of nums[] so that we can use it for looping
        int maxEle = 0;              // It's used to store and update the maximum element found and initially is 0;
        int maxfreq = 0;             // It's used to store the maximum frequency of an element, and It's also initially 0;

        boolean[] visited = new boolean[n];   // It's to check whether the element is visited and if visited it will marked true later

        for(int i = 0; i < n; i++){       // All the operation will be performed for index 0 to n (size of an array)

            if (visited[i]) continue;       // Here we check the condition that the i element is visited then its continued
            int freq = 0;                    // Simply check the frequency of i only (not the max)

            for (int j = i; j < n; j++){       // Inner loop to traverse and find the i element which the n elements;

                if (nums[i] == nums[j]) {      // It means the number is found
                    freq++;                   // freq is updated and increased by one
                    visited[j] = true;         // Means the element is visited and its true now
                }

                if (freq > maxfreq){           // It's to check whether the the freq of element is greater than maxfreq or its may less if great then following exuuted
                    maxfreq = freq;            // If its become true then update the maxFreq.
                    maxEle = nums[i];          // Update max elementh to its i in nums.
                }

                else if (freq == maxfreq){                   // Here it may be equal then
                    maxEle = Math.min(maxEle, nums[i]);      // Compare the maxEle, As per question whichever is smaller we have tp retuen this
                                                             //so use math.min function and provide (two values) one is the maxEle and another is one we got in nums as i.
                }
            }
        }
        return maxEle;
    }

    public static void main(String [] args){
        int[] nums = { 7,3,2,3,2,3,5};

        MostOccuBrute Sol1 = new MostOccuBrute();
        int answer1 = Sol1.solution1(nums);
        System.out.println(answer1);
    }
}