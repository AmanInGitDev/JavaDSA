/*
    Intersection of two sorted arrays
    Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays.
    Each element in the result must appear as many times as it appears in both arrays.
    The intersection of two arrays is an array where all values are present in both arrays.
    
        Examples:
            Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
            Output: [1, 2]
            Explanation: The elements 1, 2 are the only elements present in both nums1 and nums2
*/

import java.util.ArrayList;

import java.util.ArrayList;

public class intersectionOfArrayBrute {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int[] visit = new int[n2];  // FIXED
        
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j] && visit[j] == 0) {
                    list.add(nums1[i]);
                    visit[j] = 1;
                    break;
                } else if (nums2[j] > nums1[i]) {
                    break;
                }
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);  // FIXED
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};
        
        intersectionOfArrayBrute finder = new intersectionOfArrayBrute();
        
        int[] ans = finder.intersectionArray(nums1, nums2);
        
        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


