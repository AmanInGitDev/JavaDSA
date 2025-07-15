import java.util.*;

public class numberOfTimesArrRotated {
    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;
        
        while (low < high) {
            int mid = (low + high) / 2;
            
            if (nums.get(mid) > nums.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));  // Renamed arr to nums
        numberOfTimesArrRotated sol = new numberOfTimesArrRotated();
        int ans = sol.findKRotation(nums);
        System.out.println("The array is rotated " + ans + " times.");
    }
}
