/*Highest Occurring Element in an Array
Given an array of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times.
If there are multiple elements that appear a maximum number of times, find the smallest of them.

Please note that this section might seem a bit difficult without prior knowledge on what hashing is, we will soon try to add basics concepts for your ease!
If you know the concepts already please go ahead to give a shot to the problem. Cheers!

Examples:  Input: arr = [1, 2, 2, 3, 3, 3]
Output: 3

Explanation: The number 3 appears the most (3 times). It is the most frequent element.*/

class MostOccuBrute {
    
    public int mostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        int maxEle = 0;
        
        boolean[] vis = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if (vis[i]) continue;
            
            int count = 0;
            
            for (int j = i; j < n; j++){
                if (nums[i] == nums[j]){
                    count++;
                    vis[j] = true;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                maxEle = nums[i];
            }
            else if (count == maxCount){
                maxEle = Math.min(maxEle, nums[i]);
            }
        }
        return maxEle;
    }
    
    public static void main(String [] args){
        int[] nums = {4, 4, 5, 5, 6};
        
        MostOccuBrute Sol1 = new MostOccuBrute();
        int answer1 = Sol1.mostFrequentElement(nums);
        System.out.println(answer1);
    }
}
    









































