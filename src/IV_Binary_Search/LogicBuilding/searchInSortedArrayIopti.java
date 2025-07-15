/*Single element in sorted array

Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice. Find the single number in the array.


Examples:
Input :nums = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6]

Output:4

Explanation: Only the number 4 appears once in the array.*/

import java.util.HashMap;

public class searchInSortedArrayIopti{
    
    public int search(int[] nums, int k) {
    
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        
        // Create an instance of the Solution class
        searchInSortedArrayIopti sol = new searchInSortedArrayIopti();
        
        // Function call to search for the target element
        int result = sol.search(nums, target);
        
        if (result == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + result);
    }
}
