package II_Array.Hard;

public class maximumProdSubarrBruite {
    public static int maxProduct(int[] nums) {
        int n = nums.length;

        int maxprod = nums[0];

        for(int i = 0 ;i < n; i++){
           int prod = 1;
           for(int j=i;j<n;j++){
             prod*=nums[j];
           }
            maxprod=Math.max(prod,maxprod);
        }
        return  maxprod;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 7, 1, 2};
        maximumProdSubarrBruite sol = new maximumProdSubarrBruite();

        int maxProd = sol.maxProduct(nums);
        System.out.println("The maximum product subarray: " + maxProd);
    }
}