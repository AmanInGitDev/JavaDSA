import java.util.*;
/*
        Find minimum in Rotated Sorted Array
        Given an integer array nums of size N, sorted in ascending order with distinct values,
        and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.
        
        Examples: Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]
        Output: 0
        
        Explanation: Here, the element 0 is the minimum element in the array.
*/

public class minInRotatedSortedArrayOpti {
    
    public int findMin(List<Integer> arr) {
        int n = arr.size();
        int min = Integer.MAX_VALUE;
        int low = 0, high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr.get(low) <= arr.get(mid)) {
                min = Math.min(min, arr.get(low));
                low = mid + 1;
            } else {
                min = Math.min(min, arr.get(mid));
                high = mid - 1;
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        
        minInRotatedSortedArrayOpti sol = new minInRotatedSortedArrayOpti();
        int ans = sol.findMin(arr);
        
        System.out.println("The minimum element is: " + ans);
    }
}

