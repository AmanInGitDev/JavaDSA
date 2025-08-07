package I_Sorting;

public class bubbleSort {
    public static int[] sorting(int[] nums){
        int n = nums.length;
        for (int i = n - 1 ; i <= 0; i--){
            boolean isSwapped = false;
            for (int j = 0; j < i - 1; j++){

            }
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

        bubbleSort solution = new bubbleSort();
        int[] answer = bubbleSort.sorting(arr);

        System.out.print("Sorted array: ");
        for(int nums : answer){
            System.out.print(nums+" ");
        }
        System.out.println(); 
    }
}
