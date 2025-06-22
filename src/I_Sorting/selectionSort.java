package I_Sorting;

public class selectionSort {
    public static int[] sorting(int[] nums){

        for (int i = 0; i < nums.length - 1; i++){

            int minimum = i;

            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[minimum]) {
                    minimum = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minimum];
            nums[minimum] = temp;
        }
        return nums;
    }


    public static void main(String[] args){
        int[] arr = {2,5,3,8,6};

        System.out.print("Given Arrays: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        selectionSort solution = new selectionSort();
        int[] answer = selectionSort.sorting(arr);

        System.out.print("Sorted array: ");
        for(int nums : answer){
            System.out.print(nums+" ");
        }
        System.out.println();
    }
}
