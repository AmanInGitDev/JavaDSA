package II_Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class reversePairsOpti {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n-1);
    }

    private int mergeSort(int[] nums, int low, int high){
        int count = 0;

        if(low >= high) return count;

        int mid = (low+high)/2;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count += countReverse(nums, low, mid, high);
        merge(nums, low, mid, high);

        return count;
    }

    private int countReverse(int[] nums, int low, int mid, int high){
        int count = 0;
        int right = mid + 1;
        for(int i = low; i <= mid; i++){
            while(right <= high && (long) nums[i] > 2L * nums[right]){
                right++;
            }
            count += (right - (mid+1));
        }
        return count;
    }

    private void merge(int[] nums, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while (left <= mid) temp.add(nums[left++]);
        while (right <= high) temp.add(nums[right++]);

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 4, 1, 2, 7};

        // Create an instance of the Solution class
        reversePairsOpti sol = new reversePairsOpti();

        int cnt = sol.reversePairs(nums);

        // Output the result
        System.out.println("The number of reverse pairs is: " + cnt);
    }
}