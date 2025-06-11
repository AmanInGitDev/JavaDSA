package BasicArray;

class reverse{

    public void reverse(int[] arr, int n){
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }

        for (int i = 0; i < n; i++){
            arr[i] = ans[i];
        }
    }
}

public class ReverseUsingAuxArr {

    public static void printArray(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
       int n = 5;
       int[] arr = {1,2,3,4,5};

       reverse rev = new reverse();
       System.out.print("Original Array: ");
       printArray(arr, n);

       rev.reverse(arr, n);
       System.out.print("Reversed Array: ");
       printArray(arr, n);
    }
}

