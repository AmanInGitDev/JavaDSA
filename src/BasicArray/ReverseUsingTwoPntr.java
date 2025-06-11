package BasicArray;

class reverse1{
    public void reverse1(int[] arr, int n){
        int start = 0, end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }
}

public class ReverseUsingTwoPntr {

    public static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int n = 5;
        int[] arr = {1,2,3,4,5};

        reverse1 rev = new reverse1();
        System.out.print("Original Array: ");
        printArray(arr, n);

        rev.reverse1(arr, n);
        System.out.print("Reversed Array: ");
        printArray(arr, n);
    }
}

