package II_Array.Hard;/*Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array,
except for A, which appears twice and B which is missing.
Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
Examples:
Input: nums = [3, 5, 4, 1, 1]
Output: [1, 2]

Explanation: 1 appears two times in the array and 2 is missing from nums */

import java.util.Arrays;

public class missingAndReapitingBruite {
    
    public int[] findMissingRepeating(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max=nums[n-1];
        
        int[] answer = new int[2];
        
        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                answer[0] = nums[i];
            }
        }
        int totalSum = (max*(max+1))/2;
        
        int currentSum=0;
        for(int i = 0; i < n; i++){
            currentSum += nums[i];
        }
        
        int missing = totalSum-(currentSum - answer[0]);
        answer[1]=missing;
        
        if(answer[1]==0){
            answer[1]=n;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
        
        // Create an instance of Solution class
        missingAndReapitingBruite sol = new missingAndReapitingBruite();
        
        int[] result = sol.findMissingRepeating(nums);
        
        // Print the repeating and missing numbers found
        System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
    }
}

//            if(nums[i] != nums[i]+1 ){
//                answer[index++] = nums[i+1];
//            }


//            for (int j = i; j < n; j++ ){
//                if(nums[i] == nums[j]){
//                    answer[index++]=nums[i];
//                }
//            }

//        for (int i = 0; i < n-1; i++){
//            if(nums[i] < nums[i]+2){
//                answer[index++] = nums[i]+1;
//            }
//        }
