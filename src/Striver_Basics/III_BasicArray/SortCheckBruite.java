package Striver_Basics.III_BasicArray;

class SortCheck1{
    public boolean SortCheck(int[] arr, int n){
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if(arr[i]>arr[j]) return false;
            }
        }
        return true;
    }
}
public class SortCheckBruite {
    public static void main(String[] args){
        int[] arr = {1,2,5,7,9};
        int n = arr.length;

        SortCheck1 sc = new SortCheck1();

        boolean correct = sc.SortCheck(arr,n);

        if (correct) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

}
