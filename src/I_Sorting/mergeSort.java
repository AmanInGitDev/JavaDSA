package I_Sorting;

import java.util.*;

public class mergeSort {

    public int[] sortArray(int[] nums) {
        int n=nums.length;
        mergesort(nums,0,n-1);

        return nums;
    }
    private void mergesort(int[] nums, int low, int high){
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    private void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> list = new ArrayList<>();

        while (left <= mid && right <= high){
            if (nums[left] <= nums[right]){
                list.add(nums[left]);
                left++;
            } else {
                list.add(nums[right]);
                right++;
            }
        }

        while (left <= mid){
            list.add(nums[left]);
            left++;
        }
        while (right <= high ){
            list.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
    }


     public static void main(String[] args){
        int[] arr = {2,5,3,8,6};

        System.out.print("Given Arrays: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        mergeSort solution = new mergeSort();
        int[] answer = solution.sortArray(arr);

        System.out.print("Sorted array: ");
        for(int nums : answer){
            System.out.print(nums+" ");
        }
        System.out.println();
    }
}