package II_Array.Hard;

import java.util.*;

public class maxProdOfSubArrBruite {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        int currproduct=1;
        
        for(int i = 0; i <n; i++){
            for(int j = i ; j <= n; j++){
                
                for(int k = i; k < j; k++){
                    System.out.print(nums[k]+"  ");
                }
                System.out.println();
               
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                for (int k = i; k < j; k++) {
//                    System.out.print(nums[k] + " ");
//                }
//                System.out.println();
//            }
//        }
        
        return max;
    }
    
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 2};
        
        maxProdOfSubArrBruite sol = new maxProdOfSubArrBruite();
        int ans = sol.maxProduct(nums);
        
        System.out.println("The product of elements in maximum product subarray is: " + ans);
    }
}
