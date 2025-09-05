package II_Array.Leetcode;

public class L1299 {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i+1; j < n; j++){
                max = Math.max(max, arr[j]);
            }
            
            arr[i] = max;
        }
        arr[n-1] = -1;
        return arr;
    }
    public static void main(String[] args) {
        L1299 sol = new L1299();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = sol.replaceElements(arr);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}