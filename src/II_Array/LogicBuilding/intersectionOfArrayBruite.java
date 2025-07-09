import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class intersectionOfArrayBruite{
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> list =new ArrayList<>();
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(list.contains(nums1[i])){
                continue;
                }
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        
        int[] answer=new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }

        return answer;
    }
    
    
    
    
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};
        
        // Create an instance of the Solution class
        intersectionOfArrayBruite finder = new intersectionOfArrayBruite();
        
        int[] ans = finder.intersectionArray(nums1, nums2);
        
        //Print the intersection of both arrays
        System.out.println("Intersection of nums1 and nums2 is:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
