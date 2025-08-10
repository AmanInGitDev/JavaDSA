package II_Array.Hard;
import java.util.Arrays;

public class mergeTwoSortedArrNoExtraSpaceBruite {
    public void merge(int[] nums1,int m,int[] nums2, int n){
        int left = m-1;
        int right=0;

        while(left>=0 && right < n){
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);

        for(int i = m; i < m+n; i++){
            nums1[i]=nums2[i-m];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int[] nums2 = {-3, 1, 8};
        int m = 4, n = 3;

        mergeTwoSortedArrNoExtraSpaceBruite sol = new mergeTwoSortedArrNoExtraSpaceBruite();

        sol.merge(nums1, m, nums2, n);

        System.out.println("The merged arrays is:");
        System.out.print("nums1[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}