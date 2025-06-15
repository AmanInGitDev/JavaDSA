package Striver_Basics.III_BasicArray;

class SortCheck2{
    public boolean SortCheck(int[] arr, int n){
        for (int i = 0; i < n-1; i++){
                if(arr[i]>arr[i+1]) return false;
            }
        return true;
    }
}
public class SortCheckOpti {
    public static void main(String[] args){
        int[] arr = {1,2,5,7,9};
        int n = arr.length;

        SortCheck2 sc = new SortCheck2();

        boolean correct = sc.SortCheck(arr,n);

        if (correct) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

}
