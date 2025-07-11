/*Longest Consecutive Sequence in an Array
Given an array nums of n integers, return the length of the longest sequence of consecutive integers.
The integers in this sequence can appear in any order.

Examples: Input: nums = [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest sequence of consecutive elements in the array is [1, 2, 3, 4], which has a length of 4.
             This sequence can be formed regardless of the initial order of the elements in the array.

Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
Output: 9
Explanation: The longest sequence of consecutive elements in the array is [0, 1, 2, 3, 4, 5, 6, 7, 8], which has a length of 9. */


import java.util.*;

public class LongestConsSeqBruite {
    public int longestConsecutive(int[] nums) {
        Set<Integer> answer = new TreeSet<>();
        int n=nums.length;
        
        int longest = 0;
        int currentStreak = 0;
        int prev = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++){
            answer.add(nums[i]);
        }
        
        for (int num : answer){
            if (num == prev + 1) {
                currentStreak++;  // consecutive
            } else {
                currentStreak = 1;  // reset
            }
            longest = Math.max(longest, currentStreak);
            prev = num;
        }
        return longest;
    }
    
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2,2};
        
        LongestConsSeqBruite solution = new LongestConsSeqBruite();
        int ans = solution.longestConsecutive(a);
        
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
